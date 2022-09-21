package Curs12.Tema.Exercitiu1;

public class Main {

    public static void main(String[] args) {
        Publicatie publicatie = new Publicatie("Rapunzel");
        Ziar ziar = new Ziar("Rapunzel", "Romania Libera");
        Articol articol = new Articol("Rapunzel", "Bercean Dragos");
        Anunt anunt = new Anunt("Rapunzel",6);
        Publicatie[] publi = new Publicatie[4];
        publi[0] = publicatie;
        publi[1] = ziar;
        publi[2] = articol;
        publi[3] = anunt;
        int i = 0;
        while(i < 4){
            publi[i].getInfo();
            i++;
        }


    }


}
