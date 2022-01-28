// Generated from C:/prog/ITMO/5 term/MT.Lab3\CppParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CppParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CppParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CppParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(CppParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CppParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#funcSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncSignature(CppParser.FuncSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(CppParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(CppParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBody(CppParser.FuncBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#if_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_rule(CppParser.If_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#while_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_rule(CppParser.While_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#return_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_rule(CppParser.Return_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#argsExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsExpr(CppParser.ArgsExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(CppParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(CppParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(CppParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CppParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#var_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_definition(CppParser.Var_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CppParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#not_array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_array_type(CppParser.Not_array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(CppParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CppParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CppParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ternar_op}
	 * labeled alternative in {@link CppParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernar_op(CppParser.Ternar_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op_level_2}
	 * labeled alternative in {@link CppParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level_2(CppParser.Op_level_2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code op_level_1}
	 * labeled alternative in {@link CppParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level_1(CppParser.Op_level_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code rvalue}
	 * labeled alternative in {@link CppParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalue(CppParser.RvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op_level_4}
	 * labeled alternative in {@link CppParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level_4(CppParser.Op_level_4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code op_level_3}
	 * labeled alternative in {@link CppParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level_3(CppParser.Op_level_3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code op_level_6}
	 * labeled alternative in {@link CppParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level_6(CppParser.Op_level_6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code op_level_5}
	 * labeled alternative in {@link CppParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_level_5(CppParser.Op_level_5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code braces}
	 * labeled alternative in {@link CppParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(CppParser.BracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CppParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CppParser.AssignContext ctx);
}