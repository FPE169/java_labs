package Lab_21;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(int size) {

        array = (T[]) java.lang.reflect.Array.newInstance(Object.class, size);
    }

    public void setElement(int index, T value) {
        array[index] = value;
    }

    public T getElement(int index) {
        return array[index];
    }

    public static void main(String[] args) {

        GenericArray<Integer> integerArray = new GenericArray<>(5);
        integerArray.setElement(0, 10);
        System.out.println("Элемент по индексу 0: " + integerArray.getElement(0));

        GenericArray<String> stringArray = new GenericArray<>(3);
        stringArray.setElement(0, "hello");
        System.out.println("Элемент по индексу 0: " + stringArray.getElement(0));
    }
}
