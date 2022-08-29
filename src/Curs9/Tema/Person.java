package Curs9.Tema;

public class Person {
    String  nume;
    int varsta;

    public Person(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    void afiseazaInformatii(){
        System.out.println(this.nume);
        System.out.println(this.varsta);
    }
}


