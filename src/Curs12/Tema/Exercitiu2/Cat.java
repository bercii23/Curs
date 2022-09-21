package Curs12.Tema.Exercitiu2;

public class Cat extends Animal{
    String favoriteFood;

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    void scoateSunet(){
        System.out.println("miau miau");
    }

    @Override
    void afiseazaAnimal(){

    }
}
