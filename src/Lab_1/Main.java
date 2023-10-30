package Lab_1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        float sum = 0;
        float average = 0;
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print ("Sum of array elements:");
        for (int i = 0; i < size; i++) {
            sum+=array[i];
        }

        average = (sum)/(size);
        System.out.println (sum);
        System.out.print ("Average of array elements:");
        System.out.println (average);
    }
}