package Curs9.tipuriMemorie;

public class Main {

    public static void main(String[] args) {
        int nr = 10;
        Main.incrementeaza(nr);
        System.out.println(nr);
        Student s1 = new Student(8);
        incrementeazaNota(s1);
        System.out.println(s1.nota);
    }

    private static void incrementeazaNota(Student s1) {
        s1.nota++;
    }

    private static void incrementeaza(int nr) {
        nr++;
    }
}
