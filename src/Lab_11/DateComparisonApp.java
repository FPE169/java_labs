package Lab_11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparisonApp {
    public static void main(String[] args) {
        // Получаем текущую дату
        LocalDate currentDate = LocalDate.now();

        // Получаем дату от пользователя
        LocalDate userDate = getUserInput();

        // Сравниваем даты
        compareDates(currentDate, userDate);
    }

    private static LocalDate getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату в формате (гггг-мм-дд): ");
        String userInput = scanner.nextLine();

        // Преобразуем введенную строку в объект LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(userInput, formatter);
    }

    private static void compareDates(LocalDate currentDate, LocalDate userDate) {
        if (currentDate.isEqual(userDate)) {
            System.out.println("Введенная дата совпадает с текущей датой.");
        } else if (currentDate.isAfter(userDate)) {
            System.out.println("Текущая дата позже введенной даты.");
        } else {
            System.out.println("Текущая дата раньше введенной даты.");
        }
    }
}
