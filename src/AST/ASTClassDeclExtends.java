/* Generated By:JJTree: Do not edit this line. ASTClassDeclExtends.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=TNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package AST;

public
class ASTClassDeclExtends extends SimpleNode {
  public ASTClassDeclExtends(int id) {
    super(id);
  }

  public ASTClassDeclExtends(MiniJavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MiniJavaParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8c1d621c3730fdacf22fb1513ec431ee (do not edit this line) */
