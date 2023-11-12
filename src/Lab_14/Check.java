package Lab_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    public static void main(String[] args) {
        // Пример строки
        String input1 = "abcdefghijklmnopqrstuv18340";
        String input2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        // Проверка с использованием регулярного выражения
        System.out.println("a) " + checkPattern(input1));
        System.out.println("b) " + checkPattern(input2));
    }

    private static boolean checkPattern(String input) {
        // Регулярное выражение
        String pattern = "abcdefghijklmnopqrstuv18340";

        // Создание объекта Pattern
        Pattern regexPattern = Pattern.compile(pattern);

        // Создание объекта Matcher
        Matcher matcher = regexPattern.matcher(input);

        // Проверка совпадения
        return matcher.matches();
    }
}
