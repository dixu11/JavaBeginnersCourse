package dziedziczenie;

import java.util.Scanner;

public class Tiger extends Kot {

    public Tiger(String name) {
        super(name);
    }

    public void kill() {
       say("Zabijam i zjadam zwłoki!");
    }

    public void przedstawSie() {
        say("Jestem " + name);
    }

    public void playHard() {
        say("ZABIJAM MISJONARZY!");
    }
}
