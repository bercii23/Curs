package Curs11.mostenire.exemple.EXERCITIU;

public class Person {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Aceasta este o persoana");
    }

    public void afiseaza(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void mananca(){
        System.out.println("Persoana cu numele " + this.name + " mananca zacusca");
    }
}
