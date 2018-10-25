package week6;

//TDD

public class testBudzenia {
    public static void main(String[] args) {
        Budzik budzik = new Budzik();
        Dzien[] dni = {Dzien.PON, Dzien.WTO, Dzien.SRO, Dzien.CZW, Dzien.PIO, Dzien.SOB, Dzien.NIEDZ};
        int[] pobudka = {7, 7, 7, 7, 7, 10, 10};

        // to są poprawne dane

        for (int i = 0; i < dni.length; i++) {
            Dzien dzien = dni[i];
            int spodziewanaPobudkla = pobudka[i];
int konkretnaPobudka = budzik.obudzMnie(dzien);
            if (konkretnaPobudka != spodziewanaPobudkla) {
                System.out.println("Niepoprawna pobudka!!: " + konkretnaPobudka);
                System.out.printf("Dnia %s powinno byc o %d\n", dzien, spodziewanaPobudkla);
            } else {
                System.out.printf("test %d na zielono\n",i+1);
            }
        }
    }
}
