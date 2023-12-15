package Lab_23;

import java.util.Arrays;

public abstract class ArrayQueueADT {
    private static final int MAX_SIZE = 100;
    private static Object[] queue = new Object[MAX_SIZE];
    private static int front = 0;
    private static int rear = -1;
    private static int size = 0;

    public static void enqueue(Object element) {
        if (size == MAX_SIZE) {
            throw new IllegalStateException("Очередь полна");
        }

        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = element;
        size++;
    }

    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }

        return queue[front];
    }

    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }

        Object removedElement = queue[front];
        queue[front] = null;
        front = (front + 1) % MAX_SIZE;
        size--;

        return removedElement;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        Arrays.fill(queue, null);
        front = 0;
        rear = -1;
        size = 0;
    }
}
