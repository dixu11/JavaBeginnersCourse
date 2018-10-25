package week2.animals;

public class Cat {
    private String name;
    private String kolor;
    private static int count = 0;



    public Cat() {
        this("NO_NAME");
//        name = "NO_NAME";
//        kolor = "Czarny";
        System.out.printf("Jestem kotem, rodzę się, nazywam się %s i jestem %s\n", name,kolor);
    }

    public Cat(String name) {
        this(name, "Czarny");
//        this.name = name;
    }
    public Cat(String name, String kolor) {
        this.name = name;
        this.kolor = kolor;
        count++;
    }


    void play() {
        System.out.println("Się bawię!");
    }
}
