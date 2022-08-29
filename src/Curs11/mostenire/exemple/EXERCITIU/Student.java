package Curs11.mostenire.exemple.EXERCITIU;

public class Student extends Person {
    String facultate;
    double medie;

    public Student(String name, int age,String facultate, double medie) {
        super(name,age);
        this.facultate = facultate;
        this.medie = medie;
        System.out.println("acesta este un student");
    }

    @Override
    public void afiseaza(){
        super.afiseaza();
        System.out.println(this.facultate);
        System.out.println(this.medie);
    }

    @Override
    public void mananca(){
        System.out.println("Studentul cu numele " + this.name + " mananca zacusca");
    }
}
