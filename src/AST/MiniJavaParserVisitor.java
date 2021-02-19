/* Generated By:JavaCC: Do not edit this line. MiniJavaParserVisitor.java Version 7.0.9 */
package AST;

public interface MiniJavaParserVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTProgram node, Object data);
  public Object visit(ASTMainClass node, Object data);
  public Object visit(ASTClassDeclSimple node, Object data);
  public Object visit(ASTClassDeclExtends node, Object data);
  public Object visit(ASTVarDecl node, Object data);
  public Object visit(ASTMethodDecl node, Object data);
  public Object visit(ASTFormalList node, Object data);
  public Object visit(ASTFormalRest node, Object data);
  public Object visit(ASTType node, Object data);
  public Object visit(ASTBlock node, Object data);
  public Object visit(ASTIf node, Object data);
  public Object visit(ASTWhile node, Object data);
  public Object visit(ASTPrint node, Object data);
  public Object visit(ASTAssign node, Object data);
  public Object visit(ASTArrayAssign node, Object data);
  public Object visit(ASTRelationalExp node, Object data);
  public Object visit(ASTArrayExp node, Object data);
  public Object visit(ASTCallExp node, Object data);
  public Object visit(ASTAdditiveExp node, Object data);
  public Object visit(ASTMultiplicativeExp node, Object data);
  public Object visit(ASTLengthExp node, Object data);
  public Object visit(ASTRelationalOperator node, Object data);
  public Object visit(ASTAdditiveOperator node, Object data);
  public Object visit(ASTMultiplicativeOperator node, Object data);
  public Object visit(ASTIntegerConstNode node, Object data);
  public Object visit(ASTTrueNode node, Object data);
  public Object visit(ASTFalseNode node, Object data);
  public Object visit(ASTThisNode node, Object data);
  public Object visit(ASTNewIntArrayNode node, Object data);
  public Object visit(ASTNewClassNode node, Object data);
  public Object visit(ASTNotNode node, Object data);
  public Object visit(ASTIdentifier node, Object data);
  public Object visit(ASTExpList node, Object data);
  public Object visit(ASTExpRest node, Object data);
}
/* JavaCC - OriginalChecksum=705cb0ee5d4dee0d2774428d976c1f3c (do not edit this line) */
