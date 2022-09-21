package Curs12.Tema.Exercitiu1;

public class Anunt extends Publicatie {

    private int zilePanaExpira;

    public Anunt(String titlu, int zilePanaExpira) {
        super(titlu);
        this.zilePanaExpira = zilePanaExpira;
    }

    @Override
    public String getType() {
        return "Anunt";
    }

}
