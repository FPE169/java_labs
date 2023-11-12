package Lab_13;

public class Main {
    public static void main(String[] args) {
        String inputString = "I like Java!!!";

        char lastChar = getLastChar(inputString);
        System.out.println("1. Последний символ строки: " + lastChar);

        boolean endsWithExclamation = endsWithExclamation(inputString);
        System.out.println("2. Строка заканчивается на '!!!': " + endsWithExclamation);

        boolean startsWithILike = startsWithILike(inputString);
        System.out.println("3. Строка начинается с 'I like': " + startsWithILike);

        boolean containsJava = containsJava(inputString);
        System.out.println("4. Строка содержит 'Java': " + containsJava);

        int javaPosition = findJavaPosition(inputString);
        System.out.println("5. Позиция подстроки 'Java': " + javaPosition);

        String replacedString = replaceAWithO(inputString);
        System.out.println("6. Заменить 'а' на 'о': " + replacedString);

        String uppercaseString = toUpperCase(inputString);
        System.out.println("7. Преобразовать к верхнему регистру: " + uppercaseString);

        String lowercaseString = toLowerCase(inputString);
        System.out.println("8. Преобразовать к нижнему регистру: " + lowercaseString);

        String substringJava = extractJavaSubstring(inputString);
        System.out.println("9. Вырезать 'Java': " + substringJava);
    }

    // Методы для выполнения задач

    private static char getLastChar(String str) {
        return str.charAt(str.length() - 1);
    }

    private static boolean endsWithExclamation(String str) {
        return str.endsWith("!!!");
    }

    private static boolean startsWithILike(String str) {
        return str.startsWith("I like");
    }

    private static boolean containsJava(String str) {
        return str.contains("Java");
    }

    private static int findJavaPosition(String str) {
        return str.indexOf("Java");
    }

    private static String replaceAWithO(String str) {
        return str.replace('a', 'o');
    }

    private static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    private static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    private static String extractJavaSubstring(String str) {
        int javaIndex = str.indexOf("Java");
        if (javaIndex != -1) {
            return str.substring(javaIndex, javaIndex + 4);
        } else {
            return "Подстрока 'Java' не найдена";
        }
    }
}
