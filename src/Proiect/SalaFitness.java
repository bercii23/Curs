package Proiect;

public class SalaFitness {
    Persoana[] persoane = new Persoana[3];

    int nrPersoane;
    boolean esteDeschisa;

    private void deschide(){
        esteDeschisa = true;
        System.out.println("Sala s-a deschis");
    }

    private void adaugaAntrenor(String nume,int varsta, int nrAbonati){
        if(nrPersoane == 3){
            System.out.println("Din pacate sala este plina si " + nume + "nu mai poate intra");
        }
        else if(nrPersoane < 3){
            Antrenor antrenor1 = new Antrenor("Radu", 35,2);
        }
    }
}
