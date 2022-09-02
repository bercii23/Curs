package Curs15.clasaSystem.exrcitiu;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Console console = System.console();
        String line = console.readLine();
        while (line.equals("STOP")){
            System.out.println(line);
            line = console.readLine();
        }

        long endTime = System.currentTimeMillis();
        long total = (endTime - startTime)/1000;
        System.out.println("Timpul total de executie este: " + total);
    }
}
