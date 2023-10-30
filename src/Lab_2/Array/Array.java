package Lab_2.Array;

public class Array {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five"};

        System.out.println("Исходный массив:");
        printArray(array);

        reverseArray(array);

        System.out.println("\nМассив после обратного порядка:");
        printArray(array);
    }

    public static void reverseArray(String[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
