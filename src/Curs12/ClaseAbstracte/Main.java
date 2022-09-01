package Curs12.ClaseAbstracte;

public class Main {

    public static void main(String[] args) {
        Cerc cerc1 = new Cerc("Cerc",3);
        Dreptunghi drept1 = new Dreptunghi("Dreptunghi", 3, 2);
        System.out.println("comportament suplimentar: " + drept1.comportamentSuplimentar());
        System.out.println(cerc1.getArie());
        System.out.println(drept1.getArie());
        FormaGeometrica[] forme = {cerc1, drept1};
        for(FormaGeometrica f1: forme){
            System.out.println(f1.getArie());

            drept1.toString();
        }
    }
}
