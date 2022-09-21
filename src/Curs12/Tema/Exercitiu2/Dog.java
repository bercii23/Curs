package Curs12.Tema.Exercitiu2;

public class Dog extends Animal{

    @Override
    void scoateSunet(){
        System.out.println("Ham Ham");
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }
}

