package exceptions;

public class NegativeNumberException extends RuntimeException{
    public NegativeNumberException() {
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}
