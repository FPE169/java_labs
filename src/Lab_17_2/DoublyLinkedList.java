package Lab_17_2;

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void insertOrdered(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // добавляем первый элемент
            head = newNode;
            head.setNext(head);
            head.setPrev(head);
        } else {
            // вставляем новый элемент с сохранением упорядоченности
            Node current = head;

            // Находим место вставки
            while (current.getNext() != head && current.getNext().getData() < data) {
                current = current.getNext();
            }
            
            // Вставляем новый элемент перед текущим
            newNode.setNext(current.getNext());
            newNode.setPrev(current);
            current.getNext().setPrev(newNode);
            current.setNext(newNode);

            if (data < head.getData()) {
                head = newNode;
            }
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList newList = new DoublyLinkedList();

        // Вставляем элементы с сохранением упорядоченности
        newList.insertOrdered(3);
        newList.insertOrdered(-8);
        newList.insertOrdered(1);
        newList.insertOrdered(2);
        newList.insertOrdered(5);



        // Вывод списка
        newList.displayList();
    }
}
