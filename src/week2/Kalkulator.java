package week2;

public class Kalkulator {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(multiple(2,2));
        System.out.println(substract(10,2));
        System.out.println(divide(4,2));
        System.out.println(calculate(4,2,"+"));
        System.out.println(calculate(4,2,"plus"));
        calculate(4, 2, "print +");
        calculate(4, 2, "print -");
        System.out.println(add(1,2,3));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b;
    }

    static int multiple(int a, int b) {
        return a * b;
    }

    static int substract(int a, int b) {
        return a - b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static int calculate(int a, int b, String s) {
        if (s.trim().charAt(s.length()-1) == '+' || s.trim().equalsIgnoreCase("plus")) {
            if (s.startsWith("print")) {
                System.out.printf("%d + %d = %d\n",a,b,a+b);
            }
            return add(a, b);
        } else if (s.trim().charAt(s.length() - 1) == '-' || s.trim().equalsIgnoreCase("minus")) {
            if (s.startsWith("print")) {
                System.out.printf("%d - %d = %d\n", a, b, a - b);
            }
            return substract(a, b);
        } else {
            System.out.printf("Nie znam takiej operacji: '%s'\n",s);
            return 0;
        }
    }
}
