package SemanticAnalysis;

import AST.ASTClassDecl;
import AST.ASTIdentifier;
import AST.ASTMethodDecl;
import AST.ASTType;

public class Helper {
    public static String toClassName(ASTClassDecl node) {
        ASTIdentifier className = (ASTIdentifier) node.jjtGetChild(0);
        return className.tokenImage();
    }

    public static String toMethodName(ASTMethodDecl node) {
        ASTIdentifier methodName = (ASTIdentifier) node.jjtGetChild(1);
        return methodName.tokenImage();
    }

    public static String toTypeName(ASTType node) {
        if (node.jjtGetNumChildren() > 0 && node.jjtGetChild(0) instanceof ASTIdentifier) {
            return ((ASTIdentifier) node.jjtGetChild(0)).tokenImage();
        }

        return node.tokenImage();
    }
}
