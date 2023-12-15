package Lab_17;

import java.util.Scanner;

public class CardNode {
    String name;
    int age;
    CardNode next;

    // Конструктор
    public CardNode() {
        this.name = "";
        this.age = 0;
        this.next = null;
    }

    // Функция для считывания характеристик с консоли
    public void readAttributesFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        this.name = scanner.nextLine();

        System.out.print("Введите возраст: ");
        this.age = scanner.nextInt();
    }

    // Функция для вывода характристик на экран
    public void displayAttributes() {
        System.out.println("Имя: " + this.name);
        System.out.println("Возраст: " + this.age);
    }
}
