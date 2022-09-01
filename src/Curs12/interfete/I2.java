package Curs12.interfete;

public interface I2 {

    void method();

    default void defaultMethod(){
        System.out.println("apelez metoda din I2");
    }
}
