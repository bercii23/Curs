package Curs16.clasaRandom;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        for(int i = 0; i < 20; i++){
            System.out.println(rand.nextBoolean());
        }
        int age = rand.nextInt(15);
        if(age < 18){
            System.out.println("persoana e minora");
        }
        else{
            System.out.println("persoana e majora");
        }
    }
}
