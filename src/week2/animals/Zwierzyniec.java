package week2.animals;

public class Zwierzyniec {
    public static void main(String[] args) {
        Dog bruno = new Dog();
        Dog burek = new Dog();
        bruno.name = "Bruno";
        bruno.hau();
        burek.name = "Burek";
        burek.hau();

        System.out.println("************");
        Dog mojPies = bruno;
        mojPies.hau();
        Cat kot = new Cat();
        kot.play();

//        pokazanie jak to tam w pamieci
//        sięganie do obiektów a obiekt ciagle ten sam - to mój pies: Burek

    }
}
