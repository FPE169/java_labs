package Lab_25;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String firstString = "abcdefghijklmnopqrstuv18340";
        String secondString = "abcdefghijklmnopqrstuv18340.";

        // Регулярное выражение
        String regex = "^abcdefghijklmnopqrstuv18340$";

        if (Pattern.matches(regex, firstString)) {
            System.out.println("Правильная строка");
        } else {
            System.out.println("Неправильная строка");
        }

        if (Pattern.matches(regex, secondString)) {
            System.out.println("Правильная строка");
        } else {
            System.out.println("Неправильная строка");
        }
    }
}
