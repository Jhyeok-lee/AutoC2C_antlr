// Generated from AutoC.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AutoCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AutoCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AutoCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AutoCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#incList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncList(AutoCParser.IncListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#directiveDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveDefinition(AutoCParser.DirectiveDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#declList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclList(AutoCParser.DeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#funcList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncList(AutoCParser.FuncListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AutoCParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#identList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentList(AutoCParser.IdentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(AutoCParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(AutoCParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AutoCParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(AutoCParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmt(AutoCParser.CompoundStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtList(AutoCParser.StmtListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(AutoCParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(AutoCParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(AutoCParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#callStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStmt(AutoCParser.CallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(AutoCParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#retStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetStmt(AutoCParser.RetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(AutoCParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(AutoCParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(AutoCParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#switchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(AutoCParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#caseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseList(AutoCParser.CaseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AutoCParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoCParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(AutoCParser.ArgListContext ctx);
}