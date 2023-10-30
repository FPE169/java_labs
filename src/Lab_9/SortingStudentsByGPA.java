package Lab_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.getGpa(), student1.getGpa());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 4.2));
        students.add(new Student("Bob", 3.8));
        students.add(new Student("Charlie", 4.5));
        students.add(new Student("David", 3.9));

        System.out.println("Неотсортированный список:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new SortingStudentsByGPA());

        System.out.println("\nОтсортированный список по убыванию GPA:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
