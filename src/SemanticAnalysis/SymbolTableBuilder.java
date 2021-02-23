package SemanticAnalysis;

import AST.*;

public class SymbolTableBuilder implements MiniJavaParserVisitor {
    private final SymbolTable programSymbolTable;

    public SymbolTableBuilder() {
        programSymbolTable = new SymbolTable();
    }

    public SymbolTable getSymbolTable() { return programSymbolTable; }

    public Object visit(SimpleNode node, Object data) {
        return null;
    }

    public Object visit(ASTProgram node, Object data) {
        node.childrenAccept(this, data);
        return null;
    }

    public Object visit(ASTMainClass node, Object data) {
        ASTIdentifier className = (ASTIdentifier) node.jjtGetChild(0);
        programSymbolTable.addClass(className.tokenImage());
        node.childrenAccept(this, data);
        return null;
    }

    public Object visit(ASTClassDecl node, Object data) {
        ASTIdentifier className = (ASTIdentifier) node.jjtGetChild(0);

        programSymbolTable.addClass(className.tokenImage());

        if (node.jjtGetNumChildren() > 1 && node.jjtGetChild(1) instanceof ASTIdentifier) {
            ASTIdentifier superClass = (ASTIdentifier) node.jjtGetChild(1);
            programSymbolTable.classes.get(className.tokenImage()).superClass = superClass.tokenImage();
        }

        node.childrenAccept(this, data);
        return null;
    }

    public Object visit(ASTVarDecl node, Object data) {
        ASTType type = (ASTType) node.jjtGetChild(0);
        ASTIdentifier id = (ASTIdentifier) node.jjtGetChild(1);

        if (node.jjtGetParent() instanceof ASTClassDecl) {
            ASTClassDecl classDecl = (ASTClassDecl) node.jjtGetParent();
            programSymbolTable.addField(id.tokenImage(), type, Helper.toClassName(classDecl));
        } else if (node.jjtGetParent() instanceof ASTMethodDecl) {
            ASTMethodDecl methodDecl = (ASTMethodDecl) node.jjtGetParent();

            programSymbolTable.addLocal(
                id.tokenImage(),
                type,
                Helper.toMethodName(methodDecl),
                Helper.toClassName((ASTClassDecl) methodDecl.jjtGetParent())
            );
        }

        return null;
    }

    public Object visit(ASTMethodDecl node, Object data) {
        ASTType retType = (ASTType) node.jjtGetChild(0);
        ASTIdentifier methodName = (ASTIdentifier) node.jjtGetChild(1);
        ASTClassDecl classDecl = (ASTClassDecl) node.jjtGetParent();

        programSymbolTable.addMethod(methodName.tokenImage(), retType, Helper.toClassName(classDecl));

        node.childrenAccept(this, data);

        return null;
    }

    public Object visit(ASTReturnStm node, Object data) {
        return null;
    }

    public Object visit(ASTFormalList node, Object data) {
        if (node.jjtGetNumChildren() > 0) {
            ASTType type = (ASTType) node.jjtGetChild(0);
            ASTIdentifier id = (ASTIdentifier) node.jjtGetChild(1);
            ASTMethodDecl methodDecl = (ASTMethodDecl) node.jjtGetParent();
            ASTClassDecl classDecl = (ASTClassDecl) methodDecl.jjtGetParent();

            programSymbolTable.addParam(id.tokenImage(), type, Helper.toMethodName(methodDecl), Helper.toClassName(classDecl));
        }

        node.childrenAccept(this, data);

        return null;
    }

    public Object visit(ASTFormalRest node, Object data) {
        ASTType type = (ASTType) node.jjtGetChild(0);
        ASTIdentifier id = (ASTIdentifier) node.jjtGetChild(1);
        ASTMethodDecl methodDecl = (ASTMethodDecl) ((ASTFormalList) node.jjtGetParent()).jjtGetParent();
        ASTClassDecl classDecl = (ASTClassDecl) methodDecl.jjtGetParent();

        programSymbolTable.addParam(id.tokenImage(), type, Helper.toMethodName(methodDecl), Helper.toClassName(classDecl));

        return null;
    }

    public Object visit(ASTType node, Object data) {
        return null;
    }

    public Object visit(ASTBlock node, Object data) {
        return null;
    }

    public Object visit(ASTIf node, Object data) {
        return null;
    }

    public Object visit(ASTWhile node, Object data) {
        return null;
    }

    public Object visit(ASTPrint node, Object data) {
        return null;
    }

    public Object visit(ASTAssign node, Object data) {
        return null;
    }

    public Object visit(ASTArrayAssign node, Object data) {
        return null;
    }

    public Object visit(ASTRelationalExp node, Object data) {
        return null;
    }

    public Object visit(ASTArrayExp node, Object data) {
        return null;
    }

    public Object visit(ASTCallExp node, Object data) {
        return null;
    }

    public Object visit(ASTAdditiveExp node, Object data) {
        return null;
    }

    public Object visit(ASTMultiplicativeExp node, Object data) {
        return null;
    }

    public Object visit(ASTLengthExp node, Object data) {
        return null;
    }

    public Object visit(ASTRelationalOperator node, Object data) {
        return null;
    }

    public Object visit(ASTAdditiveOperator node, Object data) {
        return null;
    }

    public Object visit(ASTMultiplicativeOperator node, Object data) {
        return null;
    }

    public Object visit(ASTIntegerConstNode node, Object data) {
        return null;
    }

    public Object visit(ASTTrueNode node, Object data) {
        return null;
    }

    public Object visit(ASTFalseNode node, Object data) {
        return null;
    }

    public Object visit(ASTThisNode node, Object data) {
        return null;
    }

    public Object visit(ASTNewIntArrayNode node, Object data) {
        return null;
    }

    public Object visit(ASTNewClassNode node, Object data) {
        return null;
    }

    public Object visit(ASTNotNode node, Object data) {
        return null;
    }

    public Object visit(ASTIdentifier node, Object data) {
        return null;
    }

    public Object visit(ASTExpList node, Object data) {
        return null;
    }

    public Object visit(ASTExpRest node, Object data) {
        return null;
    }
}
