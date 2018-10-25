package dziedziczenie;

import java.util.Random;

public class Producent {

    private String nazwaHodowli;

    public Producent(String nazwaHodowli) {
        this.nazwaHodowli = nazwaHodowli;
    }

    public Kot[] dajKoty(int ile) {
        Kot[] koty = new Kot[ile];
        int iloscKotow = 0;
        int iloscTygrysow = 0;
        for (int i = 0; i < koty.length; i++) {
            int losowo = (int) (Math.random() * 10); // mozna prosciej po prostu math.random > 0.5
            if (losowo < 4) {
                iloscTygrysow++;
                koty[i] = new Tiger(String.format("Tygrys nr. %d", iloscTygrysow));
            } else {
                iloscKotow++;
                koty[i] = new Kot(String.format("Kot nr. %d", iloscKotow));
            }
            koty[i].pochodzenie = nazwaHodowli;
        }
        return koty;
    }


}
