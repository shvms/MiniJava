/* Generated By:JJTree: Do not edit this line. ASTThisNode.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=TNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package AST;

public
class ASTThisNode extends SimpleNode {
  public ASTThisNode(int id) {
    super(id);
  }

  public ASTThisNode(MiniJavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MiniJavaParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=d0ced7a1bdd05670772f50bcbdf9ace9 (do not edit this line) */