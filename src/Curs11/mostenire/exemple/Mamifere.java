package Curs11.mostenire.exemple;

public class Mamifere extends Animal{

    //constructor default
    /*public Mamifere(){
        super();
    }*/

    public String tipMamifer;

    public Mamifere(String nume,String tipMamifer){
        super(nume);
        this.tipMamifer = tipMamifer;
        System.out.println("Un nou mamifer");
    }

    public int naste(){
        System.out.println("Acest mamifer naste");
        return 2;
    }
}
