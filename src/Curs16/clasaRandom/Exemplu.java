package Curs16.clasaRandom;

import java.util.Random;

public class Exemplu {

    public static void main(String[] args) {
        Random rand = new Random();
        boolean b = rand.nextBoolean();
        System.out.println(b);
        if (b) {
            int i = rand.nextInt();
            System.out.println(i);
            while (i < 0) {
                i = rand.nextInt();
                System.out.println(i);
            }
        } else {
            if (b) {
                int i = rand.nextInt();
                System.out.println(i);
                while (i > 0) {
                    i = rand.nextInt();
                    System.out.println(i);

                }
            }
        }
    }
}
