package Lab_23;

import java.util.Arrays;

public class ArrayQueueModule {
    private static final int MAX_SIZE = 100; // Максимальный размер очереди
    private static Object[] queue = new Object[MAX_SIZE];
    private static int front = 0;
    private static int rear = -1;
    private static int size = 0;

    // Предусловие: очередь не полна
    // Постусловие: элемент добавлен в конец очереди
    public static void enqueue(Object element) {
        if (size == MAX_SIZE) {
            throw new IllegalStateException("Очередь полна");
        }

        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = element;
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент очереди
    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }

        return queue[front];
    }

    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент очереди
    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }

        Object removedElement = queue[front];
        queue[front] = null; // Освобождаем место
        front = (front + 1) % MAX_SIZE;
        size--;

        return removedElement;
    }

    // Постусловие: возвращен текущий размер очереди
    public static int size() {
        return size;
    }

    // Постусловие: возвращено true, если очередь пуста, иначе false
    public static boolean isEmpty() {
        return size == 0;
    }

    // Постусловие: очередь очищена
    public static void clear() {
        Arrays.fill(queue, null);
        front = 0;
        rear = -1;
        size = 0;
    }
}
