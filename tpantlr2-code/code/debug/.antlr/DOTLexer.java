// Generated from e:\code\Complier\ANTLR\study\tpantlr2-code\code\debug\DOT.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DOTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, STRICT=12, GRAPH=13, DIGRAPH=14, NODE=15, EDGE=16, 
		SUBGRAPH=17, NUMBER=18, STRING=19, HTML_STRING=20, TAG=21, EntityRef=22, 
		ID=23, COMMENT=24, LINE_COMMENT=25, PREPROC=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "STRICT", "GRAPH", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", 
			"NUMBER", "DIGIT", "STRING", "HTML_STRING", "TAG", "EntityRef", "ID", 
			"LETTER", "COMMENT", "LINE_COMMENT", "PREPROC", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'['", "']'", "','", "'->'", "'--'", 
			"':'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"STRICT", "GRAPH", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", "NUMBER", "STRING", 
			"HTML_STRING", "TAG", "EntityRef", "ID", "COMMENT", "LINE_COMMENT", "PREPROC", 
			"WS"
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


	public DOTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DOT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 25:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			LINE_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00f5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\5\23\177\n\23\3\23\3\23\6\23\u0083\n\23\r\23\16\23\u0084\3\23\6\23\u0088"+
		"\n\23\r\23\16\23\u0089\3\23\3\23\7\23\u008e\n\23\f\23\16\23\u0091\13\23"+
		"\5\23\u0093\n\23\5\23\u0095\n\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u009d"+
		"\n\25\f\25\16\25\u00a0\13\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00a8"+
		"\n\26\f\26\16\26\u00ab\13\26\3\26\3\26\3\27\3\27\7\27\u00b1\n\27\f\27"+
		"\16\27\u00b4\13\27\3\27\3\27\3\30\3\30\6\30\u00ba\n\30\r\30\16\30\u00bb"+
		"\3\30\3\30\3\31\3\31\3\31\7\31\u00c3\n\31\f\31\16\31\u00c6\13\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\7\33\u00ce\n\33\f\33\16\33\u00d1\13\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00dc\n\34\f\34\16\34\u00df"+
		"\13\34\3\34\5\34\u00e2\n\34\3\34\3\34\3\34\3\35\3\35\7\35\u00e9\n\35\f"+
		"\35\16\35\u00ec\13\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\u009e"+
		"\u00b2\u00cf\u00dd\u00ea\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\25+\26-\27/\30\61"+
		"\31\63\2\65\32\67\339\34;\35\3\2\23\4\2UUuu\4\2VVvv\4\2TTtt\4\2KKkk\4"+
		"\2EEee\4\2IIii\4\2CCcc\4\2RRrr\4\2JJjj\4\2FFff\4\2PPpp\4\2QQqq\4\2GGg"+
		"g\4\2WWww\4\2DDdd\6\2C\\aac|\u0082\u0101\5\2\13\f\17\17\"\"\2\u0105\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2"+
		"\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2"+
		"\23N\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33\\\3\2\2\2\35b\3\2"+
		"\2\2\37j\3\2\2\2!o\3\2\2\2#t\3\2\2\2%~\3\2\2\2\'\u0096\3\2\2\2)\u0098"+
		"\3\2\2\2+\u00a3\3\2\2\2-\u00ae\3\2\2\2/\u00b7\3\2\2\2\61\u00bf\3\2\2\2"+
		"\63\u00c7\3\2\2\2\65\u00c9\3\2\2\2\67\u00d7\3\2\2\29\u00e6\3\2\2\2;\u00f1"+
		"\3\2\2\2=>\7}\2\2>\4\3\2\2\2?@\7\177\2\2@\6\3\2\2\2AB\7=\2\2B\b\3\2\2"+
		"\2CD\7?\2\2D\n\3\2\2\2EF\7]\2\2F\f\3\2\2\2GH\7_\2\2H\16\3\2\2\2IJ\7.\2"+
		"\2J\20\3\2\2\2KL\7/\2\2LM\7@\2\2M\22\3\2\2\2NO\7/\2\2OP\7/\2\2P\24\3\2"+
		"\2\2QR\7<\2\2R\26\3\2\2\2ST\7a\2\2T\30\3\2\2\2UV\t\2\2\2VW\t\3\2\2WX\t"+
		"\4\2\2XY\t\5\2\2YZ\t\6\2\2Z[\t\3\2\2[\32\3\2\2\2\\]\t\7\2\2]^\t\4\2\2"+
		"^_\t\b\2\2_`\t\t\2\2`a\t\n\2\2a\34\3\2\2\2bc\t\13\2\2cd\t\5\2\2de\t\7"+
		"\2\2ef\t\4\2\2fg\t\b\2\2gh\t\t\2\2hi\t\n\2\2i\36\3\2\2\2jk\t\f\2\2kl\t"+
		"\r\2\2lm\t\13\2\2mn\t\16\2\2n \3\2\2\2op\t\16\2\2pq\t\13\2\2qr\t\7\2\2"+
		"rs\t\16\2\2s\"\3\2\2\2tu\t\2\2\2uv\t\17\2\2vw\t\20\2\2wx\t\7\2\2xy\t\4"+
		"\2\2yz\t\b\2\2z{\t\t\2\2{|\t\n\2\2|$\3\2\2\2}\177\7/\2\2~}\3\2\2\2~\177"+
		"\3\2\2\2\177\u0094\3\2\2\2\u0080\u0082\7\60\2\2\u0081\u0083\5\'\24\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0095\3\2\2\2\u0086\u0088\5\'\24\2\u0087\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0092\3\2"+
		"\2\2\u008b\u008f\7\60\2\2\u008c\u008e\5\'\24\2\u008d\u008c\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0080\3\2\2\2\u0094\u0087\3\2\2\2\u0095&\3\2\2\2"+
		"\u0096\u0097\4\62;\2\u0097(\3\2\2\2\u0098\u009e\7$\2\2\u0099\u009a\7^"+
		"\2\2\u009a\u009d\7$\2\2\u009b\u009d\13\2\2\2\u009c\u0099\3\2\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009f\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7$\2\2\u00a2"+
		"*\3\2\2\2\u00a3\u00a9\7>\2\2\u00a4\u00a8\5-\27\2\u00a5\u00a8\5/\30\2\u00a6"+
		"\u00a8\13\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3"+
		"\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7@\2\2\u00ad,\3\2\2\2\u00ae"+
		"\u00b2\7>\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6.\3\2\2\2\u00b7\u00b9\7(\2\2\u00b8"+
		"\u00ba\5\63\32\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7=\2\2\u00be"+
		"\60\3\2\2\2\u00bf\u00c4\5\63\32\2\u00c0\u00c3\5\63\32\2\u00c1\u00c3\5"+
		"\'\24\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\62\3\2\2\2\u00c6\u00c4\3\2\2"+
		"\2\u00c7\u00c8\t\21\2\2\u00c8\64\3\2\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb"+
		"\7,\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00ce\13\2\2\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7,\2\2\u00d3\u00d4\7\61\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\b\33\2\2\u00d6\66\3\2\2\2\u00d7\u00d8\7\61"+
		"\2\2\u00d8\u00d9\7\61\2\2\u00d9\u00dd\3\2\2\2\u00da\u00dc\13\2\2\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00de\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e2\7\17\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\f"+
		"\2\2\u00e4\u00e5\b\34\3\2\u00e58\3\2\2\2\u00e6\u00ea\7%\2\2\u00e7\u00e9"+
		"\13\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00eb\3\2\2\2"+
		"\u00ea\u00e8\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee"+
		"\7\f\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b\35\4\2\u00f0:\3\2\2\2\u00f1"+
		"\u00f2\t\22\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\36\4\2\u00f4<\3\2\2"+
		"\2\25\2~\u0084\u0089\u008f\u0092\u0094\u009c\u009e\u00a7\u00a9\u00b2\u00bb"+
		"\u00c2\u00c4\u00cf\u00dd\u00e1\u00ea\5\3\33\2\3\34\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}