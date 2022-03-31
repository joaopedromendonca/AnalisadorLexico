package antlr4Grammar;

// Generated from LabeledExpr.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeledExprParser}.
 */
public interface LabeledExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(LabeledExprParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(LabeledExprParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void enterListDecl(LabeledExprParser.ListDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#listDecl}.
	 * @param ctx the parse tree
	 */
	void exitListDecl(LabeledExprParser.ListDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#declTip}.
	 * @param ctx the parse tree
	 */
	void enterDeclTip(LabeledExprParser.DeclTipContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#declTip}.
	 * @param ctx the parse tree
	 */
	void exitDeclTip(LabeledExprParser.DeclTipContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#listId}.
	 * @param ctx the parse tree
	 */
	void enterListId(LabeledExprParser.ListIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#listId}.
	 * @param ctx the parse tree
	 */
	void exitListId(LabeledExprParser.ListIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#tip}.
	 * @param ctx the parse tree
	 */
	void enterTip(LabeledExprParser.TipContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#tip}.
	 * @param ctx the parse tree
	 */
	void exitTip(LabeledExprParser.TipContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void enterCmdComp(LabeledExprParser.CmdCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#cmdComp}.
	 * @param ctx the parse tree
	 */
	void exitCmdComp(LabeledExprParser.CmdCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void enterListCmd(LabeledExprParser.ListCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#listCmd}.
	 * @param ctx the parse tree
	 */
	void exitListCmd(LabeledExprParser.ListCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LabeledExprParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LabeledExprParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(LabeledExprParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(LabeledExprParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(LabeledExprParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(LabeledExprParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(LabeledExprParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(LabeledExprParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(LabeledExprParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(LabeledExprParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#listW}.
	 * @param ctx the parse tree
	 */
	void enterListW(LabeledExprParser.ListWContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#listW}.
	 * @param ctx the parse tree
	 */
	void exitListW(LabeledExprParser.ListWContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#elemW}.
	 * @param ctx the parse tree
	 */
	void enterElemW(LabeledExprParser.ElemWContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#elemW}.
	 * @param ctx the parse tree
	 */
	void exitElemW(LabeledExprParser.ElemWContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtrib(LabeledExprParser.CmdAtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtrib(LabeledExprParser.CmdAtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LabeledExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LabeledExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#exprr}.
	 * @param ctx the parse tree
	 */
	void enterExprr(LabeledExprParser.ExprrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#exprr}.
	 * @param ctx the parse tree
	 */
	void exitExprr(LabeledExprParser.ExprrContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#expra}.
	 * @param ctx the parse tree
	 */
	void enterExpra(LabeledExprParser.ExpraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#expra}.
	 * @param ctx the parse tree
	 */
	void exitExpra(LabeledExprParser.ExpraContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#exprm}.
	 * @param ctx the parse tree
	 */
	void enterExprm(LabeledExprParser.ExprmContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#exprm}.
	 * @param ctx the parse tree
	 */
	void exitExprm(LabeledExprParser.ExprmContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#expraf}.
	 * @param ctx the parse tree
	 */
	void enterExpraf(LabeledExprParser.ExprafContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#expraf}.
	 * @param ctx the parse tree
	 */
	void exitExpraf(LabeledExprParser.ExprafContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#exprrf}.
	 * @param ctx the parse tree
	 */
	void enterExprrf(LabeledExprParser.ExprrfContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#exprrf}.
	 * @param ctx the parse tree
	 */
	void exitExprrf(LabeledExprParser.ExprrfContext ctx);
}