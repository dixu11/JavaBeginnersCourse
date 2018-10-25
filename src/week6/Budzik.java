package week6;

public class Budzik {
    private int[] godzinyBudzenia = {7, 7, 7, 7, 7, 10, 10}; // chyba mapa lepiej

    protected int obudzMnie(Dzien dzien) {
        switch (dzien) {
            case PON:
                return godzinyBudzenia[0];
            case WTO:
                return godzinyBudzenia[1];
            case SRO:
                return godzinyBudzenia[2];
            case CZW:
                return godzinyBudzenia[3];
            case PIO:
                return godzinyBudzenia[4];
            case SOB:
                return godzinyBudzenia[5];
            case NIEDZ:
                return godzinyBudzenia[6];
            default:
                System.out.println("Nie wprowadzono dnia");
                return 0;

               /* switch (dzien){
                    case SOB:
                    case NIEDZ:
                        return 10;
                        default:
                            return 7;*/
//                }
        }
    }
}
