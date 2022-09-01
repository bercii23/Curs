package Curs12.ClaseAbstracte;

public abstract class FormaGeometrica {

    String nume;

    public FormaGeometrica(String nume) {
        this.nume = nume;
    }

    abstract int getArie();
    abstract int getPerimetru();

}
