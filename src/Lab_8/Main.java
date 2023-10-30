package Lab_8;

import java.util.Scanner;

public class Main {
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

        int num = 1;
        int k = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(num + " ");
            k++;
                if (k==num) {
                    num++;
                    k=0;
                }
        }
    }
}
