package Lab_25;

import java.util.regex.*;

public class Password {
    public static boolean isStrongPassword(String password) {
        // Регулярное выражение
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";

        return Pattern.matches(regex, password);
    }

    public static void main(String[] args) {
        String Password1 = "F032_Password";
        String Password2 = "TrySpy_";
        String Password3 = "smart_pass";
        String Password4 = "A007";

        // Проверка паролей
        System.out.println("Lab_25.Password 1: " + isStrongPassword(Password1));
        System.out.println("Lab_25.Password 2: " + isStrongPassword(Password2));
        System.out.println("Lab_25.Password 3: " + isStrongPassword(Password3));
        System.out.println("Lab_25.Password 4: " + isStrongPassword(Password4));
    }
}
