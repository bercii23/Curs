package Curs9.modificatoriAcces.p5;

public class Person {
    public String nume;
    protected double greutate;
    String job;
    private boolean casatorit;

     Person(String nume, double greutate, String job, boolean casatorit) {
        this.nume = nume;
        this.greutate = greutate;
        this.job = job;
        this.casatorit = casatorit;
     }

     boolean getCasatorit(){
         return casatorit;
     }
}
