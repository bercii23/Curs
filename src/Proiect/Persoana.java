package Proiect;

public class Persoana {
    String nume;
    int varsta;
    int id;
    static int nrPersoana;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        this.id = nrPersoana;
        nrPersoana++;
    }

    void afiseazaInformatii(){
        System.out.println("Persoana se numeste " + nume + "si are varsta" + varsta);
    }
}