package Curs13.DefinireExceptie;

public class CustomeUncheckedException extends RuntimeException {

    public CustomeUncheckedException(String message) {
        super(message);
        System.out.println("constructor");
    }
}
