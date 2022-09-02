package Curs14.object;

import java.util.Objects;

public class Person {

    int age;
    String nume;
    String cnp;
    String prenume;

    public Person(int age, String nume, String cnp) {
        this.age = age;
        this.nume = nume;
        this.cnp = cnp;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", nume='" + nume + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.age == person.age && Objects.equals(nume, person.nume) && Objects.equals(cnp, person.cnp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, cnp);
        // return Objects.hash(age, nume, cnp, prenume);
        //cel mai corect mod este sa comparam ce se compara in equals
        //return nume.hashCode() + cnp.hashCode() + age;
    }
}
