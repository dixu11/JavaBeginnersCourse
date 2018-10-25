package dziedziczenie;

public class Main {
    public static void main(String[] args) {
        Kot k1 = new Kot();
        k1.name = "Bonifacy";
        Kot k2 = new Kot();
        k2.name = "Filemon";

        k1.play();
        k2.play();
        Tiger t1 = new Tiger("Zbigniew");
        t1.name = "Kicia";
        t1.play();
        t1.kill();
        t1.przedstawSie();
        t1.playHard();
        k2.playHard();

        System.out.println("**************************");

        Producent radek = new Producent("Zenek");
        Kot[] koty = radek.dajKoty(40);

        for (Kot kot:
             koty) {
            kot.playHard();
        }
    }
}