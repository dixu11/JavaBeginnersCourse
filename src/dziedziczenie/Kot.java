package dziedziczenie;

public class Kot {
    String name;
    String pochodzenie;

    public Kot() {
    }

    public Kot(String name) {
        this.name = name;
    }

    protected void say(String what) {
        System.out.printf("%s : - %s\n", toString(), what);
    }

    public void play() {
        say("bawie sie wlóczką!");
    }

    public void playHard() {
        say("Zabijam myszę!");
    }

    @Override
    public String toString() {
        return name + " z hodowli - " + pochodzenie;
    }
}
