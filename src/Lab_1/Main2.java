package Lab_1;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        float sum = 0;
        int i=0;
        System.out.println("Insert array elements:");
        for (i=0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        i=0;
        int max=array[0];
        int min=array[0];
        System.out.print ("Sum of array elements:");
        while ( i < size) {
            sum+=array[i];
            i+=1;
        }
        i=0;
        while(i<size){
            if (max <= array[i])
        {
                max=array[i];
            }
            if (min >= array[i]) {
                min=array[i];
            }
                i++;
        }

        System.out.println (sum);
        System.out.print ("Max of array elements:");
        System.out.println (max);
        System.out.print ("Min of array elements:");
        System.out.println (min);
    }
}