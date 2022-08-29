package Curs9.Tema.p1;

public class Student {
   private String nume;
   private String facultate;
   private double medieAdmitere;

    public void setFacultate(String facultate) {

        this.facultate = facultate;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setMedieAdmitere(double medieAdmitere) {
        this.medieAdmitere = medieAdmitere;
    }

    public String getNume() {
        return nume;
    }

    public String getFacultate() {
        return facultate;
    }

    public double getMedieAdmitere() {
        return medieAdmitere;
    }
}

