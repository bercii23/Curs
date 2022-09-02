package Curs14.wrapper;

public class Main {

    public static void main(String[] args) {
        int a = 12;
        Integer objectA = a;
        int b = objectA;
        System.out.println(a);
        System.out.println(objectA);

        int i = Integer.parseInt("100", 10);
        int j = Integer.parseInt("100",2);
        int o = Integer.parseInt("ABC", 16);
        System.out.println(i);
        System.out.println(j);
        System.out.println(o);
    }
}
