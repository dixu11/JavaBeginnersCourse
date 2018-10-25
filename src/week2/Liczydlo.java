package week2;

public class Liczydlo {
    static void calculate(int x, int y) {
        int res = x + y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("wynik = " + res);
        System.out.println();
    }

    public static void main(String[] args) {
        int a;
        a = 3;
        int b = 2;

        calculate(a, b);
        calculate(50, 100);
        calculate(100, 200);
    }
}
