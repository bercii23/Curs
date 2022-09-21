package Curs12.Tema.Exercitiu1;

public class Ziar extends Publicatie{
    private String source;

    public Ziar(String titlu, String source) {
        super(titlu);
        this.source = source;
    }

    @Override
    public String getType(){
        return "Ziar";
    }

    @Override
    public String getDetalii() {
        return source;
    }
}
