package hello.exception;

public class ValidationExceptionCustom extends RuntimeException {
    public ValidationExceptionCustom(String message) {
        super(message);
    }
}
