package Curs12.Tema.Exercitiu1;

public class Publicatie {
    private String titlu;

    public Publicatie(String titlu) {
        this.titlu = titlu;
    }

    public String getType(){
        return "Publicatie";
    }

    public String getDetalii(){
        return "-Titlul: " + titlu;
    }

    public final void getInfo(){
        System.out.println(getType() + getDetalii());
    }
}

