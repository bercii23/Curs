package Curs12.Tema.Exercitiu2;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Trixi", 3, 20);
        Cat cat2 = new Cat("Cornel", 4, 14);
        Dog dog1 = new Dog("Radu", 5, 10);
        Dog dog2 = new Dog("Lala", 3,11);
        Animal[] animal = new Animal[4];
        animal[0] = cat1;
        animal[1] = cat2;
        animal[2] = dog1;
        animal[3] = dog2;
    }

    int varstaMedie(Animal[]){

    }

}
