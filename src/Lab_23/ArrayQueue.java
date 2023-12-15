package Lab_23;

import java.util.Arrays;

public class ArrayQueue {
    private static final int MAX_SIZE = 100;
    private Object[] queue = new Object[MAX_SIZE];
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    public void enqueue(Object element) {
        if (size == MAX_SIZE) {
            throw new IllegalStateException("Очередь полна");
        }

        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = element;
        size++;
    }

    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }

        return queue[front];
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }

        Object removedElement = queue[front];
        queue[front] = null;
        front = (front + 1) % MAX_SIZE;
        size--;

        return removedElement;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(queue, null);
        front = 0;
        rear = -1;
        size = 0;
    }
}
