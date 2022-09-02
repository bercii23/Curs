package Curs15.clasaSystem.clasaMath;

import java.io.Console;

public class Exercitiu {
    public static void main(String[] args) {
        System.out.println("Va rugam sa alegeti simplu sau avansat");
        Console console = System.console();
        String tipCalculator = console.readLine();
        if(!tipCalculator.equalsIgnoreCase("simplu") && !tipCalculator.equalsIgnoreCase("avansat")){
            System.out.println("s a ales un tip gresit");
            System.exit(2);
        }
    }
}
