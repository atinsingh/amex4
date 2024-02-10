package exceptions;

public class ContactPhoneFormatException extends RuntimeException{
    public ContactPhoneFormatException(String message) {
        super(message);
    }
}
