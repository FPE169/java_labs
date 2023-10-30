package Lab_3;

import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        double[] arrayMath = new double[10];
        for (int i = 0; i < arrayMath.length; i++) {
            arrayMath[i] = Math.random();
        }

        System.out.println("Массив через Math.random(): " + Arrays.toString(arrayMath));

        Arrays.sort(arrayMath);

        System.out.println("Отсортированный массив: " + Arrays.toString(arrayMath));


        Random random = new Random();
        double[] arrayRandom = new double[8];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextDouble();
        }

        System.out.println("\nМассив через класса Random: " + Arrays.toString(arrayRandom));

        Arrays.sort(arrayRandom);

        System.out.println("Отсортированный массив: " + Arrays.toString(arrayRandom));
    }
}
