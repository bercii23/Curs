package Curs11.mostenire;

import Curs11.mostenire.A;

public class B extends A {

    //String info1

    public B(){
       // super("info");
        this("info");
        System.out.println("Sunt in constructor B fara argument");

    }
    public B(String info1) {
        super(info1);
        System.out.println("Sunt in constructor B");
    }
}
