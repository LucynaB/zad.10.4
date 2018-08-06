package data;

public class TempOverLimitException extends RuntimeException{
    public TempOverLimitException(String message) {
        super(message);
    }
}
