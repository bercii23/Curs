package Curs11.mostenire.exemple.EXERCITIU;

public class MAIN {

    public static void main(String[] args) {
        Person p1 = new Person("Dragos", 23);
        Student s1 = new Student("Dragos", 23, "UTCN", 7.7);
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(s1.facultate);
        System.out.println(s1.medie);
        p1.mananca();
        s1.mananca();
    }

}
