package lapr4.jobs4u.recruitmentprocessmanagement.domain;

import eapli.framework.validations.Preconditions;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;

/**
 * @author 2DI2
 */
@MappedSuperclass
public abstract class Phase {

    @Embedded
    @AttributeOverride(name = "date", column = @Column(name = "initial_date"))
    private Date initialDate;

    @Embedded
    @AttributeOverride(name = "date", column = @Column(name = "final_date"))
    private Date finalDate;

    @Embedded
    private State state;

    protected Phase(final String initialDate, final String finalDate) {
        Preconditions.noneNull(new Object[] { initialDate, finalDate });
        final Date initialDateTemp = Date.valueOf(initialDate);
        final Date finalDateTemp = Date.valueOf(finalDate);
        if (initialDateTemp.isAfter(finalDateTemp)) {
            throw new IllegalArgumentException("Initial date cannot be after final date");
        }
        this.initialDate = initialDateTemp;
        this.finalDate = finalDateTemp;
        this.state = State.valueOf(ActivityState.CLOSED.toString());
    }

    protected Phase(final String initialDate, final String finalDate, final String minDate) {
        Preconditions.noneNull(new Object[] { initialDate, finalDate, minDate });
        final Date initialDateTemp = Date.valueOf(initialDate);
        final Date finalDateTemp = Date.valueOf(finalDate);
        final Date minDateTemp = Date.valueOf(minDate);
        if (initialDateTemp.isAfter(finalDateTemp) || initialDateTemp.isBefore(minDateTemp)) {
            throw new IllegalArgumentException("Initial date cannot be after final date or before min date");
        }
        this.initialDate = initialDateTemp;
        this.finalDate = finalDateTemp;
        this.state = State.valueOf(ActivityState.CLOSED.toString());
    }

    protected Phase() {
        this.initialDate = null;
        this.finalDate = null;
        this.state = null;
    }

    public Date initialDate() {
        return initialDate;
    }

    public Date finalDate() {
        return finalDate;
    }

    public State state() {
        return state;
    }

    public void changeInitialDate(final String initialDate) {
        Date newInitalDate = Date.valueOf(initialDate);
        if (newInitalDate.isAfter(this.finalDate)) {
            throw new IllegalArgumentException("Initial date cannot be after final date");
        }
        this.initialDate = newInitalDate;
    }

    public void changeFinalDate(final String finalDate) {
        Date newFinalDate = Date.valueOf(finalDate);
        if (this.initialDate.isAfter(newFinalDate)) {
            throw new IllegalArgumentException("Initial date cannot be after final date");
        }
        this.finalDate = newFinalDate;
    }

    public void open() {
        if (this.state.equals(State.valueOf(ActivityState.CLOSED.toString()))) {
            this.state = State.valueOf(ActivityState.OPEN.toString());
        } else {
            throw new IllegalStateException("Phase is already open");
        }
    }

    public void close() {
        if (this.state.equals(State.valueOf(ActivityState.OPEN.toString()))) {
            this.state = State.valueOf(ActivityState.CLOSED.toString());
        } else {
            throw new IllegalStateException("Phase is already closed");
        }
    }

    @Override
    public String toString() {
        return "Initial Date: " + initialDate + "\nFinal Date: " + finalDate;
    }
}
