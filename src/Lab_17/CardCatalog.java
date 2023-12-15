package Lab_17;

public class CardCatalog {
    private CardNode head;

    // Конструктор
    public CardCatalog() {
        this.head = null;
    }

    // Функция для добавления нового элемента в конец списка
    public void addCardNode(CardNode newNode) {
        if (head == null) {
            head = newNode;
        } else {
            CardNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Функция для отображения всех элементов списка
    public void displayCardCatalog() {
        CardNode current = head;
        while (current != null) {
            current.displayAttributes();
            System.out.println("--------------");
            current = current.next;
        }
    }
}
