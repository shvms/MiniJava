package AST;

import java.util.Arrays;

public class PrettyPrintVisitor implements MiniJavaParserVisitor {

    private int indent = 0;

    private static String indentString(int indent) {
        char[] indentStr = new char[2*indent];
        Arrays.fill(indentStr, '-');
        if (indentStr.length > 0) indentStr[0] = '├';
        return new String(indentStr);
    }

    private Object defaultVisit(SimpleNode node, Object data) {
        System.out.println(indentString(indent) + node + ": "+node.tokenImage());
        ++indent;
        data = node.childrenAccept(this, data);
        --indent;
        return data;
    }

    public Object visit(SimpleNode node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTProgram node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTMainClass node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTClassDeclSimple node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTClassDeclExtends node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTVarDecl node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTMethodDecl node, Object data){
        return defaultVisit(node, data);
    }

    public Object visit(ASTReturnStm node, Object data) {
        return defaultVisit(node, data);
    }

    public Object visit(ASTFormalList node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTFormalRest node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTType node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTBlock node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTIf node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTWhile node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTPrint node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTAssign node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTArrayAssign node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTRelationalExp node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTRelationalOperator node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTAdditiveExp node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTAdditiveOperator node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTMultiplicativeExp node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTLengthExp node, Object data) {
        return defaultVisit(node, data);
    }
    public Object visit(ASTMultiplicativeOperator node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTArrayExp node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTCallExp node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTIntegerConstNode node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTTrueNode node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTFalseNode node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTThisNode node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTNewIntArrayNode node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTNewClassNode node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTNotNode node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTIdentifier node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTExpList node, Object data){
        return defaultVisit(node, data);
    }
    public Object visit(ASTExpRest node, Object data){
        return defaultVisit(node, data);
    }
}