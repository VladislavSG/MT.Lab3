// Generated from D:/prog/ITMO/5-term/MT/Lab3\CppParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CppParser}.
 */
public interface CppParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CppParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(CppParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(CppParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CppParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CppParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#funcSignature}.
	 * @param ctx the parse tree
	 */
	void enterFuncSignature(CppParser.FuncSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#funcSignature}.
	 * @param ctx the parse tree
	 */
	void exitFuncSignature(CppParser.FuncSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(CppParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(CppParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(CppParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(CppParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#return_rule}.
	 * @param ctx the parse tree
	 */
	void enterReturn_rule(CppParser.Return_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#return_rule}.
	 * @param ctx the parse tree
	 */
	void exitReturn_rule(CppParser.Return_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#argsExpr}.
	 * @param ctx the parse tree
	 */
	void enterArgsExpr(CppParser.ArgsExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#argsExpr}.
	 * @param ctx the parse tree
	 */
	void exitArgsExpr(CppParser.ArgsExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(CppParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(CppParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(CppParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(CppParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CppParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CppParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#var_definition}.
	 * @param ctx the parse tree
	 */
	void enterVar_definition(CppParser.Var_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#var_definition}.
	 * @param ctx the parse tree
	 */
	void exitVar_definition(CppParser.Var_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CppParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CppParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CppParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CppParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternar_op}
	 * labeled alternative in {@link CppParser#e()}.
	 * @param ctx the parse tree
	 */
	void enterTernar_op(CppParser.Ternar_opContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternar_op}
	 * labeled alternative in {@link CppParser#e()}.
	 * @param ctx the parse tree
	 */
	void exitTernar_op(CppParser.Ternar_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op_level_2}
	 * labeled alternative in {@link CppParser#e()}.
	 * @param ctx the parse tree
	 */
	void enterOp_level_2(CppParser.Op_level_2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code op_level_2}
	 * labeled alternative in {@link CppParser#e()}.
	 * @param ctx the parse tree
	 */
	void exitOp_level_2(CppParser.Op_level_2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code op_level_1}
	 * labeled alternative in {@link CppParser#e()}.
	 * @param ctx the parse tree
	 */
	void enterOp_level_1(CppParser.Op_level_1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code op_level_1}
	 * labeled alternative in {@link CppParser#e()}.
	 * @param ctx the parse tree
	 */
	void exitOp_level_1(CppParser.Op_level_1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code rvalue}
	 * labeled alternative in {@link CppParser#e()}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(CppParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rvalue}
	 * labeled alternative in {@link CppParser#e()}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(CppParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code braces}
	 * labeled alternative in {@link CppParser#e()}.
	 * @param ctx the parse tree
	 */
	void enterBraces(CppParser.BracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code braces}
	 * labeled alternative in {@link CppParser#e()}.
	 * @param ctx the parse tree
	 */
	void exitBraces(CppParser.BracesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CppParser#e()}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CppParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CppParser#e()}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CppParser.AssignContext ctx);
}