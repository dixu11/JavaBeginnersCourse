package dziedziczenie;

public class ZarzadcaDostawcow {
    public Kot[][] polaczDostawcow(Kot[] kotyDoSegregacji ) {
        int iloscDostawcow = 0;
        String[] katalogDostawcow = new String[0];


        // mialo byc public Cat[][] dajKoty (int ile, DostawcaKotow[] dostawcy)


        for (int i = 0; i < kotyDoSegregacji.length; i++) {
            boolean dostawcaObecny = false;
            for (int j = 0; j < katalogDostawcow.length; j++) {
                if (katalogDostawcow[j].equals(kotyDoSegregacji[i])) {

                }

            }

        }
        Kot[][] koty = new Kot[0][0];
        return koty;
    }
}
