package Curs13.unchecked;

public class Main {

    public static void main(String[] args) {

        String[] propozitie = {"Ana", "are", "mere"};
        System.out.println(propozitie[1]);

        Persoana p1 = new Persoana("Dragos", 3);
        System.out.println(p1.nume);
        System.out.println(p1.varsta);
        }
}
