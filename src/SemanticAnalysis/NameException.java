package SemanticAnalysis;

public class NameException extends RuntimeException {
    public NameException(String item) {
        super("'" + item + "' not defined");
    }
}
