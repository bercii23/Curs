package Curs12.interfete;

public interface I1 {

    public static final int a = 10; //"public static final" sunt cu negru deoarece in interfete toate netodele sunt publice
    int b = 12;
    void simpleMethod();

    String complexMethod(String input);

    default void defaultMethod(){
        System.out.println("functionalitate metoda din " + helper());
    }

    private String helper(){
        return "I1";
    }
}
