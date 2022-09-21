package Curs13.Tema;

public class Person {
    String nume;
    String address;


    public Person(String nume, String address) {
        this.nume = nume;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
