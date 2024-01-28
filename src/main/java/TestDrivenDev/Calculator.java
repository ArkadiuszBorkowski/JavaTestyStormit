package TestDrivenDev;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        try {
            wykonajKalkulator();
        } catch (Exception e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }
    }

    private static void wykonajKalkulator() throws Exception {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Podaj pierwszą liczbę: ");
            double liczba1 = scanner.nextDouble();

            System.out.print("Podaj operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Podaj drugą liczbę: ");
            double liczba2 = scanner.nextDouble();

            double wynik = oblicz(liczba1, operator, liczba2);
            System.out.println("Wynik: " + wynik);

            System.out.print("Czy chcesz wykonać kolejne obliczenia? (tak/nie): ");
        } while (scanner.next().equalsIgnoreCase("tak"));

        System.out.println("Dziękujemy za skorzystanie z kalkulatora.");
    }

    public static double oblicz(double liczba1, char operator, double liczba2) throws Exception {
        switch (operator) {
            case '+':
                return liczba1 + liczba2;
            case '-':
                return liczba1 - liczba2;
            case '*':
                return liczba1 * liczba2;
            case '/':
                if (liczba2 != 0) {
                    return liczba1 / liczba2;
                } else {
                    throw new Exception("Nie można dzielić przez zero.");
                }
            default:
                throw new Exception("Niepoprawny operator.");
        }
    }
}