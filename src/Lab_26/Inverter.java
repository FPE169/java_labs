package Lab_26;

import java.util.Stack;

public class Inverter {
    public static void invertArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        for (int value : array) {
            stack.push(value);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив: " + java.util.Arrays.toString(numbers));

        invertArray(numbers);

        System.out.println("Инвертированный массив: " + java.util.Arrays.toString(numbers));
    }
}
