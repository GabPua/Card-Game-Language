// Generated from c:/Users/User/Documents/School/A.Y. 2023-2024 Term 1/CSC617M/MP Final/antlr_src/Card.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CardParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_CB=1, CLOSE_CB=2, OPEN_PAR=3, CLOSE_PAR=4, OPEN_SB=5, CLOSE_SB=6, 
		SEMICOLON=7, COLON=8, COMMA=9, DATA_TYPE=10, INT=11, STRING=12, ACTION_STACK=13, 
		NULL=14, ADD_OP=15, SUB_OP=16, MULT_OP=17, DIV_OP=18, MOD_OP=19, EQ_OP=20, 
		NEQ_OP=21, GEQ_OP=22, GT_OP=23, LEQ_OP=24, LT_OP=25, AND_OP=26, OR_OP=27, 
		NOT_OP=28, ASSIGN_OP=29, DOT_OP=30, IF=31, ELSE=32, FOREACH=33, REPEAT=34, 
		UNTIL=35, BREAK=36, CONTINUE=37, NEW=38, FUNC=39, RETURN=40, ENUM=41, 
		COMBI=42, ROUND=43, END=44, PASS=45, DISPBRD=46, PICK=47, GETINT=48, GETSTR=49, 
		PRINT=50, PRINTLN=51, TO=52, FROM=53, DEAL=54, DRAW=55, MOVE=56, PLAY=57, 
		SHUFFLE=58, PEEK=59, IDENTIFIER=60, COMMENT=61, WS=62;
	public static final int
		RULE_start_ = 0, RULE_program = 1, RULE_setup_block = 2, RULE_setup_content = 3, 
		RULE_function_block = 4, RULE_function_header = 5, RULE_formal_params = 6, 
		RULE_enum_block = 7, RULE_enum_header = 8, RULE_enum_body = 9, RULE_obj_defn = 10, 
		RULE_round_block = 11, RULE_setup_code_block = 12, RULE_func_code_block = 13, 
		RULE_func_loop_code_block = 14, RULE_round_code_block = 15, RULE_round_loop_code_block = 16, 
		RULE_loop_code_block = 17, RULE_statement = 18, RULE_setup_stmt = 19, 
		RULE_func_stmt = 20, RULE_func_loop_stmt = 21, RULE_round_stmt = 22, RULE_round_loop_stmt = 23, 
		RULE_loop_stmt = 24, RULE_declare_stmt = 25, RULE_declare_body = 26, RULE_declare_content = 27, 
		RULE_assign_body = 28, RULE_assignee = 29, RULE_entity = 30, RULE_array_body = 31, 
		RULE_object_body = 32, RULE_object_content = 33, RULE_expression = 34, 
		RULE_operator1 = 35, RULE_operator2 = 36, RULE_operator3 = 37, RULE_operator4 = 38, 
		RULE_if_stmt = 39, RULE_if_header = 40, RULE_foreach_stmt = 41, RULE_foreach_header = 42, 
		RULE_repeat_stmt = 43, RULE_repeat_header = 44, RULE_loop_if_stmt = 45, 
		RULE_func_if_stmt = 46, RULE_func_foreach_stmt = 47, RULE_func_repeat_stmt = 48, 
		RULE_func_loop_if_stmt = 49, RULE_round_if_stmt = 50, RULE_round_foreach_stmt = 51, 
		RULE_round_repeat_stmt = 52, RULE_round_loop_if_stmt = 53, RULE_block_stmt = 54, 
		RULE_func_block_stmt = 55, RULE_func_loop_block_stmt = 56, RULE_round_block_stmt = 57, 
		RULE_round_loop_block_stmt = 58, RULE_loop_block_stmt = 59, RULE_break_stmt = 60, 
		RULE_continue_stmt = 61, RULE_return_stmt = 62, RULE_end_stmt = 63, RULE_pass_stmt = 64, 
		RULE_function_call = 65, RULE_actual_params = 66, RULE_pick_expr = 67, 
		RULE_getint_expr = 68, RULE_getstr_expr = 69, RULE_print_stmt = 70, RULE_deal_stmt = 71, 
		RULE_draw_stmt = 72, RULE_move_stmt = 73, RULE_play_stmt = 74, RULE_shuffle_stmt = 75, 
		RULE_peek_stmt = 76, RULE_action_stack_expr = 77;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_", "program", "setup_block", "setup_content", "function_block", 
			"function_header", "formal_params", "enum_block", "enum_header", "enum_body", 
			"obj_defn", "round_block", "setup_code_block", "func_code_block", "func_loop_code_block", 
			"round_code_block", "round_loop_code_block", "loop_code_block", "statement", 
			"setup_stmt", "func_stmt", "func_loop_stmt", "round_stmt", "round_loop_stmt", 
			"loop_stmt", "declare_stmt", "declare_body", "declare_content", "assign_body", 
			"assignee", "entity", "array_body", "object_body", "object_content", 
			"expression", "operator1", "operator2", "operator3", "operator4", "if_stmt", 
			"if_header", "foreach_stmt", "foreach_header", "repeat_stmt", "repeat_header", 
			"loop_if_stmt", "func_if_stmt", "func_foreach_stmt", "func_repeat_stmt", 
			"func_loop_if_stmt", "round_if_stmt", "round_foreach_stmt", "round_repeat_stmt", 
			"round_loop_if_stmt", "block_stmt", "func_block_stmt", "func_loop_block_stmt", 
			"round_block_stmt", "round_loop_block_stmt", "loop_block_stmt", "break_stmt", 
			"continue_stmt", "return_stmt", "end_stmt", "pass_stmt", "function_call", 
			"actual_params", "pick_expr", "getint_expr", "getstr_expr", "print_stmt", 
			"deal_stmt", "draw_stmt", "move_stmt", "play_stmt", "shuffle_stmt", "peek_stmt", 
			"action_stack_expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "':'", "','", 
			null, null, null, "'ActionStack'", "'null'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'and'", "'or'", 
			"'not'", "'='", "'.'", "'if'", "'else'", "'foreach'", "'repeat'", "'until'", 
			"'break'", "'continue'", "'new'", "'function'", "'return'", "'enum'", 
			"'Combination'", "'Round'", "'End'", "'Pass'", "'DisplayBoard'", "'Pick'", 
			"'GetInt'", "'GetString'", "'Print'", "'Println'", "'To'", "'From'", 
			"'Deal'", "'Draw'", "'Move'", "'Play'", "'Shuffle'", "'Peek'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_CB", "CLOSE_CB", "OPEN_PAR", "CLOSE_PAR", "OPEN_SB", "CLOSE_SB", 
			"SEMICOLON", "COLON", "COMMA", "DATA_TYPE", "INT", "STRING", "ACTION_STACK", 
			"NULL", "ADD_OP", "SUB_OP", "MULT_OP", "DIV_OP", "MOD_OP", "EQ_OP", "NEQ_OP", 
			"GEQ_OP", "GT_OP", "LEQ_OP", "LT_OP", "AND_OP", "OR_OP", "NOT_OP", "ASSIGN_OP", 
			"DOT_OP", "IF", "ELSE", "FOREACH", "REPEAT", "UNTIL", "BREAK", "CONTINUE", 
			"NEW", "FUNC", "RETURN", "ENUM", "COMBI", "ROUND", "END", "PASS", "DISPBRD", 
			"PICK", "GETINT", "GETSTR", "PRINT", "PRINTLN", "TO", "FROM", "DEAL", 
			"DRAW", "MOVE", "PLAY", "SHUFFLE", "PEEK", "IDENTIFIER", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Card.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CardParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Start_Context extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CardParser.EOF, 0); }
		public Start_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_; }
	}

	public final Start_Context start_() throws RecognitionException {
		Start_Context _localctx = new Start_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			program();
			setState(157);
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
	public static class ProgramContext extends ParserRuleContext {
		public Setup_blockContext setup_block() {
			return getRuleContext(Setup_blockContext.class,0);
		}
		public Round_blockContext round_block() {
			return getRuleContext(Round_blockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			setup_block();
			setState(160);
			round_block();
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
	public static class Setup_blockContext extends ParserRuleContext {
		public List<Setup_contentContext> setup_content() {
			return getRuleContexts(Setup_contentContext.class);
		}
		public Setup_contentContext setup_content(int i) {
			return getRuleContext(Setup_contentContext.class,i);
		}
		public Setup_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup_block; }
	}

	public final Setup_blockContext setup_block() throws RecognitionException {
		Setup_blockContext _localctx = new Setup_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setup_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				setup_content();
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2112120633457409032L) != 0) );
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
	public static class Setup_contentContext extends ParserRuleContext {
		public Setup_stmtContext setup_stmt() {
			return getRuleContext(Setup_stmtContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Enum_blockContext enum_block() {
			return getRuleContext(Enum_blockContext.class,0);
		}
		public Obj_defnContext obj_defn() {
			return getRuleContext(Obj_defnContext.class,0);
		}
		public Setup_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup_content; }
	}

	public final Setup_contentContext setup_content() throws RecognitionException {
		Setup_contentContext _localctx = new Setup_contentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_setup_content);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				setup_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				function_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				enum_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				obj_defn();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_blockContext extends ParserRuleContext {
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public TerminalNode OPEN_CB() { return getToken(CardParser.OPEN_CB, 0); }
		public Func_code_blockContext func_code_block() {
			return getRuleContext(Func_code_blockContext.class,0);
		}
		public TerminalNode CLOSE_CB() { return getToken(CardParser.CLOSE_CB, 0); }
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			function_header();
			setState(174);
			match(OPEN_CB);
			setState(175);
			func_code_block();
			setState(176);
			match(CLOSE_CB);
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
	public static class Function_headerContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(CardParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CardParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CardParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(CardParser.CLOSE_PAR, 0); }
		public Formal_paramsContext formal_params() {
			return getRuleContext(Formal_paramsContext.class,0);
		}
		public TerminalNode DISPBRD() { return getToken(CardParser.DISPBRD, 0); }
		public Function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_header; }
	}

	public final Function_headerContext function_header() throws RecognitionException {
		Function_headerContext _localctx = new Function_headerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_header);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(FUNC);
				setState(179);
				match(IDENTIFIER);
				setState(180);
				match(OPEN_PAR);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DATA_TYPE) {
					{
					setState(181);
					formal_params();
					}
				}

				setState(184);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(FUNC);
				setState(186);
				match(DISPBRD);
				setState(187);
				match(OPEN_PAR);
				setState(188);
				match(CLOSE_PAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_paramsContext extends ParserRuleContext {
		public List<TerminalNode> DATA_TYPE() { return getTokens(CardParser.DATA_TYPE); }
		public TerminalNode DATA_TYPE(int i) {
			return getToken(CardParser.DATA_TYPE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CardParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CardParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CardParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CardParser.COMMA, i);
		}
		public Formal_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_params; }
	}

	public final Formal_paramsContext formal_params() throws RecognitionException {
		Formal_paramsContext _localctx = new Formal_paramsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formal_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(DATA_TYPE);
			setState(192);
			match(IDENTIFIER);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(193);
				match(COMMA);
				setState(194);
				match(DATA_TYPE);
				setState(195);
				match(IDENTIFIER);
				}
				}
				setState(200);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Enum_blockContext extends ParserRuleContext {
		public Enum_headerContext enum_header() {
			return getRuleContext(Enum_headerContext.class,0);
		}
		public TerminalNode OPEN_CB() { return getToken(CardParser.OPEN_CB, 0); }
		public Enum_bodyContext enum_body() {
			return getRuleContext(Enum_bodyContext.class,0);
		}
		public TerminalNode CLOSE_CB() { return getToken(CardParser.CLOSE_CB, 0); }
		public Enum_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_block; }
	}

	public final Enum_blockContext enum_block() throws RecognitionException {
		Enum_blockContext _localctx = new Enum_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enum_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			enum_header();
			setState(202);
			match(OPEN_CB);
			setState(203);
			enum_body();
			setState(204);
			match(CLOSE_CB);
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
	public static class Enum_headerContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(CardParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CardParser.IDENTIFIER, 0); }
		public Enum_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_header; }
	}

	public final Enum_headerContext enum_header() throws RecognitionException {
		Enum_headerContext _localctx = new Enum_headerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_enum_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ENUM);
			setState(207);
			match(IDENTIFIER);
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
	public static class Enum_bodyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CardParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CardParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CardParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CardParser.COMMA, i);
		}
		public Enum_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_body; }
	}

	public final Enum_bodyContext enum_body() throws RecognitionException {
		Enum_bodyContext _localctx = new Enum_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_enum_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(IDENTIFIER);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(210);
				match(COMMA);
				setState(211);
				match(IDENTIFIER);
				}
				}
				setState(216);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Obj_defnContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE() { return getToken(CardParser.DATA_TYPE, 0); }
		public TerminalNode DOT_OP() { return getToken(CardParser.DOT_OP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CardParser.IDENTIFIER, 0); }
		public Assign_bodyContext assign_body() {
			return getRuleContext(Assign_bodyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public Obj_defnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj_defn; }
	}

	public final Obj_defnContext obj_defn() throws RecognitionException {
		Obj_defnContext _localctx = new Obj_defnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_obj_defn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(DATA_TYPE);
			setState(218);
			match(DOT_OP);
			setState(219);
			match(IDENTIFIER);
			setState(220);
			assign_body();
			setState(221);
			match(SEMICOLON);
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
	public static class Round_blockContext extends ParserRuleContext {
		public TerminalNode ROUND() { return getToken(CardParser.ROUND, 0); }
		public TerminalNode OPEN_CB() { return getToken(CardParser.OPEN_CB, 0); }
		public Round_code_blockContext round_code_block() {
			return getRuleContext(Round_code_blockContext.class,0);
		}
		public TerminalNode CLOSE_CB() { return getToken(CardParser.CLOSE_CB, 0); }
		public Round_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round_block; }
	}

	public final Round_blockContext round_block() throws RecognitionException {
		Round_blockContext _localctx = new Round_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_round_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ROUND);
			setState(224);
			match(OPEN_CB);
			setState(225);
			round_code_block();
			setState(226);
			match(CLOSE_CB);
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
	public static class Setup_code_blockContext extends ParserRuleContext {
		public List<Setup_stmtContext> setup_stmt() {
			return getRuleContexts(Setup_stmtContext.class);
		}
		public Setup_stmtContext setup_stmt(int i) {
			return getRuleContext(Setup_stmtContext.class,i);
		}
		public Setup_code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup_code_block; }
	}

	public final Setup_code_blockContext setup_code_block() throws RecognitionException {
		Setup_code_blockContext _localctx = new Setup_code_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setup_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(228);
				setup_stmt();
				}
				}
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2112117884678339592L) != 0) );
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
	public static class Func_code_blockContext extends ParserRuleContext {
		public List<Func_stmtContext> func_stmt() {
			return getRuleContexts(Func_stmtContext.class);
		}
		public Func_stmtContext func_stmt(int i) {
			return getRuleContext(Func_stmtContext.class,i);
		}
		public Func_code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_code_block; }
	}

	public final Func_code_blockContext func_code_block() throws RecognitionException {
		Func_code_blockContext _localctx = new Func_code_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_func_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				func_stmt();
				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2112118984189967368L) != 0) );
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
	public static class Func_loop_code_blockContext extends ParserRuleContext {
		public List<Func_loop_stmtContext> func_loop_stmt() {
			return getRuleContexts(Func_loop_stmtContext.class);
		}
		public Func_loop_stmtContext func_loop_stmt(int i) {
			return getRuleContext(Func_loop_stmtContext.class,i);
		}
		public Func_loop_code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_loop_code_block; }
	}

	public final Func_loop_code_blockContext func_loop_code_block() throws RecognitionException {
		Func_loop_code_blockContext _localctx = new Func_loop_code_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_loop_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(238);
				func_loop_stmt();
				}
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2112119190348397576L) != 0) );
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
	public static class Round_code_blockContext extends ParserRuleContext {
		public List<Round_stmtContext> round_stmt() {
			return getRuleContexts(Round_stmtContext.class);
		}
		public Round_stmtContext round_stmt(int i) {
			return getRuleContext(Round_stmtContext.class,i);
		}
		public Round_code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round_code_block; }
	}

	public final Round_code_blockContext round_code_block() throws RecognitionException {
		Round_code_blockContext _localctx = new Round_code_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_round_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				round_stmt();
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2112170661236472840L) != 0) );
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
	public static class Round_loop_code_blockContext extends ParserRuleContext {
		public List<Round_loop_stmtContext> round_loop_stmt() {
			return getRuleContexts(Round_loop_stmtContext.class);
		}
		public Round_loop_stmtContext round_loop_stmt(int i) {
			return getRuleContext(Round_loop_stmtContext.class,i);
		}
		public Round_loop_code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round_loop_code_block; }
	}

	public final Round_loop_code_blockContext round_loop_code_block() throws RecognitionException {
		Round_loop_code_blockContext _localctx = new Round_loop_code_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_round_loop_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				round_loop_stmt();
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2112170867394903048L) != 0) );
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
	public static class Loop_code_blockContext extends ParserRuleContext {
		public List<Loop_stmtContext> loop_stmt() {
			return getRuleContexts(Loop_stmtContext.class);
		}
		public Loop_stmtContext loop_stmt(int i) {
			return getRuleContext(Loop_stmtContext.class,i);
		}
		public Loop_code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_code_block; }
	}

	public final Loop_code_blockContext loop_code_block() throws RecognitionException {
		Loop_code_blockContext _localctx = new Loop_code_blockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loop_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				loop_stmt();
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2112118090836769800L) != 0) );
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
	public static class StatementContext extends ParserRuleContext {
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public AssigneeContext assignee() {
			return getRuleContext(AssigneeContext.class,0);
		}
		public Assign_bodyContext assign_body() {
			return getRuleContext(Assign_bodyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Deal_stmtContext deal_stmt() {
			return getRuleContext(Deal_stmtContext.class,0);
		}
		public Draw_stmtContext draw_stmt() {
			return getRuleContext(Draw_stmtContext.class,0);
		}
		public Move_stmtContext move_stmt() {
			return getRuleContext(Move_stmtContext.class,0);
		}
		public Play_stmtContext play_stmt() {
			return getRuleContext(Play_stmtContext.class,0);
		}
		public Shuffle_stmtContext shuffle_stmt() {
			return getRuleContext(Shuffle_stmtContext.class,0);
		}
		public Peek_stmtContext peek_stmt() {
			return getRuleContext(Peek_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				declare_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				assignee(0);
				setState(260);
				assign_body();
				setState(261);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				expression(0);
				setState(264);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				deal_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				draw_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(268);
				move_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(269);
				play_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(270);
				shuffle_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(271);
				peek_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(272);
				print_stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Setup_stmtContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Foreach_stmtContext foreach_stmt() {
			return getRuleContext(Foreach_stmtContext.class,0);
		}
		public Repeat_stmtContext repeat_stmt() {
			return getRuleContext(Repeat_stmtContext.class,0);
		}
		public Setup_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup_stmt; }
	}

	public final Setup_stmtContext setup_stmt() throws RecognitionException {
		Setup_stmtContext _localctx = new Setup_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_setup_stmt);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case DATA_TYPE:
			case INT:
			case STRING:
			case ACTION_STACK:
			case NULL:
			case NOT_OP:
			case DISPBRD:
			case PICK:
			case GETINT:
			case GETSTR:
			case PRINT:
			case PRINTLN:
			case DEAL:
			case MOVE:
			case SHUFFLE:
			case PEEK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				if_stmt();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				foreach_stmt();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				repeat_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Func_stmtContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Func_if_stmtContext func_if_stmt() {
			return getRuleContext(Func_if_stmtContext.class,0);
		}
		public Func_foreach_stmtContext func_foreach_stmt() {
			return getRuleContext(Func_foreach_stmtContext.class,0);
		}
		public Func_repeat_stmtContext func_repeat_stmt() {
			return getRuleContext(Func_repeat_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Func_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_stmt; }
	}

	public final Func_stmtContext func_stmt() throws RecognitionException {
		Func_stmtContext _localctx = new Func_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_func_stmt);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case DATA_TYPE:
			case INT:
			case STRING:
			case ACTION_STACK:
			case NULL:
			case NOT_OP:
			case DISPBRD:
			case PICK:
			case GETINT:
			case GETSTR:
			case PRINT:
			case PRINTLN:
			case DEAL:
			case MOVE:
			case SHUFFLE:
			case PEEK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				func_if_stmt();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				func_foreach_stmt();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				func_repeat_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				return_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Func_loop_stmtContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Func_loop_if_stmtContext func_loop_if_stmt() {
			return getRuleContext(Func_loop_if_stmtContext.class,0);
		}
		public Func_foreach_stmtContext func_foreach_stmt() {
			return getRuleContext(Func_foreach_stmtContext.class,0);
		}
		public Func_repeat_stmtContext func_repeat_stmt() {
			return getRuleContext(Func_repeat_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Func_loop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_loop_stmt; }
	}

	public final Func_loop_stmtContext func_loop_stmt() throws RecognitionException {
		Func_loop_stmtContext _localctx = new Func_loop_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_func_loop_stmt);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case DATA_TYPE:
			case INT:
			case STRING:
			case ACTION_STACK:
			case NULL:
			case NOT_OP:
			case DISPBRD:
			case PICK:
			case GETINT:
			case GETSTR:
			case PRINT:
			case PRINTLN:
			case DEAL:
			case MOVE:
			case SHUFFLE:
			case PEEK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				func_loop_if_stmt();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				func_foreach_stmt();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				func_repeat_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				return_stmt();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(294);
				continue_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Round_stmtContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Round_if_stmtContext round_if_stmt() {
			return getRuleContext(Round_if_stmtContext.class,0);
		}
		public Round_foreach_stmtContext round_foreach_stmt() {
			return getRuleContext(Round_foreach_stmtContext.class,0);
		}
		public Round_repeat_stmtContext round_repeat_stmt() {
			return getRuleContext(Round_repeat_stmtContext.class,0);
		}
		public End_stmtContext end_stmt() {
			return getRuleContext(End_stmtContext.class,0);
		}
		public Pass_stmtContext pass_stmt() {
			return getRuleContext(Pass_stmtContext.class,0);
		}
		public Round_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round_stmt; }
	}

	public final Round_stmtContext round_stmt() throws RecognitionException {
		Round_stmtContext _localctx = new Round_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_round_stmt);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case DATA_TYPE:
			case INT:
			case STRING:
			case ACTION_STACK:
			case NULL:
			case NOT_OP:
			case DISPBRD:
			case PICK:
			case GETINT:
			case GETSTR:
			case PRINT:
			case PRINTLN:
			case DEAL:
			case MOVE:
			case SHUFFLE:
			case PEEK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				round_if_stmt();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				round_foreach_stmt();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				round_repeat_stmt();
				}
				break;
			case END:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				end_stmt();
				}
				break;
			case PASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
				pass_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Round_loop_stmtContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Round_loop_if_stmtContext round_loop_if_stmt() {
			return getRuleContext(Round_loop_if_stmtContext.class,0);
		}
		public Round_foreach_stmtContext round_foreach_stmt() {
			return getRuleContext(Round_foreach_stmtContext.class,0);
		}
		public Round_repeat_stmtContext round_repeat_stmt() {
			return getRuleContext(Round_repeat_stmtContext.class,0);
		}
		public End_stmtContext end_stmt() {
			return getRuleContext(End_stmtContext.class,0);
		}
		public Pass_stmtContext pass_stmt() {
			return getRuleContext(Pass_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Round_loop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round_loop_stmt; }
	}

	public final Round_loop_stmtContext round_loop_stmt() throws RecognitionException {
		Round_loop_stmtContext _localctx = new Round_loop_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_round_loop_stmt);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case DATA_TYPE:
			case INT:
			case STRING:
			case ACTION_STACK:
			case NULL:
			case NOT_OP:
			case DISPBRD:
			case PICK:
			case GETINT:
			case GETSTR:
			case PRINT:
			case PRINTLN:
			case DEAL:
			case MOVE:
			case SHUFFLE:
			case PEEK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				round_loop_if_stmt();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				round_foreach_stmt();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				round_repeat_stmt();
				}
				break;
			case END:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				end_stmt();
				}
				break;
			case PASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				pass_stmt();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(311);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(312);
				continue_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Loop_stmtContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Loop_if_stmtContext loop_if_stmt() {
			return getRuleContext(Loop_if_stmtContext.class,0);
		}
		public Foreach_stmtContext foreach_stmt() {
			return getRuleContext(Foreach_stmtContext.class,0);
		}
		public Repeat_stmtContext repeat_stmt() {
			return getRuleContext(Repeat_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Loop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_stmt; }
	}

	public final Loop_stmtContext loop_stmt() throws RecognitionException {
		Loop_stmtContext _localctx = new Loop_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_loop_stmt);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case DATA_TYPE:
			case INT:
			case STRING:
			case ACTION_STACK:
			case NULL:
			case NOT_OP:
			case DISPBRD:
			case PICK:
			case GETINT:
			case GETSTR:
			case PRINT:
			case PRINTLN:
			case DEAL:
			case MOVE:
			case SHUFFLE:
			case PEEK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				loop_if_stmt();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				foreach_stmt();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				repeat_stmt();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(319);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				continue_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Declare_stmtContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE() { return getToken(CardParser.DATA_TYPE, 0); }
		public Declare_bodyContext declare_body() {
			return getRuleContext(Declare_bodyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt; }
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declare_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(DATA_TYPE);
			setState(324);
			declare_body();
			setState(325);
			match(SEMICOLON);
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
	public static class Declare_bodyContext extends ParserRuleContext {
		public List<Declare_contentContext> declare_content() {
			return getRuleContexts(Declare_contentContext.class);
		}
		public Declare_contentContext declare_content(int i) {
			return getRuleContext(Declare_contentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CardParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CardParser.COMMA, i);
		}
		public Declare_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_body; }
	}

	public final Declare_bodyContext declare_body() throws RecognitionException {
		Declare_bodyContext _localctx = new Declare_bodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declare_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			declare_content();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(328);
				match(COMMA);
				setState(329);
				declare_content();
				}
				}
				setState(334);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declare_contentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CardParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_SB() { return getToken(CardParser.OPEN_SB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_SB() { return getToken(CardParser.CLOSE_SB, 0); }
		public Assign_bodyContext assign_body() {
			return getRuleContext(Assign_bodyContext.class,0);
		}
		public Declare_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_content; }
	}

	public final Declare_contentContext declare_content() throws RecognitionException {
		Declare_contentContext _localctx = new Declare_contentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declare_content);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(IDENTIFIER);
				setState(337);
				match(OPEN_SB);
				setState(338);
				expression(0);
				setState(339);
				match(CLOSE_SB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				match(IDENTIFIER);
				setState(342);
				assign_body();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				match(IDENTIFIER);
				setState(344);
				match(OPEN_SB);
				setState(345);
				expression(0);
				setState(346);
				match(CLOSE_SB);
				setState(347);
				assign_body();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_bodyContext extends ParserRuleContext {
		public TerminalNode ASSIGN_OP() { return getToken(CardParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_CB() { return getToken(CardParser.OPEN_CB, 0); }
		public Array_bodyContext array_body() {
			return getRuleContext(Array_bodyContext.class,0);
		}
		public TerminalNode CLOSE_CB() { return getToken(CardParser.CLOSE_CB, 0); }
		public Object_bodyContext object_body() {
			return getRuleContext(Object_bodyContext.class,0);
		}
		public TerminalNode COMBI() { return getToken(CardParser.COMBI, 0); }
		public TerminalNode NEW() { return getToken(CardParser.NEW, 0); }
		public TerminalNode DATA_TYPE() { return getToken(CardParser.DATA_TYPE, 0); }
		public Assign_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_body; }
	}

	public final Assign_bodyContext assign_body() throws RecognitionException {
		Assign_bodyContext _localctx = new Assign_bodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assign_body);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(ASSIGN_OP);
				setState(352);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(ASSIGN_OP);
				setState(354);
				match(OPEN_CB);
				setState(355);
				array_body();
				setState(356);
				match(CLOSE_CB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(ASSIGN_OP);
				setState(359);
				match(OPEN_CB);
				setState(360);
				object_body();
				setState(361);
				match(CLOSE_CB);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				match(ASSIGN_OP);
				setState(364);
				match(COMBI);
				setState(365);
				match(OPEN_CB);
				setState(366);
				object_body();
				setState(367);
				match(CLOSE_CB);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(369);
				match(ASSIGN_OP);
				setState(370);
				match(NEW);
				setState(371);
				match(DATA_TYPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssigneeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CardParser.IDENTIFIER, 0); }
		public AssigneeContext assignee() {
			return getRuleContext(AssigneeContext.class,0);
		}
		public TerminalNode OPEN_SB() { return getToken(CardParser.OPEN_SB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_SB() { return getToken(CardParser.CLOSE_SB, 0); }
		public TerminalNode DOT_OP() { return getToken(CardParser.DOT_OP, 0); }
		public AssigneeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignee; }
	}

	public final AssigneeContext assignee() throws RecognitionException {
		return assignee(0);
	}

	private AssigneeContext assignee(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AssigneeContext _localctx = new AssigneeContext(_ctx, _parentState);
		AssigneeContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_assignee, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(375);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(385);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new AssigneeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignee);
						setState(377);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(378);
						match(OPEN_SB);
						setState(379);
						expression(0);
						setState(380);
						match(CLOSE_SB);
						}
						break;
					case 2:
						{
						_localctx = new AssigneeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_assignee);
						setState(382);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(383);
						match(DOT_OP);
						setState(384);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EntityContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CardParser.IDENTIFIER, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(CardParser.OPEN_PAR, 0); }
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CardParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_SB() { return getToken(CardParser.OPEN_SB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_SB() { return getToken(CardParser.CLOSE_SB, 0); }
		public TerminalNode DOT_OP() { return getToken(CardParser.DOT_OP, 0); }
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
	}

	public final EntityContext entity() throws RecognitionException {
		return entity(0);
	}

	private EntityContext entity(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EntityContext _localctx = new EntityContext(_ctx, _parentState);
		EntityContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_entity, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(391);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(392);
				function_call();
				}
				break;
			case 3:
				{
				setState(393);
				match(OPEN_PAR);
				setState(394);
				entity(0);
				setState(395);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(407);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new EntityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_entity);
						setState(399);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(400);
						match(OPEN_SB);
						setState(401);
						expression(0);
						setState(402);
						match(CLOSE_SB);
						}
						break;
					case 2:
						{
						_localctx = new EntityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_entity);
						setState(404);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(405);
						match(DOT_OP);
						setState(406);
						match(IDENTIFIER);
						}
						break;
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_bodyContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CardParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CardParser.COMMA, i);
		}
		public Array_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_body; }
	}

	public final Array_bodyContext array_body() throws RecognitionException {
		Array_bodyContext _localctx = new Array_bodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			expression(0);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(413);
				match(COMMA);
				setState(414);
				expression(0);
				}
				}
				setState(419);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Object_bodyContext extends ParserRuleContext {
		public List<Object_contentContext> object_content() {
			return getRuleContexts(Object_contentContext.class);
		}
		public Object_contentContext object_content(int i) {
			return getRuleContext(Object_contentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CardParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CardParser.COMMA, i);
		}
		public Object_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_body; }
	}

	public final Object_bodyContext object_body() throws RecognitionException {
		Object_bodyContext _localctx = new Object_bodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_object_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			object_content();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(421);
				match(COMMA);
				setState(422);
				object_content();
				}
				}
				setState(427);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Object_contentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CardParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(CardParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPEN_CB() { return getToken(CardParser.OPEN_CB, 0); }
		public Array_bodyContext array_body() {
			return getRuleContext(Array_bodyContext.class,0);
		}
		public TerminalNode CLOSE_CB() { return getToken(CardParser.CLOSE_CB, 0); }
		public Object_bodyContext object_body() {
			return getRuleContext(Object_bodyContext.class,0);
		}
		public Object_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_content; }
	}

	public final Object_contentContext object_content() throws RecognitionException {
		Object_contentContext _localctx = new Object_contentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_object_content);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(IDENTIFIER);
				setState(429);
				match(COLON);
				setState(430);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(IDENTIFIER);
				setState(432);
				match(COLON);
				setState(433);
				match(OPEN_CB);
				setState(434);
				array_body();
				setState(435);
				match(CLOSE_CB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(IDENTIFIER);
				setState(438);
				match(COLON);
				setState(439);
				match(OPEN_CB);
				setState(440);
				object_body();
				setState(441);
				match(CLOSE_CB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public TerminalNode INT() { return getToken(CardParser.INT, 0); }
		public TerminalNode STRING() { return getToken(CardParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(CardParser.NULL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CardParser.OPEN_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CardParser.CLOSE_PAR, 0); }
		public TerminalNode NOT_OP() { return getToken(CardParser.NOT_OP, 0); }
		public Pick_exprContext pick_expr() {
			return getRuleContext(Pick_exprContext.class,0);
		}
		public Getint_exprContext getint_expr() {
			return getRuleContext(Getint_exprContext.class,0);
		}
		public Getstr_exprContext getstr_expr() {
			return getRuleContext(Getstr_exprContext.class,0);
		}
		public Action_stack_exprContext action_stack_expr() {
			return getRuleContext(Action_stack_exprContext.class,0);
		}
		public Operator1Context operator1() {
			return getRuleContext(Operator1Context.class,0);
		}
		public Operator2Context operator2() {
			return getRuleContext(Operator2Context.class,0);
		}
		public Operator3Context operator3() {
			return getRuleContext(Operator3Context.class,0);
		}
		public Operator4Context operator4() {
			return getRuleContext(Operator4Context.class,0);
		}
		public TerminalNode AND_OP() { return getToken(CardParser.AND_OP, 0); }
		public TerminalNode OR_OP() { return getToken(CardParser.OR_OP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(446);
				entity(0);
				}
				break;
			case 2:
				{
				setState(447);
				match(INT);
				}
				break;
			case 3:
				{
				setState(448);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(449);
				match(NULL);
				}
				break;
			case 5:
				{
				setState(450);
				match(OPEN_PAR);
				setState(451);
				expression(0);
				setState(452);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(454);
				match(NOT_OP);
				setState(455);
				expression(11);
				}
				break;
			case 7:
				{
				setState(456);
				pick_expr();
				}
				break;
			case 8:
				{
				setState(457);
				getint_expr();
				}
				break;
			case 9:
				{
				setState(458);
				getstr_expr();
				}
				break;
			case 10:
				{
				setState(459);
				action_stack_expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(484);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(462);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(463);
						operator1();
						setState(464);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(466);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(467);
						operator2();
						setState(468);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(470);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(471);
						operator3();
						setState(472);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(474);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(475);
						operator4();
						setState(476);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(478);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(479);
						match(AND_OP);
						setState(480);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(481);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(482);
						match(OR_OP);
						setState(483);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operator1Context extends ParserRuleContext {
		public TerminalNode MULT_OP() { return getToken(CardParser.MULT_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(CardParser.DIV_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(CardParser.MOD_OP, 0); }
		public Operator1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator1; }
	}

	public final Operator1Context operator1() throws RecognitionException {
		Operator1Context _localctx = new Operator1Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_operator1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operator2Context extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(CardParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(CardParser.SUB_OP, 0); }
		public Operator2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator2; }
	}

	public final Operator2Context operator2() throws RecognitionException {
		Operator2Context _localctx = new Operator2Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_operator2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if ( !(_la==ADD_OP || _la==SUB_OP) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operator3Context extends ParserRuleContext {
		public TerminalNode GT_OP() { return getToken(CardParser.GT_OP, 0); }
		public TerminalNode LT_OP() { return getToken(CardParser.LT_OP, 0); }
		public TerminalNode GEQ_OP() { return getToken(CardParser.GEQ_OP, 0); }
		public TerminalNode LEQ_OP() { return getToken(CardParser.LEQ_OP, 0); }
		public Operator3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator3; }
	}

	public final Operator3Context operator3() throws RecognitionException {
		Operator3Context _localctx = new Operator3Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_operator3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operator4Context extends ParserRuleContext {
		public TerminalNode EQ_OP() { return getToken(CardParser.EQ_OP, 0); }
		public TerminalNode NEQ_OP() { return getToken(CardParser.NEQ_OP, 0); }
		public Operator4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator4; }
	}

	public final Operator4Context operator4() throws RecognitionException {
		Operator4Context _localctx = new Operator4Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_operator4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if ( !(_la==EQ_OP || _la==NEQ_OP) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public If_headerContext if_header() {
			return getRuleContext(If_headerContext.class,0);
		}
		public List<Block_stmtContext> block_stmt() {
			return getRuleContexts(Block_stmtContext.class);
		}
		public Block_stmtContext block_stmt(int i) {
			return getRuleContext(Block_stmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CardParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			if_header();
			setState(498);
			block_stmt();
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(499);
				match(ELSE);
				setState(500);
				block_stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_headerContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CardParser.IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CardParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CardParser.CLOSE_PAR, 0); }
		public If_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_header; }
	}

	public final If_headerContext if_header() throws RecognitionException {
		If_headerContext _localctx = new If_headerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_if_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(IF);
			setState(504);
			match(OPEN_PAR);
			setState(505);
			expression(0);
			setState(506);
			match(CLOSE_PAR);
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
	public static class Foreach_stmtContext extends ParserRuleContext {
		public Foreach_headerContext foreach_header() {
			return getRuleContext(Foreach_headerContext.class,0);
		}
		public Loop_block_stmtContext loop_block_stmt() {
			return getRuleContext(Loop_block_stmtContext.class,0);
		}
		public Foreach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_stmt; }
	}

	public final Foreach_stmtContext foreach_stmt() throws RecognitionException {
		Foreach_stmtContext _localctx = new Foreach_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_foreach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			foreach_header();
			setState(509);
			loop_block_stmt();
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
	public static class Foreach_headerContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(CardParser.FOREACH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CardParser.OPEN_PAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CardParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(CardParser.COLON, 0); }
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CardParser.CLOSE_PAR, 0); }
		public Foreach_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_header; }
	}

	public final Foreach_headerContext foreach_header() throws RecognitionException {
		Foreach_headerContext _localctx = new Foreach_headerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_foreach_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(FOREACH);
			setState(512);
			match(OPEN_PAR);
			setState(513);
			match(IDENTIFIER);
			setState(514);
			match(COLON);
			setState(515);
			entity(0);
			setState(516);
			match(CLOSE_PAR);
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
	public static class Repeat_stmtContext extends ParserRuleContext {
		public Repeat_headerContext repeat_header() {
			return getRuleContext(Repeat_headerContext.class,0);
		}
		public Loop_block_stmtContext loop_block_stmt() {
			return getRuleContext(Loop_block_stmtContext.class,0);
		}
		public Repeat_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_stmt; }
	}

	public final Repeat_stmtContext repeat_stmt() throws RecognitionException {
		Repeat_stmtContext _localctx = new Repeat_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_repeat_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			repeat_header();
			setState(519);
			loop_block_stmt();
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
	public static class Repeat_headerContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(CardParser.REPEAT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(CardParser.UNTIL, 0); }
		public Repeat_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_header; }
	}

	public final Repeat_headerContext repeat_header() throws RecognitionException {
		Repeat_headerContext _localctx = new Repeat_headerContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_repeat_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(REPEAT);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNTIL) {
				{
				setState(522);
				match(UNTIL);
				}
			}

			setState(525);
			expression(0);
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
	public static class Loop_if_stmtContext extends ParserRuleContext {
		public If_headerContext if_header() {
			return getRuleContext(If_headerContext.class,0);
		}
		public List<Loop_block_stmtContext> loop_block_stmt() {
			return getRuleContexts(Loop_block_stmtContext.class);
		}
		public Loop_block_stmtContext loop_block_stmt(int i) {
			return getRuleContext(Loop_block_stmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CardParser.ELSE, 0); }
		public Loop_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_if_stmt; }
	}

	public final Loop_if_stmtContext loop_if_stmt() throws RecognitionException {
		Loop_if_stmtContext _localctx = new Loop_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_loop_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			if_header();
			setState(528);
			loop_block_stmt();
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(529);
				match(ELSE);
				setState(530);
				loop_block_stmt();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_if_stmtContext extends ParserRuleContext {
		public If_headerContext if_header() {
			return getRuleContext(If_headerContext.class,0);
		}
		public List<Func_block_stmtContext> func_block_stmt() {
			return getRuleContexts(Func_block_stmtContext.class);
		}
		public Func_block_stmtContext func_block_stmt(int i) {
			return getRuleContext(Func_block_stmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CardParser.ELSE, 0); }
		public Func_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_if_stmt; }
	}

	public final Func_if_stmtContext func_if_stmt() throws RecognitionException {
		Func_if_stmtContext _localctx = new Func_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_func_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			if_header();
			setState(534);
			func_block_stmt();
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(535);
				match(ELSE);
				setState(536);
				func_block_stmt();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_foreach_stmtContext extends ParserRuleContext {
		public Foreach_headerContext foreach_header() {
			return getRuleContext(Foreach_headerContext.class,0);
		}
		public Func_loop_block_stmtContext func_loop_block_stmt() {
			return getRuleContext(Func_loop_block_stmtContext.class,0);
		}
		public Func_foreach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_foreach_stmt; }
	}

	public final Func_foreach_stmtContext func_foreach_stmt() throws RecognitionException {
		Func_foreach_stmtContext _localctx = new Func_foreach_stmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_func_foreach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			foreach_header();
			setState(540);
			func_loop_block_stmt();
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
	public static class Func_repeat_stmtContext extends ParserRuleContext {
		public Repeat_headerContext repeat_header() {
			return getRuleContext(Repeat_headerContext.class,0);
		}
		public Func_loop_block_stmtContext func_loop_block_stmt() {
			return getRuleContext(Func_loop_block_stmtContext.class,0);
		}
		public Func_repeat_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_repeat_stmt; }
	}

	public final Func_repeat_stmtContext func_repeat_stmt() throws RecognitionException {
		Func_repeat_stmtContext _localctx = new Func_repeat_stmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_func_repeat_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			repeat_header();
			setState(543);
			func_loop_block_stmt();
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
	public static class Func_loop_if_stmtContext extends ParserRuleContext {
		public If_headerContext if_header() {
			return getRuleContext(If_headerContext.class,0);
		}
		public List<Func_loop_block_stmtContext> func_loop_block_stmt() {
			return getRuleContexts(Func_loop_block_stmtContext.class);
		}
		public Func_loop_block_stmtContext func_loop_block_stmt(int i) {
			return getRuleContext(Func_loop_block_stmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CardParser.ELSE, 0); }
		public Func_loop_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_loop_if_stmt; }
	}

	public final Func_loop_if_stmtContext func_loop_if_stmt() throws RecognitionException {
		Func_loop_if_stmtContext _localctx = new Func_loop_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_func_loop_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			if_header();
			setState(546);
			func_loop_block_stmt();
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(547);
				match(ELSE);
				setState(548);
				func_loop_block_stmt();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Round_if_stmtContext extends ParserRuleContext {
		public If_headerContext if_header() {
			return getRuleContext(If_headerContext.class,0);
		}
		public List<Round_block_stmtContext> round_block_stmt() {
			return getRuleContexts(Round_block_stmtContext.class);
		}
		public Round_block_stmtContext round_block_stmt(int i) {
			return getRuleContext(Round_block_stmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CardParser.ELSE, 0); }
		public Round_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round_if_stmt; }
	}

	public final Round_if_stmtContext round_if_stmt() throws RecognitionException {
		Round_if_stmtContext _localctx = new Round_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_round_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			if_header();
			setState(552);
			round_block_stmt();
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(553);
				match(ELSE);
				setState(554);
				round_block_stmt();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Round_foreach_stmtContext extends ParserRuleContext {
		public Foreach_headerContext foreach_header() {
			return getRuleContext(Foreach_headerContext.class,0);
		}
		public Round_loop_block_stmtContext round_loop_block_stmt() {
			return getRuleContext(Round_loop_block_stmtContext.class,0);
		}
		public Round_foreach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round_foreach_stmt; }
	}

	public final Round_foreach_stmtContext round_foreach_stmt() throws RecognitionException {
		Round_foreach_stmtContext _localctx = new Round_foreach_stmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_round_foreach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			foreach_header();
			setState(558);
			round_loop_block_stmt();
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
	public static class Round_repeat_stmtContext extends ParserRuleContext {
		public Repeat_headerContext repeat_header() {
			return getRuleContext(Repeat_headerContext.class,0);
		}
		public Round_loop_block_stmtContext round_loop_block_stmt() {
			return getRuleContext(Round_loop_block_stmtContext.class,0);
		}
		public Round_repeat_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round_repeat_stmt; }
	}

	public final Round_repeat_stmtContext round_repeat_stmt() throws RecognitionException {
		Round_repeat_stmtContext _localctx = new Round_repeat_stmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_round_repeat_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			repeat_header();
			setState(561);
			round_loop_block_stmt();
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
	public static class Round_loop_if_stmtContext extends ParserRuleContext {
		public If_headerContext if_header() {
			return getRuleContext(If_headerContext.class,0);
		}
		public List<Round_loop_block_stmtContext> round_loop_block_stmt() {
			return getRuleContexts(Round_loop_block_stmtContext.class);
		}
		public Round_loop_block_stmtContext round_loop_block_stmt(int i) {
			return getRuleContext(Round_loop_block_stmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CardParser.ELSE, 0); }
		public Round_loop_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round_loop_if_stmt; }
	}

	public final Round_loop_if_stmtContext round_loop_if_stmt() throws RecognitionException {
		Round_loop_if_stmtContext _localctx = new Round_loop_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_round_loop_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			if_header();
			setState(564);
			round_loop_block_stmt();
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(565);
				match(ELSE);
				setState(566);
				round_loop_block_stmt();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Block_stmtContext extends ParserRuleContext {
		public TerminalNode OPEN_CB() { return getToken(CardParser.OPEN_CB, 0); }
		public Setup_code_blockContext setup_code_block() {
			return getRuleContext(Setup_code_blockContext.class,0);
		}
		public TerminalNode CLOSE_CB() { return getToken(CardParser.CLOSE_CB, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_stmt; }
	}

	public final Block_stmtContext block_stmt() throws RecognitionException {
		Block_stmtContext _localctx = new Block_stmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_block_stmt);
		try {
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CB:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(OPEN_CB);
				setState(570);
				setup_code_block();
				setState(571);
				match(CLOSE_CB);
				}
				break;
			case OPEN_PAR:
			case DATA_TYPE:
			case INT:
			case STRING:
			case ACTION_STACK:
			case NULL:
			case NOT_OP:
			case DISPBRD:
			case PICK:
			case GETINT:
			case GETSTR:
			case PRINT:
			case PRINTLN:
			case DEAL:
			case MOVE:
			case SHUFFLE:
			case PEEK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Func_block_stmtContext extends ParserRuleContext {
		public TerminalNode OPEN_CB() { return getToken(CardParser.OPEN_CB, 0); }
		public Func_code_blockContext func_code_block() {
			return getRuleContext(Func_code_blockContext.class,0);
		}
		public TerminalNode CLOSE_CB() { return getToken(CardParser.CLOSE_CB, 0); }
		public Func_stmtContext func_stmt() {
			return getRuleContext(Func_stmtContext.class,0);
		}
		public Func_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_block_stmt; }
	}

	public final Func_block_stmtContext func_block_stmt() throws RecognitionException {
		Func_block_stmtContext _localctx = new Func_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_func_block_stmt);
		try {
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CB:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				match(OPEN_CB);
				setState(577);
				func_code_block();
				setState(578);
				match(CLOSE_CB);
				}
				break;
			case OPEN_PAR:
			case DATA_TYPE:
			case INT:
			case STRING:
			case ACTION_STACK:
			case NULL:
			case NOT_OP:
			case IF:
			case FOREACH:
			case REPEAT:
			case RETURN:
			case DISPBRD:
			case PICK:
			case GETINT:
			case GETSTR:
			case PRINT:
			case PRINTLN:
			case DEAL:
			case MOVE:
			case SHUFFLE:
			case PEEK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				func_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Func_loop_block_stmtContext extends ParserRuleContext {
		public TerminalNode OPEN_CB() { return getToken(CardParser.OPEN_CB, 0); }
		public Func_loop_code_blockContext func_loop_code_block() {
			return getRuleContext(Func_loop_code_blockContext.class,0);
		}
		public TerminalNode CLOSE_CB() { return getToken(CardParser.CLOSE_CB, 0); }
		public Func_loop_stmtContext func_loop_stmt() {
			return getRuleContext(Func_loop_stmtContext.class,0);
		}
		public Func_loop_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_loop_block_stmt; }
	}

	public final Func_loop_block_stmtContext func_loop_block_stmt() throws RecognitionException {
		Func_loop_block_stmtContext _localctx = new Func_loop_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_func_loop_block_stmt);
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CB:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				match(OPEN_CB);
				setState(584);
				func_loop_code_block();
				setState(585);
				match(CLOSE_CB);
				}
				break;
			case OPEN_PAR:
			case DATA_TYPE:
			case INT:
			case STRING:
			case ACTION_STACK:
			case NULL:
			case NOT_OP:
			case IF:
			case FOREACH:
			case REPEAT:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case DISPBRD:
			case PICK:
			case GETINT:
			case GETSTR:
			case PRINT:
			case PRINTLN:
			case DEAL:
			case MOVE:
			case SHUFFLE:
			case PEEK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				func_loop_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Round_block_stmtContext extends ParserRuleContext {
		public TerminalNode OPEN_CB() { return getToken(CardParser.OPEN_CB, 0); }
		public Round_code_blockContext round_code_block() {
			return getRuleContext(Round_code_blockContext.class,0);
		}
		public TerminalNode CLOSE_CB() { return getToken(CardParser.CLOSE_CB, 0); }
		public Round_stmtContext round_stmt() {
			return getRuleContext(Round_stmtContext.class,0);
		}
		public Round_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round_block_stmt; }
	}

	public final Round_block_stmtContext round_block_stmt() throws RecognitionException {
		Round_block_stmtContext _localctx = new Round_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_round_block_stmt);
		try {
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CB:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				match(OPEN_CB);
				setState(591);
				round_code_block();
				setState(592);
				match(CLOSE_CB);
				}
				break;
			case OPEN_PAR:
			case DATA_TYPE:
			case INT:
			case STRING:
			case ACTION_STACK:
			case NULL:
			case NOT_OP:
			case IF:
			case FOREACH:
			case REPEAT:
			case END:
			case PASS:
			case DISPBRD:
			case PICK:
			case GETINT:
			case GETSTR:
			case PRINT:
			case PRINTLN:
			case DEAL:
			case MOVE:
			case SHUFFLE:
			case PEEK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				round_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Round_loop_block_stmtContext extends ParserRuleContext {
		public TerminalNode OPEN_CB() { return getToken(CardParser.OPEN_CB, 0); }
		public Round_loop_code_blockContext round_loop_code_block() {
			return getRuleContext(Round_loop_code_blockContext.class,0);
		}
		public TerminalNode CLOSE_CB() { return getToken(CardParser.CLOSE_CB, 0); }
		public Round_loop_stmtContext round_loop_stmt() {
			return getRuleContext(Round_loop_stmtContext.class,0);
		}
		public Round_loop_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_round_loop_block_stmt; }
	}

	public final Round_loop_block_stmtContext round_loop_block_stmt() throws RecognitionException {
		Round_loop_block_stmtContext _localctx = new Round_loop_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_round_loop_block_stmt);
		try {
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CB:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(OPEN_CB);
				setState(598);
				round_loop_code_block();
				setState(599);
				match(CLOSE_CB);
				}
				break;
			case OPEN_PAR:
			case DATA_TYPE:
			case INT:
			case STRING:
			case ACTION_STACK:
			case NULL:
			case NOT_OP:
			case IF:
			case FOREACH:
			case REPEAT:
			case BREAK:
			case CONTINUE:
			case END:
			case PASS:
			case DISPBRD:
			case PICK:
			case GETINT:
			case GETSTR:
			case PRINT:
			case PRINTLN:
			case DEAL:
			case MOVE:
			case SHUFFLE:
			case PEEK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				round_loop_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Loop_block_stmtContext extends ParserRuleContext {
		public TerminalNode OPEN_CB() { return getToken(CardParser.OPEN_CB, 0); }
		public Loop_code_blockContext loop_code_block() {
			return getRuleContext(Loop_code_blockContext.class,0);
		}
		public TerminalNode CLOSE_CB() { return getToken(CardParser.CLOSE_CB, 0); }
		public Loop_stmtContext loop_stmt() {
			return getRuleContext(Loop_stmtContext.class,0);
		}
		public Loop_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_block_stmt; }
	}

	public final Loop_block_stmtContext loop_block_stmt() throws RecognitionException {
		Loop_block_stmtContext _localctx = new Loop_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_loop_block_stmt);
		try {
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CB:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				match(OPEN_CB);
				setState(605);
				loop_code_block();
				setState(606);
				match(CLOSE_CB);
				}
				break;
			case OPEN_PAR:
			case DATA_TYPE:
			case INT:
			case STRING:
			case ACTION_STACK:
			case NULL:
			case NOT_OP:
			case IF:
			case FOREACH:
			case REPEAT:
			case BREAK:
			case CONTINUE:
			case DISPBRD:
			case PICK:
			case GETINT:
			case GETSTR:
			case PRINT:
			case PRINTLN:
			case DEAL:
			case MOVE:
			case SHUFFLE:
			case PEEK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				loop_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CardParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(BREAK);
			setState(612);
			match(SEMICOLON);
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
	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(CardParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(CONTINUE);
			setState(615);
			match(SEMICOLON);
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
	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CardParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_return_stmt);
		try {
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617);
				match(RETURN);
				setState(618);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(RETURN);
				setState(620);
				expression(0);
				setState(621);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class End_stmtContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(CardParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public End_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_stmt; }
	}

	public final End_stmtContext end_stmt() throws RecognitionException {
		End_stmtContext _localctx = new End_stmtContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_end_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(END);
			setState(626);
			match(SEMICOLON);
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
	public static class Pass_stmtContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(CardParser.PASS, 0); }
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public Pass_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass_stmt; }
	}

	public final Pass_stmtContext pass_stmt() throws RecognitionException {
		Pass_stmtContext _localctx = new Pass_stmtContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_pass_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(PASS);
			setState(629);
			match(SEMICOLON);
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
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode DISPBRD() { return getToken(CardParser.DISPBRD, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CardParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(CardParser.CLOSE_PAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CardParser.IDENTIFIER, 0); }
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_function_call);
		int _la;
		try {
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPBRD:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				match(DISPBRD);
				setState(632);
				match(OPEN_PAR);
				setState(633);
				match(CLOSE_PAR);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(IDENTIFIER);
				setState(635);
				match(OPEN_PAR);
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1153977036037978120L) != 0)) {
					{
					setState(636);
					actual_params();
					}
				}

				setState(639);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Actual_paramsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CardParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CardParser.COMMA, i);
		}
		public Actual_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_params; }
	}

	public final Actual_paramsContext actual_params() throws RecognitionException {
		Actual_paramsContext _localctx = new Actual_paramsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_actual_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			expression(0);
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(643);
				match(COMMA);
				setState(644);
				expression(0);
				}
				}
				setState(649);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pick_exprContext extends ParserRuleContext {
		public TerminalNode PICK() { return getToken(CardParser.PICK, 0); }
		public TerminalNode FROM() { return getToken(CardParser.FROM, 0); }
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public Pick_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pick_expr; }
	}

	public final Pick_exprContext pick_expr() throws RecognitionException {
		Pick_exprContext _localctx = new Pick_exprContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_pick_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(PICK);
			setState(651);
			match(FROM);
			setState(652);
			entity(0);
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
	public static class Getint_exprContext extends ParserRuleContext {
		public TerminalNode GETINT() { return getToken(CardParser.GETINT, 0); }
		public Getint_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getint_expr; }
	}

	public final Getint_exprContext getint_expr() throws RecognitionException {
		Getint_exprContext _localctx = new Getint_exprContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_getint_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(GETINT);
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
	public static class Getstr_exprContext extends ParserRuleContext {
		public TerminalNode GETSTR() { return getToken(CardParser.GETSTR, 0); }
		public Getstr_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getstr_expr; }
	}

	public final Getstr_exprContext getstr_expr() throws RecognitionException {
		Getstr_exprContext _localctx = new Getstr_exprContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_getstr_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(GETSTR);
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
	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(CardParser.PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CardParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CardParser.CLOSE_PAR, 0); }
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public TerminalNode PRINTLN() { return getToken(CardParser.PRINTLN, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_print_stmt);
		try {
			setState(670);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(PRINT);
				setState(659);
				match(OPEN_PAR);
				setState(660);
				expression(0);
				setState(661);
				match(CLOSE_PAR);
				setState(662);
				match(SEMICOLON);
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				match(PRINTLN);
				setState(665);
				match(OPEN_PAR);
				setState(666);
				expression(0);
				setState(667);
				match(CLOSE_PAR);
				setState(668);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Deal_stmtContext extends ParserRuleContext {
		public TerminalNode DEAL() { return getToken(CardParser.DEAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FROM() { return getToken(CardParser.FROM, 0); }
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public TerminalNode TO() { return getToken(CardParser.TO, 0); }
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public Deal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deal_stmt; }
	}

	public final Deal_stmtContext deal_stmt() throws RecognitionException {
		Deal_stmtContext _localctx = new Deal_stmtContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_deal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(DEAL);
			setState(673);
			expression(0);
			setState(674);
			match(FROM);
			setState(675);
			entity(0);
			setState(676);
			match(TO);
			setState(677);
			entity(0);
			setState(678);
			match(SEMICOLON);
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
	public static class Draw_stmtContext extends ParserRuleContext {
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public TerminalNode DRAW() { return getToken(CardParser.DRAW, 0); }
		public TerminalNode FROM() { return getToken(CardParser.FROM, 0); }
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(CardParser.UNTIL, 0); }
		public Draw_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draw_stmt; }
	}

	public final Draw_stmtContext draw_stmt() throws RecognitionException {
		Draw_stmtContext _localctx = new Draw_stmtContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_draw_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			entity(0);
			setState(681);
			match(DRAW);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1153977070397716488L) != 0)) {
				{
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNTIL) {
					{
					setState(682);
					match(UNTIL);
					}
				}

				setState(685);
				expression(0);
				}
			}

			setState(688);
			match(FROM);
			setState(689);
			entity(0);
			setState(690);
			match(SEMICOLON);
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
	public static class Move_stmtContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(CardParser.MOVE, 0); }
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public TerminalNode FROM() { return getToken(CardParser.FROM, 0); }
		public TerminalNode TO() { return getToken(CardParser.TO, 0); }
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public Move_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_stmt; }
	}

	public final Move_stmtContext move_stmt() throws RecognitionException {
		Move_stmtContext _localctx = new Move_stmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_move_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(MOVE);
			setState(693);
			entity(0);
			setState(694);
			match(FROM);
			setState(695);
			entity(0);
			setState(696);
			match(TO);
			setState(697);
			entity(0);
			setState(698);
			match(SEMICOLON);
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
	public static class Play_stmtContext extends ParserRuleContext {
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public TerminalNode PLAY() { return getToken(CardParser.PLAY, 0); }
		public TerminalNode TO() { return getToken(CardParser.TO, 0); }
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public Play_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_play_stmt; }
	}

	public final Play_stmtContext play_stmt() throws RecognitionException {
		Play_stmtContext _localctx = new Play_stmtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_play_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			entity(0);
			setState(701);
			match(PLAY);
			setState(702);
			entity(0);
			setState(703);
			match(TO);
			setState(704);
			entity(0);
			setState(705);
			match(SEMICOLON);
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
	public static class Shuffle_stmtContext extends ParserRuleContext {
		public TerminalNode SHUFFLE() { return getToken(CardParser.SHUFFLE, 0); }
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public Shuffle_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shuffle_stmt; }
	}

	public final Shuffle_stmtContext shuffle_stmt() throws RecognitionException {
		Shuffle_stmtContext _localctx = new Shuffle_stmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_shuffle_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(SHUFFLE);
			setState(708);
			entity(0);
			setState(709);
			match(SEMICOLON);
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
	public static class Peek_stmtContext extends ParserRuleContext {
		public TerminalNode PEEK() { return getToken(CardParser.PEEK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FROM() { return getToken(CardParser.FROM, 0); }
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CardParser.SEMICOLON, 0); }
		public Peek_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peek_stmt; }
	}

	public final Peek_stmtContext peek_stmt() throws RecognitionException {
		Peek_stmtContext _localctx = new Peek_stmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_peek_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(PEEK);
			setState(712);
			expression(0);
			setState(713);
			match(FROM);
			setState(714);
			entity(0);
			setState(715);
			match(SEMICOLON);
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
	public static class Action_stack_exprContext extends ParserRuleContext {
		public TerminalNode ACTION_STACK() { return getToken(CardParser.ACTION_STACK, 0); }
		public TerminalNode DOT_OP() { return getToken(CardParser.DOT_OP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CardParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CardParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(CardParser.CLOSE_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Action_stack_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_stack_expr; }
	}

	public final Action_stack_exprContext action_stack_expr() throws RecognitionException {
		Action_stack_exprContext _localctx = new Action_stack_exprContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_action_stack_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(ACTION_STACK);
			setState(718);
			match(DOT_OP);
			setState(719);
			match(IDENTIFIER);
			setState(720);
			match(OPEN_PAR);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1153977036037978120L) != 0)) {
				{
				setState(721);
				expression(0);
				}
			}

			setState(724);
			match(CLOSE_PAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return assignee_sempred((AssigneeContext)_localctx, predIndex);
		case 30:
			return entity_sempred((EntityContext)_localctx, predIndex);
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean assignee_sempred(AssigneeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean entity_sempred(EntityContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u02d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002\u00a4\b\u0002"+
		"\u000b\u0002\f\u0002\u00a5\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00ac\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00b7\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00be\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00c5\b\u0006\n\u0006\f\u0006\u00c8\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u00d5\b\t\n\t\f\t\u00d8\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\f\u00e6\b\f\u000b\f\f\f\u00e7"+
		"\u0001\r\u0004\r\u00eb\b\r\u000b\r\f\r\u00ec\u0001\u000e\u0004\u000e\u00f0"+
		"\b\u000e\u000b\u000e\f\u000e\u00f1\u0001\u000f\u0004\u000f\u00f5\b\u000f"+
		"\u000b\u000f\f\u000f\u00f6\u0001\u0010\u0004\u0010\u00fa\b\u0010\u000b"+
		"\u0010\f\u0010\u00fb\u0001\u0011\u0004\u0011\u00ff\b\u0011\u000b\u0011"+
		"\f\u0011\u0100\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0112\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0118\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u011f\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0128\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0130\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u013a\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0142\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u014b\b\u001a\n\u001a\f\u001a\u014e\t\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u015e\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0175\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u0182\b\u001d\n\u001d\f\u001d\u0185\t\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u018e\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u0198\b\u001e\n\u001e\f\u001e\u019b\t\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u01a0\b\u001f\n\u001f\f\u001f\u01a3\t\u001f\u0001 "+
		"\u0001 \u0001 \u0005 \u01a8\b \n \f \u01ab\t \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u01bc\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01cd\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01e5\b\"\n"+
		"\"\f\"\u01e8\t\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01f6\b\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001,\u0001,\u0003,\u020c\b,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0003-\u0214\b-\u0001.\u0001.\u0001"+
		".\u0001.\u0003.\u021a\b.\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"1\u00011\u00011\u00011\u00031\u0226\b1\u00012\u00012\u00012\u00012\u0003"+
		"2\u022c\b2\u00013\u00013\u00013\u00014\u00014\u00014\u00015\u00015\u0001"+
		"5\u00015\u00035\u0238\b5\u00016\u00016\u00016\u00016\u00016\u00036\u023f"+
		"\b6\u00017\u00017\u00017\u00017\u00017\u00037\u0246\b7\u00018\u00018\u0001"+
		"8\u00018\u00018\u00038\u024d\b8\u00019\u00019\u00019\u00019\u00019\u0003"+
		"9\u0254\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u025b\b:\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0003;\u0262\b;\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u0270\b>\u0001"+
		"?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0003A\u027e\bA\u0001A\u0003A\u0281\bA\u0001B\u0001B\u0001B\u0005"+
		"B\u0286\bB\nB\fB\u0289\tB\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001"+
		"E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0003F\u029f\bF\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0003H\u02ac\bH\u0001H\u0003"+
		"H\u02af\bH\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u02d3\bM\u0001M\u0001M\u0001"+
		"M\u0000\u0003:<DN\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u0000\u0004\u0001\u0000\u0011\u0013\u0001\u0000"+
		"\u000f\u0010\u0001\u0000\u0016\u0019\u0001\u0000\u0014\u0015\u02f3\u0000"+
		"\u009c\u0001\u0000\u0000\u0000\u0002\u009f\u0001\u0000\u0000\u0000\u0004"+
		"\u00a3\u0001\u0000\u0000\u0000\u0006\u00ab\u0001\u0000\u0000\u0000\b\u00ad"+
		"\u0001\u0000\u0000\u0000\n\u00bd\u0001\u0000\u0000\u0000\f\u00bf\u0001"+
		"\u0000\u0000\u0000\u000e\u00c9\u0001\u0000\u0000\u0000\u0010\u00ce\u0001"+
		"\u0000\u0000\u0000\u0012\u00d1\u0001\u0000\u0000\u0000\u0014\u00d9\u0001"+
		"\u0000\u0000\u0000\u0016\u00df\u0001\u0000\u0000\u0000\u0018\u00e5\u0001"+
		"\u0000\u0000\u0000\u001a\u00ea\u0001\u0000\u0000\u0000\u001c\u00ef\u0001"+
		"\u0000\u0000\u0000\u001e\u00f4\u0001\u0000\u0000\u0000 \u00f9\u0001\u0000"+
		"\u0000\u0000\"\u00fe\u0001\u0000\u0000\u0000$\u0111\u0001\u0000\u0000"+
		"\u0000&\u0117\u0001\u0000\u0000\u0000(\u011e\u0001\u0000\u0000\u0000*"+
		"\u0127\u0001\u0000\u0000\u0000,\u012f\u0001\u0000\u0000\u0000.\u0139\u0001"+
		"\u0000\u0000\u00000\u0141\u0001\u0000\u0000\u00002\u0143\u0001\u0000\u0000"+
		"\u00004\u0147\u0001\u0000\u0000\u00006\u015d\u0001\u0000\u0000\u00008"+
		"\u0174\u0001\u0000\u0000\u0000:\u0176\u0001\u0000\u0000\u0000<\u018d\u0001"+
		"\u0000\u0000\u0000>\u019c\u0001\u0000\u0000\u0000@\u01a4\u0001\u0000\u0000"+
		"\u0000B\u01bb\u0001\u0000\u0000\u0000D\u01cc\u0001\u0000\u0000\u0000F"+
		"\u01e9\u0001\u0000\u0000\u0000H\u01eb\u0001\u0000\u0000\u0000J\u01ed\u0001"+
		"\u0000\u0000\u0000L\u01ef\u0001\u0000\u0000\u0000N\u01f1\u0001\u0000\u0000"+
		"\u0000P\u01f7\u0001\u0000\u0000\u0000R\u01fc\u0001\u0000\u0000\u0000T"+
		"\u01ff\u0001\u0000\u0000\u0000V\u0206\u0001\u0000\u0000\u0000X\u0209\u0001"+
		"\u0000\u0000\u0000Z\u020f\u0001\u0000\u0000\u0000\\\u0215\u0001\u0000"+
		"\u0000\u0000^\u021b\u0001\u0000\u0000\u0000`\u021e\u0001\u0000\u0000\u0000"+
		"b\u0221\u0001\u0000\u0000\u0000d\u0227\u0001\u0000\u0000\u0000f\u022d"+
		"\u0001\u0000\u0000\u0000h\u0230\u0001\u0000\u0000\u0000j\u0233\u0001\u0000"+
		"\u0000\u0000l\u023e\u0001\u0000\u0000\u0000n\u0245\u0001\u0000\u0000\u0000"+
		"p\u024c\u0001\u0000\u0000\u0000r\u0253\u0001\u0000\u0000\u0000t\u025a"+
		"\u0001\u0000\u0000\u0000v\u0261\u0001\u0000\u0000\u0000x\u0263\u0001\u0000"+
		"\u0000\u0000z\u0266\u0001\u0000\u0000\u0000|\u026f\u0001\u0000\u0000\u0000"+
		"~\u0271\u0001\u0000\u0000\u0000\u0080\u0274\u0001\u0000\u0000\u0000\u0082"+
		"\u0280\u0001\u0000\u0000\u0000\u0084\u0282\u0001\u0000\u0000\u0000\u0086"+
		"\u028a\u0001\u0000\u0000\u0000\u0088\u028e\u0001\u0000\u0000\u0000\u008a"+
		"\u0290\u0001\u0000\u0000\u0000\u008c\u029e\u0001\u0000\u0000\u0000\u008e"+
		"\u02a0\u0001\u0000\u0000\u0000\u0090\u02a8\u0001\u0000\u0000\u0000\u0092"+
		"\u02b4\u0001\u0000\u0000\u0000\u0094\u02bc\u0001\u0000\u0000\u0000\u0096"+
		"\u02c3\u0001\u0000\u0000\u0000\u0098\u02c7\u0001\u0000\u0000\u0000\u009a"+
		"\u02cd\u0001\u0000\u0000\u0000\u009c\u009d\u0003\u0002\u0001\u0000\u009d"+
		"\u009e\u0005\u0000\u0000\u0001\u009e\u0001\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0003\u0004\u0002\u0000\u00a0\u00a1\u0003\u0016\u000b\u0000\u00a1"+
		"\u0003\u0001\u0000\u0000\u0000\u00a2\u00a4\u0003\u0006\u0003\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u0005\u0001\u0000\u0000\u0000\u00a7\u00ac\u0003&\u0013\u0000\u00a8\u00ac"+
		"\u0003\b\u0004\u0000\u00a9\u00ac\u0003\u000e\u0007\u0000\u00aa\u00ac\u0003"+
		"\u0014\n\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u0007\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003\n\u0005"+
		"\u0000\u00ae\u00af\u0005\u0001\u0000\u0000\u00af\u00b0\u0003\u001a\r\u0000"+
		"\u00b0\u00b1\u0005\u0002\u0000\u0000\u00b1\t\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005\'\u0000\u0000\u00b3\u00b4\u0005<\u0000\u0000\u00b4\u00b6"+
		"\u0005\u0003\u0000\u0000\u00b5\u00b7\u0003\f\u0006\u0000\u00b6\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b8\u00be\u0005\u0004\u0000\u0000\u00b9\u00ba\u0005"+
		"\'\u0000\u0000\u00ba\u00bb\u0005.\u0000\u0000\u00bb\u00bc\u0005\u0003"+
		"\u0000\u0000\u00bc\u00be\u0005\u0004\u0000\u0000\u00bd\u00b2\u0001\u0000"+
		"\u0000\u0000\u00bd\u00b9\u0001\u0000\u0000\u0000\u00be\u000b\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005\n\u0000\u0000\u00c0\u00c6\u0005<\u0000"+
		"\u0000\u00c1\u00c2\u0005\t\u0000\u0000\u00c2\u00c3\u0005\n\u0000\u0000"+
		"\u00c3\u00c5\u0005<\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\r\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003\u0010\b\u0000\u00ca\u00cb\u0005"+
		"\u0001\u0000\u0000\u00cb\u00cc\u0003\u0012\t\u0000\u00cc\u00cd\u0005\u0002"+
		"\u0000\u0000\u00cd\u000f\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005)\u0000"+
		"\u0000\u00cf\u00d0\u0005<\u0000\u0000\u00d0\u0011\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d6\u0005<\u0000\u0000\u00d2\u00d3\u0005\t\u0000\u0000\u00d3"+
		"\u00d5\u0005<\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u0013\u0001\u0000\u0000\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\n\u0000\u0000\u00da\u00db\u0005"+
		"\u001e\u0000\u0000\u00db\u00dc\u0005<\u0000\u0000\u00dc\u00dd\u00038\u001c"+
		"\u0000\u00dd\u00de\u0005\u0007\u0000\u0000\u00de\u0015\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0005+\u0000\u0000\u00e0\u00e1\u0005\u0001\u0000\u0000"+
		"\u00e1\u00e2\u0003\u001e\u000f\u0000\u00e2\u00e3\u0005\u0002\u0000\u0000"+
		"\u00e3\u0017\u0001\u0000\u0000\u0000\u00e4\u00e6\u0003&\u0013\u0000\u00e5"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u0019\u0001\u0000\u0000\u0000\u00e9\u00eb\u0003(\u0014\u0000\u00ea\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u001b"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f0\u0003*\u0015\u0000\u00ef\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u001d\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0003,\u0016\u0000\u00f4\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u001f\u0001\u0000"+
		"\u0000\u0000\u00f8\u00fa\u0003.\u0017\u0000\u00f9\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc!\u0001\u0000\u0000\u0000"+
		"\u00fd\u00ff\u00030\u0018\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0001\u0000\u0000\u0000\u0101#\u0001\u0000\u0000\u0000\u0102\u0112"+
		"\u00032\u0019\u0000\u0103\u0104\u0003:\u001d\u0000\u0104\u0105\u00038"+
		"\u001c\u0000\u0105\u0106\u0005\u0007\u0000\u0000\u0106\u0112\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0003D\"\u0000\u0108\u0109\u0005\u0007\u0000"+
		"\u0000\u0109\u0112\u0001\u0000\u0000\u0000\u010a\u0112\u0003\u008eG\u0000"+
		"\u010b\u0112\u0003\u0090H\u0000\u010c\u0112\u0003\u0092I\u0000\u010d\u0112"+
		"\u0003\u0094J\u0000\u010e\u0112\u0003\u0096K\u0000\u010f\u0112\u0003\u0098"+
		"L\u0000\u0110\u0112\u0003\u008cF\u0000\u0111\u0102\u0001\u0000\u0000\u0000"+
		"\u0111\u0103\u0001\u0000\u0000\u0000\u0111\u0107\u0001\u0000\u0000\u0000"+
		"\u0111\u010a\u0001\u0000\u0000\u0000\u0111\u010b\u0001\u0000\u0000\u0000"+
		"\u0111\u010c\u0001\u0000\u0000\u0000\u0111\u010d\u0001\u0000\u0000\u0000"+
		"\u0111\u010e\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0110\u0001\u0000\u0000\u0000\u0112%\u0001\u0000\u0000\u0000\u0113"+
		"\u0118\u0003$\u0012\u0000\u0114\u0118\u0003N\'\u0000\u0115\u0118\u0003"+
		"R)\u0000\u0116\u0118\u0003V+\u0000\u0117\u0113\u0001\u0000\u0000\u0000"+
		"\u0117\u0114\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000"+
		"\u0117\u0116\u0001\u0000\u0000\u0000\u0118\'\u0001\u0000\u0000\u0000\u0119"+
		"\u011f\u0003$\u0012\u0000\u011a\u011f\u0003\\.\u0000\u011b\u011f\u0003"+
		"^/\u0000\u011c\u011f\u0003`0\u0000\u011d\u011f\u0003|>\u0000\u011e\u0119"+
		"\u0001\u0000\u0000\u0000\u011e\u011a\u0001\u0000\u0000\u0000\u011e\u011b"+
		"\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011d"+
		"\u0001\u0000\u0000\u0000\u011f)\u0001\u0000\u0000\u0000\u0120\u0128\u0003"+
		"$\u0012\u0000\u0121\u0128\u0003b1\u0000\u0122\u0128\u0003^/\u0000\u0123"+
		"\u0128\u0003`0\u0000\u0124\u0128\u0003|>\u0000\u0125\u0128\u0003x<\u0000"+
		"\u0126\u0128\u0003z=\u0000\u0127\u0120\u0001\u0000\u0000\u0000\u0127\u0121"+
		"\u0001\u0000\u0000\u0000\u0127\u0122\u0001\u0000\u0000\u0000\u0127\u0123"+
		"\u0001\u0000\u0000\u0000\u0127\u0124\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128+\u0001"+
		"\u0000\u0000\u0000\u0129\u0130\u0003$\u0012\u0000\u012a\u0130\u0003d2"+
		"\u0000\u012b\u0130\u0003f3\u0000\u012c\u0130\u0003h4\u0000\u012d\u0130"+
		"\u0003~?\u0000\u012e\u0130\u0003\u0080@\u0000\u012f\u0129\u0001\u0000"+
		"\u0000\u0000\u012f\u012a\u0001\u0000\u0000\u0000\u012f\u012b\u0001\u0000"+
		"\u0000\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000"+
		"\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130-\u0001\u0000\u0000"+
		"\u0000\u0131\u013a\u0003$\u0012\u0000\u0132\u013a\u0003j5\u0000\u0133"+
		"\u013a\u0003f3\u0000\u0134\u013a\u0003h4\u0000\u0135\u013a\u0003~?\u0000"+
		"\u0136\u013a\u0003\u0080@\u0000\u0137\u013a\u0003x<\u0000\u0138\u013a"+
		"\u0003z=\u0000\u0139\u0131\u0001\u0000\u0000\u0000\u0139\u0132\u0001\u0000"+
		"\u0000\u0000\u0139\u0133\u0001\u0000\u0000\u0000\u0139\u0134\u0001\u0000"+
		"\u0000\u0000\u0139\u0135\u0001\u0000\u0000\u0000\u0139\u0136\u0001\u0000"+
		"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000"+
		"\u0000\u0000\u013a/\u0001\u0000\u0000\u0000\u013b\u0142\u0003$\u0012\u0000"+
		"\u013c\u0142\u0003Z-\u0000\u013d\u0142\u0003R)\u0000\u013e\u0142\u0003"+
		"V+\u0000\u013f\u0142\u0003x<\u0000\u0140\u0142\u0003z=\u0000\u0141\u013b"+
		"\u0001\u0000\u0000\u0000\u0141\u013c\u0001\u0000\u0000\u0000\u0141\u013d"+
		"\u0001\u0000\u0000\u0000\u0141\u013e\u0001\u0000\u0000\u0000\u0141\u013f"+
		"\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u01421\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0005\n\u0000\u0000\u0144\u0145\u00034"+
		"\u001a\u0000\u0145\u0146\u0005\u0007\u0000\u0000\u01463\u0001\u0000\u0000"+
		"\u0000\u0147\u014c\u00036\u001b\u0000\u0148\u0149\u0005\t\u0000\u0000"+
		"\u0149\u014b\u00036\u001b\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b"+
		"\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0001\u0000\u0000\u0000\u014d5\u0001\u0000\u0000\u0000\u014e\u014c"+
		"\u0001\u0000\u0000\u0000\u014f\u015e\u0005<\u0000\u0000\u0150\u0151\u0005"+
		"<\u0000\u0000\u0151\u0152\u0005\u0005\u0000\u0000\u0152\u0153\u0003D\""+
		"\u0000\u0153\u0154\u0005\u0006\u0000\u0000\u0154\u015e\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0005<\u0000\u0000\u0156\u015e\u00038\u001c\u0000\u0157"+
		"\u0158\u0005<\u0000\u0000\u0158\u0159\u0005\u0005\u0000\u0000\u0159\u015a"+
		"\u0003D\"\u0000\u015a\u015b\u0005\u0006\u0000\u0000\u015b\u015c\u0003"+
		"8\u001c\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u014f\u0001\u0000"+
		"\u0000\u0000\u015d\u0150\u0001\u0000\u0000\u0000\u015d\u0155\u0001\u0000"+
		"\u0000\u0000\u015d\u0157\u0001\u0000\u0000\u0000\u015e7\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0005\u001d\u0000\u0000\u0160\u0175\u0003D\"\u0000"+
		"\u0161\u0162\u0005\u001d\u0000\u0000\u0162\u0163\u0005\u0001\u0000\u0000"+
		"\u0163\u0164\u0003>\u001f\u0000\u0164\u0165\u0005\u0002\u0000\u0000\u0165"+
		"\u0175\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u001d\u0000\u0000\u0167"+
		"\u0168\u0005\u0001\u0000\u0000\u0168\u0169\u0003@ \u0000\u0169\u016a\u0005"+
		"\u0002\u0000\u0000\u016a\u0175\u0001\u0000\u0000\u0000\u016b\u016c\u0005"+
		"\u001d\u0000\u0000\u016c\u016d\u0005*\u0000\u0000\u016d\u016e\u0005\u0001"+
		"\u0000\u0000\u016e\u016f\u0003@ \u0000\u016f\u0170\u0005\u0002\u0000\u0000"+
		"\u0170\u0175\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u001d\u0000\u0000"+
		"\u0172\u0173\u0005&\u0000\u0000\u0173\u0175\u0005\n\u0000\u0000\u0174"+
		"\u015f\u0001\u0000\u0000\u0000\u0174\u0161\u0001\u0000\u0000\u0000\u0174"+
		"\u0166\u0001\u0000\u0000\u0000\u0174\u016b\u0001\u0000\u0000\u0000\u0174"+
		"\u0171\u0001\u0000\u0000\u0000\u01759\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0006\u001d\uffff\uffff\u0000\u0177\u0178\u0005<\u0000\u0000\u0178\u0183"+
		"\u0001\u0000\u0000\u0000\u0179\u017a\n\u0002\u0000\u0000\u017a\u017b\u0005"+
		"\u0005\u0000\u0000\u017b\u017c\u0003D\"\u0000\u017c\u017d\u0005\u0006"+
		"\u0000\u0000\u017d\u0182\u0001\u0000\u0000\u0000\u017e\u017f\n\u0001\u0000"+
		"\u0000\u017f\u0180\u0005\u001e\u0000\u0000\u0180\u0182\u0005<\u0000\u0000"+
		"\u0181\u0179\u0001\u0000\u0000\u0000\u0181\u017e\u0001\u0000\u0000\u0000"+
		"\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0001\u0000\u0000\u0000\u0184;\u0001\u0000\u0000\u0000\u0185"+
		"\u0183\u0001\u0000\u0000\u0000\u0186\u0187\u0006\u001e\uffff\uffff\u0000"+
		"\u0187\u018e\u0005<\u0000\u0000\u0188\u018e\u0003\u0082A\u0000\u0189\u018a"+
		"\u0005\u0003\u0000\u0000\u018a\u018b\u0003<\u001e\u0000\u018b\u018c\u0005"+
		"\u0004\u0000\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u0186\u0001"+
		"\u0000\u0000\u0000\u018d\u0188\u0001\u0000\u0000\u0000\u018d\u0189\u0001"+
		"\u0000\u0000\u0000\u018e\u0199\u0001\u0000\u0000\u0000\u018f\u0190\n\u0004"+
		"\u0000\u0000\u0190\u0191\u0005\u0005\u0000\u0000\u0191\u0192\u0003D\""+
		"\u0000\u0192\u0193\u0005\u0006\u0000\u0000\u0193\u0198\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\n\u0003\u0000\u0000\u0195\u0196\u0005\u001e\u0000\u0000"+
		"\u0196\u0198\u0005<\u0000\u0000\u0197\u018f\u0001\u0000\u0000\u0000\u0197"+
		"\u0194\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199"+
		"\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a"+
		"=\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u01a1"+
		"\u0003D\"\u0000\u019d\u019e\u0005\t\u0000\u0000\u019e\u01a0\u0003D\"\u0000"+
		"\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a2?\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a9\u0003B!\u0000\u01a5\u01a6\u0005\t\u0000\u0000\u01a6\u01a8\u0003"+
		"B!\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000"+
		"\u0000\u01aaA\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ad\u0005<\u0000\u0000\u01ad\u01ae\u0005\b\u0000\u0000\u01ae"+
		"\u01bc\u0003D\"\u0000\u01af\u01b0\u0005<\u0000\u0000\u01b0\u01b1\u0005"+
		"\b\u0000\u0000\u01b1\u01b2\u0005\u0001\u0000\u0000\u01b2\u01b3\u0003>"+
		"\u001f\u0000\u01b3\u01b4\u0005\u0002\u0000\u0000\u01b4\u01bc\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b6\u0005<\u0000\u0000\u01b6\u01b7\u0005\b\u0000"+
		"\u0000\u01b7\u01b8\u0005\u0001\u0000\u0000\u01b8\u01b9\u0003@ \u0000\u01b9"+
		"\u01ba\u0005\u0002\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb"+
		"\u01ac\u0001\u0000\u0000\u0000\u01bb\u01af\u0001\u0000\u0000\u0000\u01bb"+
		"\u01b5\u0001\u0000\u0000\u0000\u01bcC\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0006\"\uffff\uffff\u0000\u01be\u01cd\u0003<\u001e\u0000\u01bf\u01cd"+
		"\u0005\u000b\u0000\u0000\u01c0\u01cd\u0005\f\u0000\u0000\u01c1\u01cd\u0005"+
		"\u000e\u0000\u0000\u01c2\u01c3\u0005\u0003\u0000\u0000\u01c3\u01c4\u0003"+
		"D\"\u0000\u01c4\u01c5\u0005\u0004\u0000\u0000\u01c5\u01cd\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c7\u0005\u001c\u0000\u0000\u01c7\u01cd\u0003D\""+
		"\u000b\u01c8\u01cd\u0003\u0086C\u0000\u01c9\u01cd\u0003\u0088D\u0000\u01ca"+
		"\u01cd\u0003\u008aE\u0000\u01cb\u01cd\u0003\u009aM\u0000\u01cc\u01bd\u0001"+
		"\u0000\u0000\u0000\u01cc\u01bf\u0001\u0000\u0000\u0000\u01cc\u01c0\u0001"+
		"\u0000\u0000\u0000\u01cc\u01c1\u0001\u0000\u0000\u0000\u01cc\u01c2\u0001"+
		"\u0000\u0000\u0000\u01cc\u01c6\u0001\u0000\u0000\u0000\u01cc\u01c8\u0001"+
		"\u0000\u0000\u0000\u01cc\u01c9\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd\u01e6\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cf\n\n\u0000\u0000\u01cf\u01d0\u0003F#\u0000"+
		"\u01d0\u01d1\u0003D\"\u000b\u01d1\u01e5\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d3\n\t\u0000\u0000\u01d3\u01d4\u0003H$\u0000\u01d4\u01d5\u0003D\""+
		"\n\u01d5\u01e5\u0001\u0000\u0000\u0000\u01d6\u01d7\n\b\u0000\u0000\u01d7"+
		"\u01d8\u0003J%\u0000\u01d8\u01d9\u0003D\"\t\u01d9\u01e5\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\n\u0007\u0000\u0000\u01db\u01dc\u0003L&\u0000\u01dc"+
		"\u01dd\u0003D\"\b\u01dd\u01e5\u0001\u0000\u0000\u0000\u01de\u01df\n\u0006"+
		"\u0000\u0000\u01df\u01e0\u0005\u001a\u0000\u0000\u01e0\u01e5\u0003D\""+
		"\u0007\u01e1\u01e2\n\u0005\u0000\u0000\u01e2\u01e3\u0005\u001b\u0000\u0000"+
		"\u01e3\u01e5\u0003D\"\u0006\u01e4\u01ce\u0001\u0000\u0000\u0000\u01e4"+
		"\u01d2\u0001\u0000\u0000\u0000\u01e4\u01d6\u0001\u0000\u0000\u0000\u01e4"+
		"\u01da\u0001\u0000\u0000\u0000\u01e4\u01de\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e5\u01e8\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7"+
		"E\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0007\u0000\u0000\u0000\u01eaG\u0001\u0000\u0000\u0000\u01eb\u01ec\u0007"+
		"\u0001\u0000\u0000\u01ecI\u0001\u0000\u0000\u0000\u01ed\u01ee\u0007\u0002"+
		"\u0000\u0000\u01eeK\u0001\u0000\u0000\u0000\u01ef\u01f0\u0007\u0003\u0000"+
		"\u0000\u01f0M\u0001\u0000\u0000\u0000\u01f1\u01f2\u0003P(\u0000\u01f2"+
		"\u01f5\u0003l6\u0000\u01f3\u01f4\u0005 \u0000\u0000\u01f4\u01f6\u0003"+
		"l6\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f6O\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\u001f\u0000\u0000"+
		"\u01f8\u01f9\u0005\u0003\u0000\u0000\u01f9\u01fa\u0003D\"\u0000\u01fa"+
		"\u01fb\u0005\u0004\u0000\u0000\u01fbQ\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0003T*\u0000\u01fd\u01fe\u0003v;\u0000\u01feS\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0005!\u0000\u0000\u0200\u0201\u0005\u0003\u0000\u0000\u0201"+
		"\u0202\u0005<\u0000\u0000\u0202\u0203\u0005\b\u0000\u0000\u0203\u0204"+
		"\u0003<\u001e\u0000\u0204\u0205\u0005\u0004\u0000\u0000\u0205U\u0001\u0000"+
		"\u0000\u0000\u0206\u0207\u0003X,\u0000\u0207\u0208\u0003v;\u0000\u0208"+
		"W\u0001\u0000\u0000\u0000\u0209\u020b\u0005\"\u0000\u0000\u020a\u020c"+
		"\u0005#\u0000\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020b\u020c\u0001"+
		"\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020e\u0003"+
		"D\"\u0000\u020eY\u0001\u0000\u0000\u0000\u020f\u0210\u0003P(\u0000\u0210"+
		"\u0213\u0003v;\u0000\u0211\u0212\u0005 \u0000\u0000\u0212\u0214\u0003"+
		"v;\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000"+
		"\u0000\u0214[\u0001\u0000\u0000\u0000\u0215\u0216\u0003P(\u0000\u0216"+
		"\u0219\u0003n7\u0000\u0217\u0218\u0005 \u0000\u0000\u0218\u021a\u0003"+
		"n7\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000"+
		"\u0000\u021a]\u0001\u0000\u0000\u0000\u021b\u021c\u0003T*\u0000\u021c"+
		"\u021d\u0003p8\u0000\u021d_\u0001\u0000\u0000\u0000\u021e\u021f\u0003"+
		"X,\u0000\u021f\u0220\u0003p8\u0000\u0220a\u0001\u0000\u0000\u0000\u0221"+
		"\u0222\u0003P(\u0000\u0222\u0225\u0003p8\u0000\u0223\u0224\u0005 \u0000"+
		"\u0000\u0224\u0226\u0003p8\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225"+
		"\u0226\u0001\u0000\u0000\u0000\u0226c\u0001\u0000\u0000\u0000\u0227\u0228"+
		"\u0003P(\u0000\u0228\u022b\u0003r9\u0000\u0229\u022a\u0005 \u0000\u0000"+
		"\u022a\u022c\u0003r9\u0000\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022c"+
		"\u0001\u0000\u0000\u0000\u022ce\u0001\u0000\u0000\u0000\u022d\u022e\u0003"+
		"T*\u0000\u022e\u022f\u0003t:\u0000\u022fg\u0001\u0000\u0000\u0000\u0230"+
		"\u0231\u0003X,\u0000\u0231\u0232\u0003t:\u0000\u0232i\u0001\u0000\u0000"+
		"\u0000\u0233\u0234\u0003P(\u0000\u0234\u0237\u0003t:\u0000\u0235\u0236"+
		"\u0005 \u0000\u0000\u0236\u0238\u0003t:\u0000\u0237\u0235\u0001\u0000"+
		"\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238k\u0001\u0000\u0000"+
		"\u0000\u0239\u023a\u0005\u0001\u0000\u0000\u023a\u023b\u0003\u0018\f\u0000"+
		"\u023b\u023c\u0005\u0002\u0000\u0000\u023c\u023f\u0001\u0000\u0000\u0000"+
		"\u023d\u023f\u0003$\u0012\u0000\u023e\u0239\u0001\u0000\u0000\u0000\u023e"+
		"\u023d\u0001\u0000\u0000\u0000\u023fm\u0001\u0000\u0000\u0000\u0240\u0241"+
		"\u0005\u0001\u0000\u0000\u0241\u0242\u0003\u001a\r\u0000\u0242\u0243\u0005"+
		"\u0002\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000\u0244\u0246\u0003"+
		"(\u0014\u0000\u0245\u0240\u0001\u0000\u0000\u0000\u0245\u0244\u0001\u0000"+
		"\u0000\u0000\u0246o\u0001\u0000\u0000\u0000\u0247\u0248\u0005\u0001\u0000"+
		"\u0000\u0248\u0249\u0003\u001c\u000e\u0000\u0249\u024a\u0005\u0002\u0000"+
		"\u0000\u024a\u024d\u0001\u0000\u0000\u0000\u024b\u024d\u0003*\u0015\u0000"+
		"\u024c\u0247\u0001\u0000\u0000\u0000\u024c\u024b\u0001\u0000\u0000\u0000"+
		"\u024dq\u0001\u0000\u0000\u0000\u024e\u024f\u0005\u0001\u0000\u0000\u024f"+
		"\u0250\u0003\u001e\u000f\u0000\u0250\u0251\u0005\u0002\u0000\u0000\u0251"+
		"\u0254\u0001\u0000\u0000\u0000\u0252\u0254\u0003,\u0016\u0000\u0253\u024e"+
		"\u0001\u0000\u0000\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0254s\u0001"+
		"\u0000\u0000\u0000\u0255\u0256\u0005\u0001\u0000\u0000\u0256\u0257\u0003"+
		" \u0010\u0000\u0257\u0258\u0005\u0002\u0000\u0000\u0258\u025b\u0001\u0000"+
		"\u0000\u0000\u0259\u025b\u0003.\u0017\u0000\u025a\u0255\u0001\u0000\u0000"+
		"\u0000\u025a\u0259\u0001\u0000\u0000\u0000\u025bu\u0001\u0000\u0000\u0000"+
		"\u025c\u025d\u0005\u0001\u0000\u0000\u025d\u025e\u0003\"\u0011\u0000\u025e"+
		"\u025f\u0005\u0002\u0000\u0000\u025f\u0262\u0001\u0000\u0000\u0000\u0260"+
		"\u0262\u00030\u0018\u0000\u0261\u025c\u0001\u0000\u0000\u0000\u0261\u0260"+
		"\u0001\u0000\u0000\u0000\u0262w\u0001\u0000\u0000\u0000\u0263\u0264\u0005"+
		"$\u0000\u0000\u0264\u0265\u0005\u0007\u0000\u0000\u0265y\u0001\u0000\u0000"+
		"\u0000\u0266\u0267\u0005%\u0000\u0000\u0267\u0268\u0005\u0007\u0000\u0000"+
		"\u0268{\u0001\u0000\u0000\u0000\u0269\u026a\u0005(\u0000\u0000\u026a\u0270"+
		"\u0005\u0007\u0000\u0000\u026b\u026c\u0005(\u0000\u0000\u026c\u026d\u0003"+
		"D\"\u0000\u026d\u026e\u0005\u0007\u0000\u0000\u026e\u0270\u0001\u0000"+
		"\u0000\u0000\u026f\u0269\u0001\u0000\u0000\u0000\u026f\u026b\u0001\u0000"+
		"\u0000\u0000\u0270}\u0001\u0000\u0000\u0000\u0271\u0272\u0005,\u0000\u0000"+
		"\u0272\u0273\u0005\u0007\u0000\u0000\u0273\u007f\u0001\u0000\u0000\u0000"+
		"\u0274\u0275\u0005-\u0000\u0000\u0275\u0276\u0005\u0007\u0000\u0000\u0276"+
		"\u0081\u0001\u0000\u0000\u0000\u0277\u0278\u0005.\u0000\u0000\u0278\u0279"+
		"\u0005\u0003\u0000\u0000\u0279\u0281\u0005\u0004\u0000\u0000\u027a\u027b"+
		"\u0005<\u0000\u0000\u027b\u027d\u0005\u0003\u0000\u0000\u027c\u027e\u0003"+
		"\u0084B\u0000\u027d\u027c\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000"+
		"\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0281\u0005\u0004"+
		"\u0000\u0000\u0280\u0277\u0001\u0000\u0000\u0000\u0280\u027a\u0001\u0000"+
		"\u0000\u0000\u0281\u0083\u0001\u0000\u0000\u0000\u0282\u0287\u0003D\""+
		"\u0000\u0283\u0284\u0005\t\u0000\u0000\u0284\u0286\u0003D\"\u0000\u0285"+
		"\u0283\u0001\u0000\u0000\u0000\u0286\u0289\u0001\u0000\u0000\u0000\u0287"+
		"\u0285\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288"+
		"\u0085\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u028a"+
		"\u028b\u0005/\u0000\u0000\u028b\u028c\u00055\u0000\u0000\u028c\u028d\u0003"+
		"<\u001e\u0000\u028d\u0087\u0001\u0000\u0000\u0000\u028e\u028f\u00050\u0000"+
		"\u0000\u028f\u0089\u0001\u0000\u0000\u0000\u0290\u0291\u00051\u0000\u0000"+
		"\u0291\u008b\u0001\u0000\u0000\u0000\u0292\u0293\u00052\u0000\u0000\u0293"+
		"\u0294\u0005\u0003\u0000\u0000\u0294\u0295\u0003D\"\u0000\u0295\u0296"+
		"\u0005\u0004\u0000\u0000\u0296\u0297\u0005\u0007\u0000\u0000\u0297\u029f"+
		"\u0001\u0000\u0000\u0000\u0298\u0299\u00053\u0000\u0000\u0299\u029a\u0005"+
		"\u0003\u0000\u0000\u029a\u029b\u0003D\"\u0000\u029b\u029c\u0005\u0004"+
		"\u0000\u0000\u029c\u029d\u0005\u0007\u0000\u0000\u029d\u029f\u0001\u0000"+
		"\u0000\u0000\u029e\u0292\u0001\u0000\u0000\u0000\u029e\u0298\u0001\u0000"+
		"\u0000\u0000\u029f\u008d\u0001\u0000\u0000\u0000\u02a0\u02a1\u00056\u0000"+
		"\u0000\u02a1\u02a2\u0003D\"\u0000\u02a2\u02a3\u00055\u0000\u0000\u02a3"+
		"\u02a4\u0003<\u001e\u0000\u02a4\u02a5\u00054\u0000\u0000\u02a5\u02a6\u0003"+
		"<\u001e\u0000\u02a6\u02a7\u0005\u0007\u0000\u0000\u02a7\u008f\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a9\u0003<\u001e\u0000\u02a9\u02ae\u00057\u0000\u0000"+
		"\u02aa\u02ac\u0005#\u0000\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ab"+
		"\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad"+
		"\u02af\u0003D\"\u0000\u02ae\u02ab\u0001\u0000\u0000\u0000\u02ae\u02af"+
		"\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b1"+
		"\u00055\u0000\u0000\u02b1\u02b2\u0003<\u001e\u0000\u02b2\u02b3\u0005\u0007"+
		"\u0000\u0000\u02b3\u0091\u0001\u0000\u0000\u0000\u02b4\u02b5\u00058\u0000"+
		"\u0000\u02b5\u02b6\u0003<\u001e\u0000\u02b6\u02b7\u00055\u0000\u0000\u02b7"+
		"\u02b8\u0003<\u001e\u0000\u02b8\u02b9\u00054\u0000\u0000\u02b9\u02ba\u0003"+
		"<\u001e\u0000\u02ba\u02bb\u0005\u0007\u0000\u0000\u02bb\u0093\u0001\u0000"+
		"\u0000\u0000\u02bc\u02bd\u0003<\u001e\u0000\u02bd\u02be\u00059\u0000\u0000"+
		"\u02be\u02bf\u0003<\u001e\u0000\u02bf\u02c0\u00054\u0000\u0000\u02c0\u02c1"+
		"\u0003<\u001e\u0000\u02c1\u02c2\u0005\u0007\u0000\u0000\u02c2\u0095\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c4\u0005:\u0000\u0000\u02c4\u02c5\u0003<\u001e"+
		"\u0000\u02c5\u02c6\u0005\u0007\u0000\u0000\u02c6\u0097\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c8\u0005;\u0000\u0000\u02c8\u02c9\u0003D\"\u0000\u02c9"+
		"\u02ca\u00055\u0000\u0000\u02ca\u02cb\u0003<\u001e\u0000\u02cb\u02cc\u0005"+
		"\u0007\u0000\u0000\u02cc\u0099\u0001\u0000\u0000\u0000\u02cd\u02ce\u0005"+
		"\r\u0000\u0000\u02ce\u02cf\u0005\u001e\u0000\u0000\u02cf\u02d0\u0005<"+
		"\u0000\u0000\u02d0\u02d2\u0005\u0003\u0000\u0000\u02d1\u02d3\u0003D\""+
		"\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d5\u0005\u0004\u0000"+
		"\u0000\u02d5\u009b\u0001\u0000\u0000\u00006\u00a5\u00ab\u00b6\u00bd\u00c6"+
		"\u00d6\u00e7\u00ec\u00f1\u00f6\u00fb\u0100\u0111\u0117\u011e\u0127\u012f"+
		"\u0139\u0141\u014c\u015d\u0174\u0181\u0183\u018d\u0197\u0199\u01a1\u01a9"+
		"\u01bb\u01cc\u01e4\u01e6\u01f5\u020b\u0213\u0219\u0225\u022b\u0237\u023e"+
		"\u0245\u024c\u0253\u025a\u0261\u026f\u027d\u0280\u0287\u029e\u02ab\u02ae"+
		"\u02d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}