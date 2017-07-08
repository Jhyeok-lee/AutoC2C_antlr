// Generated from AutoC.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AutoCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, Type=22, StringLiteral=23, Unop=24, 
		Addiop=25, Multop=26, Relaop=27, Eqltop=28, Id=29, Intnum=30, Floatnum=31, 
		WhiteSpace=32, Newline=33, IncludeDirective=34;
	public static final int
		RULE_program = 0, RULE_incList = 1, RULE_directiveDefinition = 2, RULE_declList = 3, 
		RULE_funcList = 4, RULE_declaration = 5, RULE_identList = 6, RULE_identifier = 7, 
		RULE_initializer = 8, RULE_function = 9, RULE_paramList = 10, RULE_compoundStmt = 11, 
		RULE_stmtList = 12, RULE_stmt = 13, RULE_assignStmt = 14, RULE_assign = 15, 
		RULE_callStmt = 16, RULE_call = 17, RULE_retStmt = 18, RULE_whileStmt = 19, 
		RULE_forStmt = 20, RULE_ifStmt = 21, RULE_switchStmt = 22, RULE_caseList = 23, 
		RULE_expr = 24, RULE_argList = 25;
	public static final String[] ruleNames = {
		"program", "incList", "directiveDefinition", "declList", "funcList", "declaration", 
		"identList", "identifier", "initializer", "function", "paramList", "compoundStmt", 
		"stmtList", "stmt", "assignStmt", "assign", "callStmt", "call", "retStmt", 
		"whileStmt", "forStmt", "ifStmt", "switchStmt", "caseList", "expr", "argList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'['", "']'", "'='", "'('", "')'", "'{'", "'}'", "'return'", 
		"'while'", "'do'", "'for'", "'if'", "'else'", "'switch'", "'case'", "':'", 
		"'break;'", "'default'", "'&'", null, null, "'-'", "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "Type", "StringLiteral", 
		"Unop", "Addiop", "Multop", "Relaop", "Eqltop", "Id", "Intnum", "Floatnum", 
		"WhiteSpace", "Newline", "IncludeDirective"
	};
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
	public String getGrammarFileName() { return "AutoC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AutoCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public IncListContext incList() {
			return getRuleContext(IncListContext.class,0);
		}
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public FuncListContext funcList() {
			return getRuleContext(FuncListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if (_la==IncludeDirective) {
				{
				setState(52);
				incList();
				}
			}

			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(55);
				declList(0);
				}
				break;
			}
			setState(59);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(58);
				funcList();
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

	public static class IncListContext extends ParserRuleContext {
		public List<DirectiveDefinitionContext> directiveDefinition() {
			return getRuleContexts(DirectiveDefinitionContext.class);
		}
		public DirectiveDefinitionContext directiveDefinition(int i) {
			return getRuleContext(DirectiveDefinitionContext.class,i);
		}
		public IncListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitIncList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncListContext incList() throws RecognitionException {
		IncListContext _localctx = new IncListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_incList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				directiveDefinition();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IncludeDirective );
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

	public static class DirectiveDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> IncludeDirective() { return getTokens(AutoCParser.IncludeDirective); }
		public TerminalNode IncludeDirective(int i) {
			return getToken(AutoCParser.IncludeDirective, i);
		}
		public DirectiveDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitDirectiveDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveDefinitionContext directiveDefinition() throws RecognitionException {
		DirectiveDefinitionContext _localctx = new DirectiveDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_directiveDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(66);
					match(IncludeDirective);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(69); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public DeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclListContext declList() throws RecognitionException {
		return declList(0);
	}

	private DeclListContext declList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclListContext _localctx = new DeclListContext(_ctx, _parentState);
		DeclListContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_declList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(72);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declList);
					setState(74);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(75);
					declaration();
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class FuncListContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FuncListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitFuncList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncListContext funcList() throws RecognitionException {
		FuncListContext _localctx = new FuncListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				function();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Type );
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(AutoCParser.Type, 0); }
		public IdentListContext identList() {
			return getRuleContext(IdentListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(Type);
			setState(87);
			identList(0);
			setState(88);
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

	public static class IdentListContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentListContext identList() {
			return getRuleContext(IdentListContext.class,0);
		}
		public IdentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitIdentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentListContext identList() throws RecognitionException {
		return identList(0);
	}

	private IdentListContext identList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentListContext _localctx = new IdentListContext(_ctx, _parentState);
		IdentListContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_identList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(91);
			identifier(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identList);
					setState(93);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(94);
					match(T__1);
					setState(95);
					identifier(0);
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(AutoCParser.Id, 0); }
		public TerminalNode Intnum() { return getToken(AutoCParser.Intnum, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		return identifier(0);
	}

	private IdentifierContext identifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierContext _localctx = new IdentifierContext(_ctx, _parentState);
		IdentifierContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_identifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(102);
				match(Id);
				}
				break;
			case 2:
				{
				setState(103);
				match(Id);
				setState(104);
				match(T__2);
				setState(105);
				match(Intnum);
				setState(106);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifier);
					setState(109);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(110);
					match(T__4);
					setState(111);
					initializer();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class InitializerContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			expr(0);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(AutoCParser.Type, 0); }
		public TerminalNode Id() { return getToken(AutoCParser.Id, 0); }
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(Type);
			setState(120);
			match(Id);
			setState(121);
			match(T__5);
			setState(123);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(122);
				paramList(0);
				}
			}

			setState(125);
			match(T__6);
			setState(126);
			compoundStmt();
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

	public static class ParamListContext extends ParserRuleContext {
		public TerminalNode Type() { return getToken(AutoCParser.Type, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		return paramList(0);
	}

	private ParamListContext paramList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParamListContext _localctx = new ParamListContext(_ctx, _parentState);
		ParamListContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_paramList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(129);
			match(Type);
			setState(130);
			identifier(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParamListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_paramList);
					setState(132);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(133);
					match(T__1);
					setState(134);
					match(Type);
					setState(135);
					identifier(0);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class CompoundStmtContext extends ParserRuleContext {
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public FuncListContext funcList() {
			return getRuleContext(FuncListContext.class,0);
		}
		public CompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitCompoundStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStmtContext compoundStmt() throws RecognitionException {
		CompoundStmtContext _localctx = new CompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compoundStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__7);
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(142);
				declList(0);
				}
				break;
			}
			setState(146);
			_la = _input.LA(1);
			if (_la==Type) {
				{
				setState(145);
				funcList();
				}
			}

			setState(148);
			stmtList();
			setState(149);
			match(T__8);
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

	public static class StmtListContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitStmtList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmtList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << Id))) != 0)) {
				{
				{
				setState(151);
				stmt();
				}
				}
				setState(156);
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
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public RetStmtContext retStmt() {
			return getRuleContext(RetStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public SwitchStmtContext switchStmt() {
			return getRuleContext(SwitchStmtContext.class,0);
		}
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmt);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				assignStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				callStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				retStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				whileStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				forStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				ifStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				switchStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(164);
				compoundStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(165);
				match(T__0);
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

	public static class AssignStmtContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitAssignStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			assign();
			setState(169);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(AutoCParser.Id, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(Id);
				setState(172);
				match(T__4);
				setState(173);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(Id);
				setState(175);
				match(T__2);
				setState(176);
				expr(0);
				setState(177);
				match(T__3);
				setState(178);
				match(T__4);
				setState(179);
				expr(0);
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

	public static class CallStmtContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_callStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			call();
			setState(184);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(AutoCParser.Id, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(Id);
			setState(187);
			match(T__5);
			setState(189);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << StringLiteral) | (1L << Unop) | (1L << Id) | (1L << Intnum) | (1L << Floatnum))) != 0)) {
				{
				setState(188);
				argList(0);
				}
			}

			setState(191);
			match(T__6);
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

	public static class RetStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitRetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetStmtContext retStmt() throws RecognitionException {
		RetStmtContext _localctx = new RetStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_retStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__9);
			setState(195);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << StringLiteral) | (1L << Unop) | (1L << Id) | (1L << Intnum) | (1L << Floatnum))) != 0)) {
				{
				setState(194);
				expr(0);
				}
			}

			setState(197);
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

	public static class WhileStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whileStmt);
		try {
			setState(213);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(T__10);
				setState(200);
				match(T__5);
				setState(201);
				expr(0);
				setState(202);
				match(T__6);
				setState(203);
				stmt();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__11);
				setState(206);
				stmt();
				setState(207);
				match(T__10);
				setState(208);
				match(T__5);
				setState(209);
				expr(0);
				setState(210);
				match(T__6);
				setState(211);
				match(T__0);
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

	public static class ForStmtContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__12);
			setState(216);
			match(T__5);
			setState(217);
			assign();
			setState(218);
			match(T__0);
			setState(219);
			expr(0);
			setState(220);
			match(T__0);
			setState(221);
			assign();
			setState(222);
			match(T__6);
			setState(223);
			stmt();
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

	public static class IfStmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__13);
			setState(226);
			match(T__5);
			setState(227);
			expr(0);
			setState(228);
			match(T__6);
			setState(229);
			stmt();
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(230);
				match(T__14);
				setState(231);
				stmt();
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

	public static class SwitchStmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CaseListContext caseList() {
			return getRuleContext(CaseListContext.class,0);
		}
		public SwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__15);
			setState(235);
			match(T__5);
			setState(236);
			identifier(0);
			setState(237);
			match(T__6);
			setState(238);
			match(T__7);
			setState(239);
			caseList();
			setState(240);
			match(T__8);
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

	public static class CaseListContext extends ParserRuleContext {
		public List<TerminalNode> Intnum() { return getTokens(AutoCParser.Intnum); }
		public TerminalNode Intnum(int i) {
			return getToken(AutoCParser.Intnum, i);
		}
		public List<StmtListContext> stmtList() {
			return getRuleContexts(StmtListContext.class);
		}
		public StmtListContext stmtList(int i) {
			return getRuleContext(StmtListContext.class,i);
		}
		public CaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitCaseList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseListContext caseList() throws RecognitionException {
		CaseListContext _localctx = new CaseListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_caseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(242);
				match(T__16);
				setState(243);
				match(Intnum);
				setState(244);
				match(T__17);
				setState(245);
				stmtList();
				setState(247);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(246);
					match(T__18);
					}
				}

				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(254);
				match(T__19);
				setState(255);
				match(T__17);
				setState(256);
				stmtList();
				setState(258);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(257);
					match(T__18);
					}
				}

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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode Unop() { return getToken(AutoCParser.Unop, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TerminalNode Intnum() { return getToken(AutoCParser.Intnum, 0); }
		public TerminalNode Floatnum() { return getToken(AutoCParser.Floatnum, 0); }
		public TerminalNode Id() { return getToken(AutoCParser.Id, 0); }
		public TerminalNode StringLiteral() { return getToken(AutoCParser.StringLiteral, 0); }
		public TerminalNode Addiop() { return getToken(AutoCParser.Addiop, 0); }
		public TerminalNode Multop() { return getToken(AutoCParser.Multop, 0); }
		public TerminalNode Relaop() { return getToken(AutoCParser.Relaop, 0); }
		public TerminalNode Eqltop() { return getToken(AutoCParser.Eqltop, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(263);
				match(Unop);
				setState(264);
				expr(14);
				}
				break;
			case 2:
				{
				setState(265);
				match(T__20);
				setState(266);
				expr(1);
				}
				break;
			case 3:
				{
				setState(267);
				call();
				}
				break;
			case 4:
				{
				setState(268);
				match(Intnum);
				}
				break;
			case 5:
				{
				setState(269);
				match(Floatnum);
				}
				break;
			case 6:
				{
				setState(270);
				match(Id);
				}
				break;
			case 7:
				{
				setState(271);
				match(Id);
				setState(272);
				match(T__2);
				setState(273);
				expr(0);
				setState(274);
				match(T__3);
				}
				break;
			case 8:
				{
				setState(276);
				match(T__5);
				setState(277);
				expr(0);
				setState(278);
				match(T__6);
				}
				break;
			case 9:
				{
				setState(280);
				match(StringLiteral);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(284);
						match(Unop);
						setState(285);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(287);
						match(Addiop);
						setState(288);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(290);
						match(Multop);
						setState(291);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(293);
						match(Relaop);
						setState(294);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(296);
						match(Eqltop);
						setState(297);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class ArgListContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoCVisitor ) return ((AutoCVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		return argList(0);
	}

	private ArgListContext argList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgListContext _localctx = new ArgListContext(_ctx, _parentState);
		ArgListContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_argList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(304);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argList);
					setState(306);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(307);
					match(T__1);
					setState(308);
					expr(0);
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return declList_sempred((DeclListContext)_localctx, predIndex);
		case 6:
			return identList_sempred((IdentListContext)_localctx, predIndex);
		case 7:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 10:
			return paramList_sempred((ParamListContext)_localctx, predIndex);
		case 24:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 25:
			return argList_sempred((ArgListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean declList_sempred(DeclListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identList_sempred(IdentListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean paramList_sempred(ParamListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		}
		return true;
	}
	private boolean argList_sempred(ArgListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u013d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\5\28\n\2\3\2\5\2;\n\2\3\2\5\2>\n\2\3\3\6\3A\n"+
		"\3\r\3\16\3B\3\4\6\4F\n\4\r\4\16\4G\3\5\3\5\3\5\3\5\3\5\7\5O\n\5\f\5\16"+
		"\5R\13\5\3\6\6\6U\n\6\r\6\16\6V\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\7\bc\n\b\f\b\16\bf\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\t\3\t\3"+
		"\t\7\ts\n\t\f\t\16\tv\13\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13~\n\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008b\n\f\f\f\16\f\u008e"+
		"\13\f\3\r\3\r\5\r\u0092\n\r\3\r\5\r\u0095\n\r\3\r\3\r\3\r\3\16\7\16\u009b"+
		"\n\16\f\16\16\16\u009e\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00a9\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00b8\n\21\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00c0"+
		"\n\23\3\23\3\23\3\24\3\24\5\24\u00c6\n\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d8\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00eb\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u00fa\n\31\7\31\u00fc\n\31\f\31\16\31\u00ff"+
		"\13\31\3\31\3\31\3\31\3\31\5\31\u0105\n\31\5\31\u0107\n\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u011c\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u012d\n\32\f\32\16\32\u0130\13"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0138\n\33\f\33\16\33\u013b\13"+
		"\33\3\33\2\b\b\16\20\26\62\64\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\2\2\u0150\2\67\3\2\2\2\4@\3\2\2\2\6E\3\2\2\2\bI\3\2"+
		"\2\2\nT\3\2\2\2\fX\3\2\2\2\16\\\3\2\2\2\20m\3\2\2\2\22w\3\2\2\2\24y\3"+
		"\2\2\2\26\u0082\3\2\2\2\30\u008f\3\2\2\2\32\u009c\3\2\2\2\34\u00a8\3\2"+
		"\2\2\36\u00aa\3\2\2\2 \u00b7\3\2\2\2\"\u00b9\3\2\2\2$\u00bc\3\2\2\2&\u00c3"+
		"\3\2\2\2(\u00d7\3\2\2\2*\u00d9\3\2\2\2,\u00e3\3\2\2\2.\u00ec\3\2\2\2\60"+
		"\u00fd\3\2\2\2\62\u011b\3\2\2\2\64\u0131\3\2\2\2\668\5\4\3\2\67\66\3\2"+
		"\2\2\678\3\2\2\28:\3\2\2\29;\5\b\5\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<>\5"+
		"\n\6\2=<\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?A\5\6\4\2@?\3\2\2\2AB\3\2\2\2B@"+
		"\3\2\2\2BC\3\2\2\2C\5\3\2\2\2DF\7$\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2G"+
		"H\3\2\2\2H\7\3\2\2\2IJ\b\5\1\2JK\5\f\7\2KP\3\2\2\2LM\f\3\2\2MO\5\f\7\2"+
		"NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\t\3\2\2\2RP\3\2\2\2SU\5\24\13"+
		"\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\13\3\2\2\2XY\7\30\2\2YZ\5"+
		"\16\b\2Z[\7\3\2\2[\r\3\2\2\2\\]\b\b\1\2]^\5\20\t\2^d\3\2\2\2_`\f\3\2\2"+
		"`a\7\4\2\2ac\5\20\t\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\17\3\2"+
		"\2\2fd\3\2\2\2gh\b\t\1\2hn\7\37\2\2ij\7\37\2\2jk\7\5\2\2kl\7 \2\2ln\7"+
		"\6\2\2mg\3\2\2\2mi\3\2\2\2nt\3\2\2\2op\f\3\2\2pq\7\7\2\2qs\5\22\n\2ro"+
		"\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vt\3\2\2\2wx\5\62\32"+
		"\2x\23\3\2\2\2yz\7\30\2\2z{\7\37\2\2{}\7\b\2\2|~\5\26\f\2}|\3\2\2\2}~"+
		"\3\2\2\2~\177\3\2\2\2\177\u0080\7\t\2\2\u0080\u0081\5\30\r\2\u0081\25"+
		"\3\2\2\2\u0082\u0083\b\f\1\2\u0083\u0084\7\30\2\2\u0084\u0085\5\20\t\2"+
		"\u0085\u008c\3\2\2\2\u0086\u0087\f\3\2\2\u0087\u0088\7\4\2\2\u0088\u0089"+
		"\7\30\2\2\u0089\u008b\5\20\t\2\u008a\u0086\3\2\2\2\u008b\u008e\3\2\2\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\27\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0091\7\n\2\2\u0090\u0092\5\b\5\2\u0091\u0090\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095\5\n\6\2\u0094\u0093\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\5\32\16\2\u0097"+
		"\u0098\7\13\2\2\u0098\31\3\2\2\2\u0099\u009b\5\34\17\2\u009a\u0099\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\33\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a9\5\36\20\2\u00a0\u00a9\5\""+
		"\22\2\u00a1\u00a9\5&\24\2\u00a2\u00a9\5(\25\2\u00a3\u00a9\5*\26\2\u00a4"+
		"\u00a9\5,\27\2\u00a5\u00a9\5.\30\2\u00a6\u00a9\5\30\r\2\u00a7\u00a9\7"+
		"\3\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8"+
		"\u00a2\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a5\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\35\3\2\2\2\u00aa\u00ab"+
		"\5 \21\2\u00ab\u00ac\7\3\2\2\u00ac\37\3\2\2\2\u00ad\u00ae\7\37\2\2\u00ae"+
		"\u00af\7\7\2\2\u00af\u00b8\5\62\32\2\u00b0\u00b1\7\37\2\2\u00b1\u00b2"+
		"\7\5\2\2\u00b2\u00b3\5\62\32\2\u00b3\u00b4\7\6\2\2\u00b4\u00b5\7\7\2\2"+
		"\u00b5\u00b6\5\62\32\2\u00b6\u00b8\3\2\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00b0"+
		"\3\2\2\2\u00b8!\3\2\2\2\u00b9\u00ba\5$\23\2\u00ba\u00bb\7\3\2\2\u00bb"+
		"#\3\2\2\2\u00bc\u00bd\7\37\2\2\u00bd\u00bf\7\b\2\2\u00be\u00c0\5\64\33"+
		"\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2"+
		"\7\t\2\2\u00c2%\3\2\2\2\u00c3\u00c5\7\f\2\2\u00c4\u00c6\5\62\32\2\u00c5"+
		"\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\3"+
		"\2\2\u00c8\'\3\2\2\2\u00c9\u00ca\7\r\2\2\u00ca\u00cb\7\b\2\2\u00cb\u00cc"+
		"\5\62\32\2\u00cc\u00cd\7\t\2\2\u00cd\u00ce\5\34\17\2\u00ce\u00d8\3\2\2"+
		"\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1\5\34\17\2\u00d1\u00d2\7\r\2\2\u00d2"+
		"\u00d3\7\b\2\2\u00d3\u00d4\5\62\32\2\u00d4\u00d5\7\t\2\2\u00d5\u00d6\7"+
		"\3\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00c9\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d8"+
		")\3\2\2\2\u00d9\u00da\7\17\2\2\u00da\u00db\7\b\2\2\u00db\u00dc\5 \21\2"+
		"\u00dc\u00dd\7\3\2\2\u00dd\u00de\5\62\32\2\u00de\u00df\7\3\2\2\u00df\u00e0"+
		"\5 \21\2\u00e0\u00e1\7\t\2\2\u00e1\u00e2\5\34\17\2\u00e2+\3\2\2\2\u00e3"+
		"\u00e4\7\20\2\2\u00e4\u00e5\7\b\2\2\u00e5\u00e6\5\62\32\2\u00e6\u00e7"+
		"\7\t\2\2\u00e7\u00ea\5\34\17\2\u00e8\u00e9\7\21\2\2\u00e9\u00eb\5\34\17"+
		"\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb-\3\2\2\2\u00ec\u00ed"+
		"\7\22\2\2\u00ed\u00ee\7\b\2\2\u00ee\u00ef\5\20\t\2\u00ef\u00f0\7\t\2\2"+
		"\u00f0\u00f1\7\n\2\2\u00f1\u00f2\5\60\31\2\u00f2\u00f3\7\13\2\2\u00f3"+
		"/\3\2\2\2\u00f4\u00f5\7\23\2\2\u00f5\u00f6\7 \2\2\u00f6\u00f7\7\24\2\2"+
		"\u00f7\u00f9\5\32\16\2\u00f8\u00fa\7\25\2\2\u00f9\u00f8\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0106\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0101\7\26\2\2\u0101\u0102\7\24\2\2\u0102\u0104\5"+
		"\32\16\2\u0103\u0105\7\25\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2"+
		"\u0105\u0107\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0107\3\2\2\2\u0107\61"+
		"\3\2\2\2\u0108\u0109\b\32\1\2\u0109\u010a\7\32\2\2\u010a\u011c\5\62\32"+
		"\20\u010b\u010c\7\27\2\2\u010c\u011c\5\62\32\3\u010d\u011c\5$\23\2\u010e"+
		"\u011c\7 \2\2\u010f\u011c\7!\2\2\u0110\u011c\7\37\2\2\u0111\u0112\7\37"+
		"\2\2\u0112\u0113\7\5\2\2\u0113\u0114\5\62\32\2\u0114\u0115\7\6\2\2\u0115"+
		"\u011c\3\2\2\2\u0116\u0117\7\b\2\2\u0117\u0118\5\62\32\2\u0118\u0119\7"+
		"\t\2\2\u0119\u011c\3\2\2\2\u011a\u011c\7\31\2\2\u011b\u0108\3\2\2\2\u011b"+
		"\u010b\3\2\2\2\u011b\u010d\3\2\2\2\u011b\u010e\3\2\2\2\u011b\u010f\3\2"+
		"\2\2\u011b\u0110\3\2\2\2\u011b\u0111\3\2\2\2\u011b\u0116\3\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011c\u012e\3\2\2\2\u011d\u011e\f\17\2\2\u011e\u011f\7"+
		"\32\2\2\u011f\u012d\5\62\32\20\u0120\u0121\f\16\2\2\u0121\u0122\7\33\2"+
		"\2\u0122\u012d\5\62\32\17\u0123\u0124\f\r\2\2\u0124\u0125\7\34\2\2\u0125"+
		"\u012d\5\62\32\16\u0126\u0127\f\f\2\2\u0127\u0128\7\35\2\2\u0128\u012d"+
		"\5\62\32\r\u0129\u012a\f\13\2\2\u012a\u012b\7\36\2\2\u012b\u012d\5\62"+
		"\32\f\u012c\u011d\3\2\2\2\u012c\u0120\3\2\2\2\u012c\u0123\3\2\2\2\u012c"+
		"\u0126\3\2\2\2\u012c\u0129\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\63\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132"+
		"\b\33\1\2\u0132\u0133\5\62\32\2\u0133\u0139\3\2\2\2\u0134\u0135\f\3\2"+
		"\2\u0135\u0136\7\4\2\2\u0136\u0138\5\62\32\2\u0137\u0134\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\65\3\2\2"+
		"\2\u013b\u0139\3\2\2\2\37\67:=BGPVdmt}\u008c\u0091\u0094\u009c\u00a8\u00b7"+
		"\u00bf\u00c5\u00d7\u00ea\u00f9\u00fd\u0104\u0106\u011b\u012c\u012e\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}