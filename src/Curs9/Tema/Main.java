package Curs9.Tema;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Dragos", 23);
        Person p2 = new Person("Radu", 35);
        Person p3 = p1;
        p3.varsta = 34;
        p1.afiseazaInformatii();
        p3.afiseazaInformatii();
        int nr = 10;
        System.out.println(nr);
    }

    void atribuieInversul(int nr){
        nr = -nr;
    }
}
