package Curs12.Tema.Exercitiu1;

public class Articol extends Publicatie {

    private String autor;

    public Articol(String titlu, String autor) {
        super(titlu);
        this.autor = autor;
    }

    @Override
    public String getType() {
        return "Articol";
    }

    @Override
    public String getDetalii() {
        return autor;
    }
}
