package SemanticAnalysis;

import AST.ASTType;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    Map<String, ClassSymbolTable> classes;

    public SymbolTable() {
        classes = new HashMap<>();
    }

    static class ClassSymbolTable {
        Map<String, ASTType> fields;
        Map<String, MethodSymbolTable> methods;
        String superClass;

        public ClassSymbolTable() {
            fields = new HashMap<>();
            methods = new HashMap<>();
            superClass = null;
        }
    }

    static class MethodSymbolTable {
        Map<String, ASTType> params;
        Map<String, ASTType> locals;
        ASTType returnType;

        public MethodSymbolTable(ASTType retType) {
            params = new HashMap<>();
            locals = new HashMap<>();
            returnType = retType;
        }
    }

    public void addClass(String className) {
        if (classes.containsKey(className)) throw new DuplicateException(className);
        classes.put(className, new ClassSymbolTable());
    }

    public void addField(String id, ASTType type, String className) {
        if (!classes.containsKey(className)) throw new NameException(className);

        ClassSymbolTable cst = classes.get(className);
        if (cst.fields.containsKey(id)) throw new DuplicateException(id);
        cst.fields.put(id, type);
    }

    public void addMethod(String id, ASTType returnType, String className) {
        if (!classes.containsKey(className)) throw new NameException(className);

        ClassSymbolTable cst = classes.get(className);
        if (cst.methods.containsKey(id)) throw new DuplicateException(id);
        cst.methods.put(id, new MethodSymbolTable(returnType));
    }

    public void addParam(String id, ASTType type, String methodName, String className) {
        if (!classes.containsKey(className)) throw new NameException(className);
        if (!classes.get(className).methods.containsKey(methodName)) throw new NameException(methodName);

        MethodSymbolTable mst = classes.get(className).methods.get(methodName);
        if (mst.params.containsKey(id)) throw new DuplicateException(id);
        mst.params.put(id, type);
    }

    public void addLocal(String id, ASTType type, String methodName, String className) {
        if (!classes.containsKey(className)) throw new NameException(className);
        if (!classes.get(className).methods.containsKey(methodName)) throw new NameException(methodName);

        MethodSymbolTable mst = classes.get(className).methods.get(methodName);
        if (mst.locals.containsKey(id)) throw new DuplicateException(id);
        mst.locals.put(id, type);
    }

    public String toString() {
        StringBuilder out = new StringBuilder();

        for (String className : classes.keySet()) {
            out.append("Class: ").append(className).append("\n");

            out.append("\tFields:\n");
            ClassSymbolTable cst = classes.get(className);
            for(String fieldName : cst.fields.keySet()) {
                out.append("\t\t").append(fieldName).append(" -> ").append(
                    Helper.toTypeName(cst.fields.get(fieldName))
                ).append("\n");
            }

            for(String methodName : cst.methods.keySet()) {
                out.append("\tMethod: ").append(methodName).append("\n");

                MethodSymbolTable mst = cst.methods.get(methodName);
                out.append("\t\tParams:\n");
                for(String paramName : mst.params.keySet()) {
                    out.append("\t\t\t").append(paramName).append(" -> ").append(
                        Helper.toTypeName(mst.params.get(paramName))
                    ).append("\n");
                }

                out.append("\t\tLocals:\n");
                for(String localName : mst.locals.keySet()) {
                    out.append("\t\t\t").append(localName).append(" -> ").append(
                        Helper.toTypeName(mst.locals.get(localName))
                    ).append("\n");
                }
            }

            out.append("----------------------------------------------------------\n");
        }

        return out.toString();
    }
}
