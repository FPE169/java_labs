package Lab_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPassword {
    public static void main(String[] args) {
        // Примеры паролей
        String password1 = "F032_Passwлord";
        String password2 = "TrySpy1";
        String password3 = "sMa7rt_pass";
        String password4 = "A007";

        // Проверка паролей
        System.out.println("a) " + checkPassword(password1));
        System.out.println("a) " + checkPassword(password2));
        System.out.println("b) " + checkPassword(password3));
        System.out.println("b) " + checkPassword(password4));
    }

    private static boolean checkPassword(String password) {
        // Регулярное выражение для проверки пароля
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";

        // Создание объекта Pattern
        Pattern pattern = Pattern.compile(regex);

        // Создание объекта Matcher
        Matcher matcher = pattern.matcher(password);

        // Проверка совпадения
        return matcher.matches();
    }
}
