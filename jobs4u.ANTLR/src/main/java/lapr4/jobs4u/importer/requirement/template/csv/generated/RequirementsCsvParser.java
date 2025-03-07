package lapr4.jobs4u.importer.requirement.template.csv.generated;
// Generated from RequirementsCsv.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RequirementsCsvParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TWO_DIGIT_NUMBER=3, NUMBER=4, LETTER=5, MEMBER=6, TEXT=7, 
		NEWLINE=8, WS=9;
	public static final int
		RULE_questions = 0, RULE_body = 1, RULE_questionBody = 2, RULE_answer = 3, 
		RULE_minimumRequirement = 4, RULE_question = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"questions", "body", "questionBody", "answer", "minimumRequirement", 
			"question"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TWO_DIGIT_NUMBER", "NUMBER", "LETTER", "MEMBER", "TEXT", 
			"NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RequirementsCsv.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RequirementsCsvParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RequirementsCsvParser.EOF, 0); }
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public QuestionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequirementsCsvListener ) ((RequirementsCsvListener)listener).enterQuestions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequirementsCsvListener ) ((RequirementsCsvListener)listener).exitQuestions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequirementsCsvVisitor ) return ((RequirementsCsvVisitor<? extends T>)visitor).visitQuestions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionsContext questions() throws RecognitionException {
		QuestionsContext _localctx = new QuestionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_questions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				question();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(RequirementsCsvParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(RequirementsCsvParser.TEXT, i);
		}
		public List<TerminalNode> TWO_DIGIT_NUMBER() { return getTokens(RequirementsCsvParser.TWO_DIGIT_NUMBER); }
		public TerminalNode TWO_DIGIT_NUMBER(int i) {
			return getToken(RequirementsCsvParser.TWO_DIGIT_NUMBER, i);
		}
		public List<TerminalNode> LETTER() { return getTokens(RequirementsCsvParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(RequirementsCsvParser.LETTER, i);
		}
		public List<TerminalNode> MEMBER() { return getTokens(RequirementsCsvParser.MEMBER); }
		public TerminalNode MEMBER(int i) {
			return getToken(RequirementsCsvParser.MEMBER, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequirementsCsvListener ) ((RequirementsCsvListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequirementsCsvListener ) ((RequirementsCsvListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequirementsCsvVisitor ) return ((RequirementsCsvVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__0);
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 232L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 232L) != 0) );
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(25);
				match(T__0);
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(26);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 232L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(29); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 232L) != 0) );
				setState(31);
				match(T__0);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 232L) != 0)) {
					{
					setState(33); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(32);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 232L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(35); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 232L) != 0) );
					}
				}

				}
				break;
			}
			setState(41);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionBodyContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public QuestionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequirementsCsvListener ) ((RequirementsCsvListener)listener).enterQuestionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequirementsCsvListener ) ((RequirementsCsvListener)listener).exitQuestionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequirementsCsvVisitor ) return ((RequirementsCsvVisitor<? extends T>)visitor).visitQuestionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionBodyContext questionBody() throws RecognitionException {
		QuestionBodyContext _localctx = new QuestionBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_questionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnswerContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequirementsCsvListener ) ((RequirementsCsvListener)listener).enterAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequirementsCsvListener ) ((RequirementsCsvListener)listener).exitAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequirementsCsvVisitor ) return ((RequirementsCsvVisitor<? extends T>)visitor).visitAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MinimumRequirementContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MinimumRequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minimumRequirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequirementsCsvListener ) ((RequirementsCsvListener)listener).enterMinimumRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequirementsCsvListener ) ((RequirementsCsvListener)listener).exitMinimumRequirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequirementsCsvVisitor ) return ((RequirementsCsvVisitor<? extends T>)visitor).visitMinimumRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinimumRequirementContext minimumRequirement() throws RecognitionException {
		MinimumRequirementContext _localctx = new MinimumRequirementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_minimumRequirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionContext extends ParserRuleContext {
		public QuestionBodyContext questionBody() {
			return getRuleContext(QuestionBodyContext.class,0);
		}
		public AnswerContext answer() {
			return getRuleContext(AnswerContext.class,0);
		}
		public MinimumRequirementContext minimumRequirement() {
			return getRuleContext(MinimumRequirementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(RequirementsCsvParser.NEWLINE, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RequirementsCsvListener ) ((RequirementsCsvListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RequirementsCsvListener ) ((RequirementsCsvListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RequirementsCsvVisitor ) return ((RequirementsCsvVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			questionBody();
			setState(50);
			match(T__1);
			setState(51);
			answer();
			setState(52);
			match(T__1);
			setState(53);
			minimumRequirement();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(54);
				match(NEWLINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\t:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001"+
		"\u0016\b\u0001\u000b\u0001\f\u0001\u0017\u0001\u0001\u0001\u0001\u0004"+
		"\u0001\u001c\b\u0001\u000b\u0001\f\u0001\u001d\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\"\b\u0001\u000b\u0001\f\u0001#\u0003\u0001&\b\u0001\u0003"+
		"\u0001(\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u00058\b\u0005\u0001"+
		"\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0001\u0002"+
		"\u0000\u0003\u0003\u0005\u0007:\u0000\r\u0001\u0000\u0000\u0000\u0002"+
		"\u0013\u0001\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u0006-\u0001"+
		"\u0000\u0000\u0000\b/\u0001\u0000\u0000\u0000\n1\u0001\u0000\u0000\u0000"+
		"\f\u000e\u0003\n\u0005\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u000f\u0001"+
		"\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0005\u0000"+
		"\u0000\u0001\u0012\u0001\u0001\u0000\u0000\u0000\u0013\u0015\u0005\u0001"+
		"\u0000\u0000\u0014\u0016\u0007\u0000\u0000\u0000\u0015\u0014\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\'\u0001\u0000\u0000"+
		"\u0000\u0019\u001b\u0005\u0001\u0000\u0000\u001a\u001c\u0007\u0000\u0000"+
		"\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f%\u0005\u0001\u0000\u0000"+
		" \"\u0007\u0000\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000"+
		"\u0000\u0000%!\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001"+
		"\u0000\u0000\u0000\'\u0019\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)*\u0005\u0001\u0000\u0000*\u0003\u0001"+
		"\u0000\u0000\u0000+,\u0003\u0002\u0001\u0000,\u0005\u0001\u0000\u0000"+
		"\u0000-.\u0003\u0002\u0001\u0000.\u0007\u0001\u0000\u0000\u0000/0\u0003"+
		"\u0002\u0001\u00000\t\u0001\u0000\u0000\u000012\u0003\u0004\u0002\u0000"+
		"23\u0005\u0002\u0000\u000034\u0003\u0006\u0003\u000045\u0005\u0002\u0000"+
		"\u000057\u0003\b\u0004\u000068\u0005\b\u0000\u000076\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008\u000b\u0001\u0000\u0000\u0000\u0007"+
		"\u000f\u0017\u001d#%\'7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}