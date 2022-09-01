package Curs11.mostenire.exemple;

public class Main1 {
    public static void main(String[] args) {
        Pisica pisi1 = new Pisica("Tom", "carnivora");
        System.out.println(pisi1.nume);
        System.out.println(pisi1.tipMamifer);
        System.out.println(pisi1 instanceof Mamifere);
        pisi1.mananca();
        System.out.println(pisi1.naste());
    }
}
