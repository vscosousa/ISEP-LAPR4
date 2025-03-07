package lapr4.jobs4u.integrations.plugins.question.interview;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

import lapr4.jobs4u.importer.interview.template.xml.generated.InterviewXmlBaseListener;
import lapr4.jobs4u.importer.interview.template.xml.generated.InterviewXmlParser;
import lapr4.jobs4u.questionmanagement.domain.Answer;
import lapr4.jobs4u.questionmanagement.domain.Cotation;
import lapr4.jobs4u.questionmanagement.domain.InterviewAnswer;
import lapr4.jobs4u.questionmanagement.dto.InterviewQuestionDTO;

/**
 * @author 2DI2
 */
public class InterviewXmlListener extends InterviewXmlBaseListener {

    private final List<InterviewQuestionDTO> questions = new ArrayList<>();
    private InterviewQuestionDTO current;
    private List<InterviewAnswer> answers;
    private Answer answer;

    @Override
    public void enterQuestion(final InterviewXmlParser.QuestionContext ctx) {
        answers = new ArrayList<>();
        current = new InterviewQuestionDTO();
    }

    @Override
    public void exitQuestion(final InterviewXmlParser.QuestionContext ctx) {
        questions.add(current);
    }

    @Override
    public void enterBody(final InterviewXmlParser.BodyContext ctx) {
        current.setBody(extractValue(ctx));
    }

    @Override
    public void enterQuestionCotation(final InterviewXmlParser.QuestionCotationContext ctx) {
        current.setCotation(extractValue(ctx));
    }

    @Override
    public void enterCotationType(final InterviewXmlParser.CotationTypeContext ctx) {
        current.setCotationType(extractValue(ctx));
    }

    @Override
    public void enterType(final InterviewXmlParser.TypeContext ctx) {
        current.setType(extractValue(ctx));
    }

    @Override
    public void enterAnswer(final InterviewXmlParser.AnswerContext ctx) {
        answer = Answer.valueOf(extractValue(ctx));
    }

    @Override
    public void enterAnswerCotation(final InterviewXmlParser.AnswerCotationContext ctx) {
        answers.add(new InterviewAnswer(answer, Cotation.valueOf(extractValue(ctx))));
        current.setPossibleAnswers(answers);
    }

    private String extractValue(final ParserRuleContext ctx) {
        final Token startToken = ctx.getStart();
        final Token stopToken = ctx.getStop();
        final Interval interval = new Interval(startToken.getStartIndex(), stopToken.getStopIndex());
        final String intervalText = ctx.start.getInputStream().getText(interval);
        return intervalText.replaceAll("<[^>]+>", "").trim();
    }

    public List<InterviewQuestionDTO> questions() {
        return questions;
    }
}
