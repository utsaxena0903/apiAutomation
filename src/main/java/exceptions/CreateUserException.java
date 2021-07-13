package exceptions;

public class CreateUserException extends AssertionError {

    public CreateUserException() {
    }

    private CreateUserException(String var1) {
        super(var1);
    }

    public CreateUserException(Object var1) {
        this(String.valueOf(var1));
        if (var1 instanceof Throwable) {
            this.initCause((Throwable)var1);
        }

    }

    public CreateUserException(boolean var1) {
        this(String.valueOf(var1));
    }

    public CreateUserException(char var1) {
        this(String.valueOf(var1));
    }

    public CreateUserException(int var1) {
        this(String.valueOf(var1));
    }

    public CreateUserException(long var1) {
        this(String.valueOf(var1));
    }

    public CreateUserException(float var1) {
        this(String.valueOf(var1));
    }

    public CreateUserException(double var1) {
        this(String.valueOf(var1));
    }

    public CreateUserException(String var1, Throwable var2) {
        super(var1, var2);
    }


}
