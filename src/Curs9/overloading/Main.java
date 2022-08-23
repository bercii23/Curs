package Curs9.overloading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Suma a trei numere intregi 1,3,4: " + MathUtil.sum(1,3,4));
        System.out.println("Suma a doua numere intregi 1,3: " + MathUtil.sum(1,3));
        System.out.println("Suma a doua numere 1,3.3: " + MathUtil.sum(1,3.3));
    }
}
