package Curs12.Enum;

import static Curs12.Enum.VALORI.DOI;
import static Curs12.Enum.VALORI.UNU;

public class Main {

    public static void main(String[] args) {
        System.out.println(DOI);
        VALORI[] values = VALORI.values();
        for(VALORI v: values){
            System.out.println(v);
        }
        VALORI unu = VALORI.valueOf("UNU");
        System.out.println(unu);
        System.out.println(DOI.ordinal());
        //SWITCH
        switch (unu){
            case DOI:{
                System.out.println("Cazul 2");
                break;
            }
            case UNU:{
                System.out.println("Cazul 1");
                break;
            }
            case TREI:{
                System.out.println("Cazul 3");
                break;
            }
        }
    }
}
