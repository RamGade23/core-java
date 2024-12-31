package exceptions;

public class InvalidNamesException extends Exception{
    public InvalidNamesException() {
    }

    public InvalidNamesException(String message) {
        super(message);
    }
}
