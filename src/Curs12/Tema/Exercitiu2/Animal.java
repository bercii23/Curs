package Curs12.Tema.Exercitiu2;

public class Animal {
    String name;
    int age;
    double weight;

    void scoateSunet(){
        return;
    }

    void afiseazaAnimal(){
        System.out.println(name + age + weight);
    }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
