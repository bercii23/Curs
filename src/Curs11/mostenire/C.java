package Curs11.mostenire;

import Curs11.mostenire.B;

public class C extends B {

    public C(){
        super("info1");
    }

    public C(String info1) {
        super(info1);
        System.out.println("Sunt in constructor C");
    }
}
