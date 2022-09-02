package Curs13.DefinireExceptie;

public class CustomeCheckedException extends Exception{

    @Override
    public String getMessage() {
        System.out.println("mesajul erorii");
        return super.getMessage();
    }
}
