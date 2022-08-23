package Curs11.mostenire.exemple;

public class Animal {

    public String nume;

    public Animal(String nume) {
        this.nume = nume;
        System.out.println("Un nou animal");
    }

    public void mananca(){
        System.out.println("Animalul curent mananca");
    }
}
