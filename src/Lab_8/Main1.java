package Lab_8;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число A: ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число B: ");
        int b = scanner.nextInt();

        if (a < b) {
            Ascending(a, b);
        }
        else {
            Descending(a, b);
        }
    }

    private static void Ascending(int a, int b) {
        if (a > b) {
            return;
        }

        System.out.print(a + " ");
        Ascending(a + 1, b);
    }

    private static void Descending(int a, int b) {
        if (a < b) {
            return;
        }

        System.out.print(a + " ");
        Descending(a - 1, b);
    }
}
