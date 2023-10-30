package Lab_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA {
    private ArrayList<Student> iDNumber = new ArrayList<>();

    // Метод для заполнения массива студентов
    public void setArray(Student[] students) {
        iDNumber.addAll(Arrays.asList(students));
    }

    // Метод для сортировки по среднему баллу (итоговому баллу)
    public void quickSort() {
        iDNumber.sort(Comparator.comparingInt(this::calculateTotalScore).reversed());
    }

    // Дополнительный метод для расчета итогового балла
    private int calculateTotalScore(Student student) {

        ArrayList<Integer> grades = student.getGrades();

        // Проверяем, есть ли оценки
        if (grades.isEmpty()) {
            return 0; // Если нет оценок
        }

        // Считаем средний балл
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    // Метод для вывода массива студентов
    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println("Name: " + student.getFirstName() + " " + student.getLastName() +
                    ", GPA: " + calculateTotalScore(student));
        }
    }

    // Дополнительный метод для сортировки по другому полю
    public void sortByCourse() {
        iDNumber.sort(Comparator.comparingInt(Student::getCourse));
    }
}
