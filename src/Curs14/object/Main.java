package Curs14.object;

public class Main {

    public static void main(String[] args) {
        Pisica luna = new Pisica("Luna");
        Object tomi = new Pisica("tomi");
        System.out.println(luna.toString());
        System.out.println(tomi);
        System.out.println("----------------------");
        Person alex = new Person(24,"alex","111111111111");
        System.out.println(alex.toString());
        System.out.println("----------Equals-----------");
        Pisica luna2 = luna;
        Pisica luna3 = new Pisica("Luna");
        System.out.println(luna==luna2);
        System.out.println(luna==luna3);
        System.out.println(luna.equals(luna2));
        System.out.println(luna.equals(luna3));
        Person alex2 = new Person(24,"alex2","111111111111");
        Person alex3 = new Person(26,"alex3","111111111111");
        System.out.println("Comparatie alex si alex2: " +alex.equals(alex2));
        System.out.println("Comparatie alex si alex3: " + alex.equals(alex3));

        System.out.println("----------HASHCODE-------------");
        alex.setPrenume("Alexandru");
        alex2.setPrenume("Andrei");
        System.out.println("Hashcode Alex: " + alex.hashCode());
        System.out.println("Hashcode Alex2: " + alex2.hashCode());
        System.out.println("Hashcode Alex3: "+ alex3.hashCode());
    }
}
