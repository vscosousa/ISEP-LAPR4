package lapr4.jobs4u.app.backoffice.console.presentation.authz;

import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import lapr4.jobs4u.app.backoffice.console.presentation.authz.printer.JobOpeningPrinter;
import lapr4.jobs4u.applicationmanagement.application.PublishResultsController;
import lapr4.jobs4u.infrastructure.persistence.PersistenceContext;
import lapr4.jobs4u.jobopeningmanagement.application.ListJobOpeningsController;
import lapr4.jobs4u.jobopeningmanagement.domain.JobOpening;
import lapr4.jobs4u.jobopeningmanagement.dto.JobOpeningDTO;
import lapr4.jobs4u.recruitmentprocessmanagement.application.OpenOrClosePhaseController;

/**
 * @author 2DI2
 */
public class PublishResultsUI extends AbstractUI {

    private static final String PHASE = "ResultPhase";
    private final TransactionalContext txCtx = PersistenceContext.repositories().newTransactionalContext();
    private final ListJobOpeningsController listJobOpeningsController = new ListJobOpeningsController(
            PersistenceContext.repositories().jobOpenings(), AuthzRegistry.authorizationService());
    private final PublishResultsController publishResultsController = new PublishResultsController(
            PersistenceContext.repositories().applications(txCtx), PersistenceContext.repositories().ranks(),
            PersistenceContext.repositories().interviews(),
            PersistenceContext.repositories().requirements(),
            PersistenceContext.repositories().newTransactionalContext(),
            AuthzRegistry.authorizationService());
    private final OpenOrClosePhaseController openOrClosePhaseController = new OpenOrClosePhaseController(
            PersistenceContext.repositories().recruitmentProcesses(txCtx),
            PersistenceContext.repositories().jobOpenings(txCtx),
            PersistenceContext.repositories().jobOpeningRequirements(),
            PersistenceContext.repositories().jobOpeningInterviews(), PersistenceContext.repositories().applications(),
            PersistenceContext.repositories().requirements(), PersistenceContext.repositories().interviews(),
            AuthzRegistry.authorizationService(), txCtx);

    @Override
    protected boolean doShow() {

        final Iterable<JobOpeningDTO> jobOpeningsList = listJobOpeningsController.filterWithAvailableForResults();

        final SelectWidget<JobOpeningDTO> selector = new SelectWidget<>("Job Openings:", jobOpeningsList,
                new JobOpeningPrinter());
        selector.show();
        final JobOpeningDTO jobOpeningDto = selector.selectedElement();
        if (jobOpeningDto == null) {
            return false;
        }

        final JobOpening selectedJobOpening = listJobOpeningsController.selectedJobOpening(jobOpeningDto);

        try {
            publishResultsController.publishResults(selectedJobOpening);
            System.out.println("Results published successfully and emails sent to the envolved parties.");
            openOrClosePhaseController.changePhase(PHASE, selectedJobOpening, true);
            System.out.println("Job Opening closed successfully.");
        } catch (final Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

        return false;
    }

    @Override
    public String headline() {
        return "Publish Results";
    }
}
