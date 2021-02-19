package AST;

/**
 * SimpleNode extends TNode as it provides helper functions
 * like `tokenImage` to simplify creation of visitors.
 */
public class TNode {
    public Token token;

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public String tokenImage(){
        if(token!=null){
            if(token.image!=null) return token.image;
            else return token.toString();
        }
        return "";
    }
}
