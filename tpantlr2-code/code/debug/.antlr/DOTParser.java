// Generated from e:\code\Complier\ANTLR\study\tpantlr2-code\code\debug\DOT.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DOTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, STRICT=12, GRAPH=13, DIGRAPH=14, NODE=15, EDGE=16, 
		SUBGRAPH=17, NUMBER=18, STRING=19, HTML_STRING=20, TAG=21, EntityRef=22, 
		ID=23, COMMENT=24, LINE_COMMENT=25, PREPROC=26, WS=27;
	public static final int
		RULE_graph = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_attr_stmt = 3, 
		RULE_attr_list = 4, RULE_a_list = 5, RULE_edge_stmt = 6, RULE_edgeRHS = 7, 
		RULE_edgeop = 8, RULE_node_stmt = 9, RULE_node_id = 10, RULE_port = 11, 
		RULE_subgraph = 12, RULE_compass_pt = 13, RULE_id = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"graph", "stmt_list", "stmt", "attr_stmt", "attr_list", "a_list", "edge_stmt", 
			"edgeRHS", "edgeop", "node_stmt", "node_id", "port", "subgraph", "compass_pt", 
			"id"
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

	@Override
	public String getGrammarFileName() { return "DOT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DOTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GraphContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode GRAPH() { return getToken(DOTParser.GRAPH, 0); }
		public TerminalNode DIGRAPH() { return getToken(DOTParser.DIGRAPH, 0); }
		public TerminalNode STRICT() { return getToken(DOTParser.STRICT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(30);
				match(STRICT);
				}
			}

			setState(33);
			_la = _input.LA(1);
			if ( !(_la==GRAPH || _la==DIGRAPH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << HTML_STRING) | (1L << ID))) != 0)) {
				{
				setState(34);
				id();
				}
			}

			setState(37);
			match(T__0);
			setState(38);
			stmt_list();
			setState(39);
			match(T__1);
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

	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << GRAPH) | (1L << NODE) | (1L << EDGE) | (1L << SUBGRAPH) | (1L << NUMBER) | (1L << STRING) | (1L << HTML_STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(41);
				stmt();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(42);
					match(T__2);
					}
				}

				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StmtContext extends ParserRuleContext {
		public Node_stmtContext node_stmt() {
			return getRuleContext(Node_stmtContext.class,0);
		}
		public Edge_stmtContext edge_stmt() {
			return getRuleContext(Edge_stmtContext.class,0);
		}
		public Attr_stmtContext attr_stmt() {
			return getRuleContext(Attr_stmtContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				node_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				edge_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				attr_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				id();
				setState(54);
				match(T__3);
				setState(55);
				id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				subgraph();
				}
				break;
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

	public static class Attr_stmtContext extends ParserRuleContext {
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public TerminalNode GRAPH() { return getToken(DOTParser.GRAPH, 0); }
		public TerminalNode NODE() { return getToken(DOTParser.NODE, 0); }
		public TerminalNode EDGE() { return getToken(DOTParser.EDGE, 0); }
		public Attr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_stmt; }
	}

	public final Attr_stmtContext attr_stmt() throws RecognitionException {
		Attr_stmtContext _localctx = new Attr_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << NODE) | (1L << EDGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(61);
			attr_list();
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

	public static class Attr_listContext extends ParserRuleContext {
		public List<A_listContext> a_list() {
			return getRuleContexts(A_listContext.class);
		}
		public A_listContext a_list(int i) {
			return getRuleContext(A_listContext.class,i);
		}
		public Attr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_list; }
	}

	public final Attr_listContext attr_list() throws RecognitionException {
		Attr_listContext _localctx = new Attr_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				match(T__4);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << HTML_STRING) | (1L << ID))) != 0)) {
					{
					setState(64);
					a_list();
					}
				}

				setState(67);
				match(T__5);
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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

	public static class A_listContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public A_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_list; }
	}

	public final A_listContext a_list() throws RecognitionException {
		A_listContext _localctx = new A_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_a_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				id();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(73);
					match(T__3);
					setState(74);
					id();
					}
				}

				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(77);
					match(T__6);
					}
				}

				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << HTML_STRING) | (1L << ID))) != 0) );
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

	public static class Edge_stmtContext extends ParserRuleContext {
		public EdgeRHSContext edgeRHS() {
			return getRuleContext(EdgeRHSContext.class,0);
		}
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Edge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_stmt; }
	}

	public final Edge_stmtContext edge_stmt() throws RecognitionException {
		Edge_stmtContext _localctx = new Edge_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_edge_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING:
			case HTML_STRING:
			case ID:
				{
				setState(84);
				node_id();
				}
				break;
			case T__0:
			case SUBGRAPH:
				{
				setState(85);
				subgraph();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(88);
			edgeRHS();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(89);
				attr_list();
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

	public static class EdgeRHSContext extends ParserRuleContext {
		public List<EdgeopContext> edgeop() {
			return getRuleContexts(EdgeopContext.class);
		}
		public EdgeopContext edgeop(int i) {
			return getRuleContext(EdgeopContext.class,i);
		}
		public List<Node_idContext> node_id() {
			return getRuleContexts(Node_idContext.class);
		}
		public Node_idContext node_id(int i) {
			return getRuleContext(Node_idContext.class,i);
		}
		public List<SubgraphContext> subgraph() {
			return getRuleContexts(SubgraphContext.class);
		}
		public SubgraphContext subgraph(int i) {
			return getRuleContext(SubgraphContext.class,i);
		}
		public EdgeRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeRHS; }
	}

	public final EdgeRHSContext edgeRHS() throws RecognitionException {
		EdgeRHSContext _localctx = new EdgeRHSContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_edgeRHS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				edgeop();
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
				case STRING:
				case HTML_STRING:
				case ID:
					{
					setState(93);
					node_id();
					}
					break;
				case T__0:
				case SUBGRAPH:
					{
					setState(94);
					subgraph();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 || _la==T__8 );
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

	public static class EdgeopContext extends ParserRuleContext {
		public EdgeopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeop; }
	}

	public final EdgeopContext edgeop() throws RecognitionException {
		EdgeopContext _localctx = new EdgeopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_edgeop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Node_stmtContext extends ParserRuleContext {
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Node_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_stmt; }
	}

	public final Node_stmtContext node_stmt() throws RecognitionException {
		Node_stmtContext _localctx = new Node_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_node_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			node_id();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(104);
				attr_list();
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

	public static class Node_idContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public Node_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_id; }
	}

	public final Node_idContext node_id() throws RecognitionException {
		Node_idContext _localctx = new Node_idContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_node_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			id();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(108);
				port();
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

	public static class PortContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Compass_ptContext compass_pt() {
			return getRuleContext(Compass_ptContext.class,0);
		}
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_port);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__9);
				setState(112);
				id();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(113);
					match(T__9);
					setState(114);
					compass_pt();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__9);
				setState(118);
				compass_pt();
				}
				break;
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

	public static class SubgraphContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode SUBGRAPH() { return getToken(DOTParser.SUBGRAPH, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SubgraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subgraph; }
	}

	public final SubgraphContext subgraph() throws RecognitionException {
		SubgraphContext _localctx = new SubgraphContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_subgraph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBGRAPH) {
				{
				setState(121);
				match(SUBGRAPH);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << HTML_STRING) | (1L << ID))) != 0)) {
					{
					setState(122);
					id();
					}
				}

				}
			}

			setState(127);
			match(T__0);
			setState(128);
			stmt_list();
			setState(129);
			match(T__1);
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

	public static class Compass_ptContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DOTParser.ID, 0); }
		public Compass_ptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compass_pt; }
	}

	public final Compass_ptContext compass_pt() throws RecognitionException {
		Compass_ptContext _localctx = new Compass_ptContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compass_pt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DOTParser.ID, 0); }
		public TerminalNode STRING() { return getToken(DOTParser.STRING, 0); }
		public TerminalNode HTML_STRING() { return getToken(DOTParser.HTML_STRING, 0); }
		public TerminalNode NUMBER() { return getToken(DOTParser.NUMBER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << HTML_STRING) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\5\2\"\n\2\3\2"+
		"\3\2\5\2&\n\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3.\n\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\6\3\6\5\6"+
		"D\n\6\3\6\6\6G\n\6\r\6\16\6H\3\7\3\7\3\7\5\7N\n\7\3\7\5\7Q\n\7\6\7S\n"+
		"\7\r\7\16\7T\3\b\3\b\5\bY\n\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\5\tb\n\t\6"+
		"\td\n\t\r\t\16\te\3\n\3\n\3\13\3\13\5\13l\n\13\3\f\3\f\5\fp\n\f\3\r\3"+
		"\r\3\r\3\r\5\rv\n\r\3\r\3\r\5\rz\n\r\3\16\3\16\5\16~\n\16\5\16\u0080\n"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36\2\7\3\2\17\20\4\2\17\17\21\22\3\2\n\13\4\2\r"+
		"\r\31\31\4\2\24\26\31\31\2\u0091\2!\3\2\2\2\4\61\3\2\2\2\6<\3\2\2\2\b"+
		">\3\2\2\2\nF\3\2\2\2\fR\3\2\2\2\16X\3\2\2\2\20c\3\2\2\2\22g\3\2\2\2\24"+
		"i\3\2\2\2\26m\3\2\2\2\30y\3\2\2\2\32\177\3\2\2\2\34\u0085\3\2\2\2\36\u0087"+
		"\3\2\2\2 \"\7\16\2\2! \3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#%\t\2\2\2$&\5\36"+
		"\20\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\'(\7\3\2\2()\5\4\3\2)*\7\4\2\2*\3"+
		"\3\2\2\2+-\5\6\4\2,.\7\5\2\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/+\3\2\2\2"+
		"\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2\64"+
		"=\5\24\13\2\65=\5\16\b\2\66=\5\b\5\2\678\5\36\20\289\7\6\2\29:\5\36\20"+
		"\2:=\3\2\2\2;=\5\32\16\2<\64\3\2\2\2<\65\3\2\2\2<\66\3\2\2\2<\67\3\2\2"+
		"\2<;\3\2\2\2=\7\3\2\2\2>?\t\3\2\2?@\5\n\6\2@\t\3\2\2\2AC\7\7\2\2BD\5\f"+
		"\7\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EG\7\b\2\2FA\3\2\2\2GH\3\2\2\2HF\3\2"+
		"\2\2HI\3\2\2\2I\13\3\2\2\2JM\5\36\20\2KL\7\6\2\2LN\5\36\20\2MK\3\2\2\2"+
		"MN\3\2\2\2NP\3\2\2\2OQ\7\t\2\2PO\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RJ\3\2\2\2"+
		"ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\r\3\2\2\2VY\5\26\f\2WY\5\32\16\2XV\3\2"+
		"\2\2XW\3\2\2\2YZ\3\2\2\2Z\\\5\20\t\2[]\5\n\6\2\\[\3\2\2\2\\]\3\2\2\2]"+
		"\17\3\2\2\2^a\5\22\n\2_b\5\26\f\2`b\5\32\16\2a_\3\2\2\2a`\3\2\2\2bd\3"+
		"\2\2\2c^\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\21\3\2\2\2gh\t\4\2\2h"+
		"\23\3\2\2\2ik\5\26\f\2jl\5\n\6\2kj\3\2\2\2kl\3\2\2\2l\25\3\2\2\2mo\5\36"+
		"\20\2np\5\30\r\2on\3\2\2\2op\3\2\2\2p\27\3\2\2\2qr\7\f\2\2ru\5\36\20\2"+
		"st\7\f\2\2tv\5\34\17\2us\3\2\2\2uv\3\2\2\2vz\3\2\2\2wx\7\f\2\2xz\5\34"+
		"\17\2yq\3\2\2\2yw\3\2\2\2z\31\3\2\2\2{}\7\23\2\2|~\5\36\20\2}|\3\2\2\2"+
		"}~\3\2\2\2~\u0080\3\2\2\2\177{\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0082\7\3\2\2\u0082\u0083\5\4\3\2\u0083\u0084\7\4\2\2\u0084"+
		"\33\3\2\2\2\u0085\u0086\t\5\2\2\u0086\35\3\2\2\2\u0087\u0088\t\6\2\2\u0088"+
		"\37\3\2\2\2\26!%-\61<CHMPTX\\aekouy}\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}