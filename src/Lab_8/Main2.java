package Lab_8;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Введите натуральное число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не натуральное число. Введите натуральное число: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        int sum = Sum(n);
        System.out.println("Сумма цифр числа: " + sum);
    }

    private static int Sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + Sum(n / 10);
    }
}
