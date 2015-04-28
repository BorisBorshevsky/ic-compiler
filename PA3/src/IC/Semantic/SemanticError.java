package IC.Semantic;

import IC.ICCompilerError;

public class SemanticError extends ICCompilerError {

    public SemanticError(String message) {
        super(message);
    }

    public SemanticError(String message, int line) {
        super(message, line);
        this.line = line;
    }

    public SemanticError(String message, int line, String value) {
        super(message, line, value);
    }

    public String toString() {
        String msg = "semantic error at line " + this.line + ": " + this.getMessage();
        if (value != null) {
            msg += "; " + value;
        }
        return msg;
    }
}
