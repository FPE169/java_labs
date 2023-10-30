package Lab_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> grades1 = new ArrayList<>(List.of(5, 4, 4));
        ArrayList<Integer> grades2 = new ArrayList<>(List.of(3, 5, 4));
        ArrayList<Integer> grades3 = new ArrayList<>(List.of(5, 5, 5));
        ArrayList<Integer> grades4 = new ArrayList<>(List.of(3, 3, 4));



        Student[] students = {
                new Student("Иван", "Марков", "Информатика", 3, "Группа1", grades1),
                new Student("Петр", "Чубов", "Физика", 2, "Группа2", grades2),
                new Student("Коля", "Петров", "Химия", 1, "Группа3", grades3),
                new Student("Ирина", "Лепеткина", "История", 5, "Группа4", grades4),

        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray(students);


        // Сортировка по среднему баллу
        System.out.println("Быстрая сортировка: ");
        sorter.quickSort();
        sorter.outArray();

        System.out.println(" ");

//         Пример сортировки по другому полю (по курсу)
//        System.out.println("Сортировка по курсу: ");
//        sorter.sortByCourse();
//        sorter.outArray();
    }
}
