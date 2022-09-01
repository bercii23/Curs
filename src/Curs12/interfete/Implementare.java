package Curs12.interfete;

public class Implementare implements I1,I2 {

    public void simpleMethod(){
        System.out.println("am apelat metoda simpla");
    }

    @Override
    public String complexMethod(String input) {
        System.out.println("Afiseza metoda complexa");
        return input + "lala";
    }

    @Override
    public void defaultMethod() {
        //aici pot sa adaug comportament particular
        //System.out.println("comportament particular");
        I1.super.defaultMethod();
    }

    @Override
    public void method() {
        System.out.println("Apelez metoda mostenita  din I2 ");
    }
}
