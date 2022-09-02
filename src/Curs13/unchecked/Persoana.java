package Curs13.unchecked;

import Curs13.DefinireExceptie.IncorrectCNPException;

public class Persoana {

    int varsta;
    String nume;
    String cnp;
    public Persoana(String nume, int varsta,String cnp){
        this.nume = nume;
        this.varsta = varsta;
        if(cnp.length() != 13){
            //arunc exceptie
            throw new IncorrectCNPException("CNP-ul introdus nu " +
                    "are fix 13 caractere");
        }
        this.cnp = cnp;
    }

    public Persoana(String dragos, int varsta) {
    }

    void display(){
        System.out.println(varsta + " " + nume);
    }
}
