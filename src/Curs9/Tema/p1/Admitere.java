package Curs9.Tema.p1;

public class Admitere {
    double ultimaMedie;
    private int locuriTotale;
    private int locuriOcupate;

    public double getUltimaMedie() {
        return ultimaMedie;
    }

    public int getLocuriTotale() {
        return locuriTotale;
    }

    public int getLocuriOcupate() {
        return locuriOcupate;
    }

    public void setUltimaMedie(double ultimaMedie) {
        this.ultimaMedie = ultimaMedie;
    }

    public void setLocuriTotale(int locuriTotale) {
        this.locuriTotale = locuriTotale1;
    }

    public void setLocuriOcupate(int locuriOcupate) {
        this.locuriOcupate = locuriOcupate1;
    }
        int locuriOcupate1;
        int locuriTotale1;
        int medieStudent;
         boolean acceptaStudent(Student student) {
             if (locuriOcupate1 == locuriOcupate) {
                 return false;
             } else if (medieStudent > ultimaMedie) {
                 return true;
             }
         return true;
         }
}



