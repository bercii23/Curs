package Curs16.clasaString;

public class Main {
    private final static int MAX = 100_000_000;
    public static void main(String[] args) {
        String s1 = "exemplu String";
        String s2 = "alt exemplu";

        s1 += " pentru inceptori";
        String s3 = "exemplu string";
        String s4 = "exemplu string";

        System.out.println(s1);

        test1();
        test2();
    }
    private static void test1(){
        long start = System.currentTimeMillis();
        int i = 0;
        while (i < MAX){
            String a = "incercare";
            i++;
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Timp executie: " + (finalTime - start));
    }
    private static void test2() {
        long start = System.currentTimeMillis();
        int i = 0;
        while (i < MAX) {
            String a = new String("incercare");
        i++;
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Timp executie: " + (finalTime - start));
    }
}
