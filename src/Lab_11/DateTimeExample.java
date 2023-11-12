package Lab_11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTimeExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (от 1 до 12): ");
        int month = scanner.nextInt();

        System.out.print("Введите день месяца: ");
        int day = scanner.nextInt();

        System.out.print("Введите часы: ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes);

        Date date = calendar.getTime();

        System.out.println("Созданный объект Calendar: " + calendar);
        System.out.println("Созданный объект Date: " + date);

        scanner.close();
    }
}
