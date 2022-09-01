package Curs12.Enum.EXEMPLU;

import static Curs12.Enum.EXEMPLU.PizzaStatus.DELIVERED;
import static Curs12.Enum.EXEMPLU.PizzaStatus.READY;

public class Main {

    public static void main(String[] args) {
        System.out.println(READY.getTimeToDeliver());
        System.out.println(READY.isDelivered());
        System.out.println(DELIVERED.isDelivered());
    }
}
