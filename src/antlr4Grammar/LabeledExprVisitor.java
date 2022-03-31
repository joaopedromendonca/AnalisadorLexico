package antlr4Grammar;

// Generated from LabeledExpr.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(LabeledExprParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#listDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDecl(LabeledExprParser.ListDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#declTip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclTip(LabeledExprParser.DeclTipContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#listId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListId(LabeledExprParser.ListIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#tip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTip(LabeledExprParser.TipContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#cmdComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdComp(LabeledExprParser.CmdCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#listCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListCmd(LabeledExprParser.ListCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(LabeledExprParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#cmdIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIf(LabeledExprParser.CmdIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#cmdWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWhile(LabeledExprParser.CmdWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#cmdRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRead(LabeledExprParser.CmdReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#cmdWrite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWrite(LabeledExprParser.CmdWriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#listW}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListW(LabeledExprParser.ListWContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#elemW}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemW(LabeledExprParser.ElemWContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#cmdAtrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtrib(LabeledExprParser.CmdAtribContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LabeledExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#exprr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprr(LabeledExprParser.ExprrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#expra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpra(LabeledExprParser.ExpraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#exprm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprm(LabeledExprParser.ExprmContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#expraf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpraf(LabeledExprParser.ExprafContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#exprrf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprrf(LabeledExprParser.ExprrfContext ctx);
}