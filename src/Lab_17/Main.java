package Lab_17;

public class Main {
    public static void main(String[] args) {
        CardCatalog catalog = new CardCatalog();

        // Пример добавления элементов в список
        CardNode node1 = new CardNode();
        node1.readAttributesFromConsole();
        catalog.addCardNode(node1);

        CardNode node2 = new CardNode();
        node2.readAttributesFromConsole();
        catalog.addCardNode(node2);

        // Отображение списка
        catalog.displayCardCatalog();
    }
}
