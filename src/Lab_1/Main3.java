package Lab_1;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of elements");
        int size = sc.nextInt();
        double array[] = new double[size];
        array[0] = 1;
        System.out.printf("%.2f\n", array[0]);
        for (int i = 1; i < (size); i++) {
            array[i] = (1.0 / (i+1))+array[i-1];
            System.out.printf("%.2f\n", array[i]);
        }

    }
}