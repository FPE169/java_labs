package Lab_23;

public class ArrayQueueTest {
    public static void main(String[] args) {
        testArrayQueueModule();
        testArrayQueueADT();
        testArrayQueue();
    }

    private static void testArrayQueueModule() {
        // Тесты для Lab_23.ArrayQueueModule
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        System.out.println("Lab_23.ArrayQueueModule: " + ArrayQueueModule.element());
        System.out.println("Lab_23.ArrayQueueModule: " + ArrayQueueModule.dequeue());
        System.out.println("Lab_23.ArrayQueueModule size: " + ArrayQueueModule.size());
        ArrayQueueModule.clear();
        System.out.println("Lab_23.ArrayQueueModule isEmpty: " + ArrayQueueModule.isEmpty());
    }

    private static void testArrayQueueADT() {
        // Тесты для Lab_23.ArrayQueueADT
        ArrayQueueADT.enqueue(1);
        ArrayQueueADT.enqueue(2);
        System.out.println("Lab_23.ArrayQueueADT: " + ArrayQueueADT.element());
        System.out.println("Lab_23.ArrayQueueADT: " + ArrayQueueADT.dequeue());
        System.out.println("Lab_23.ArrayQueueADT size: " + ArrayQueueADT.size());
        ArrayQueueADT.clear();
        System.out.println("Lab_23.ArrayQueueADT isEmpty: " + ArrayQueueADT.isEmpty());
    }

    private static void testArrayQueue() {
        // Тесты для Lab_23.ArrayQueue
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        System.out.println("Lab_23.ArrayQueue: " + arrayQueue.element());
        System.out.println("Lab_23.ArrayQueue: " + arrayQueue.dequeue());
        System.out.println("Lab_23.ArrayQueue size: " + arrayQueue.size());
        arrayQueue.clear();
        System.out.println("Lab_23.ArrayQueue isEmpty: " + arrayQueue.isEmpty());
    }
}
