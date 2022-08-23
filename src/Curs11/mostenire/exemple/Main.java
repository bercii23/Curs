package Curs11.mostenire.exemple;

public class Main {
    public static void main(String[] args) {
        Pisica pisi1 = new Pisica("Tom", "carnivora");
        System.out.println(pisi1.nume);
        System.out.println(pisi1.tipMamifer);

        pisi1.mananca();
        System.out.println(pisi1.naste());
    }
}
