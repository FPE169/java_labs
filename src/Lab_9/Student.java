package Lab_9;

public class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Lab_10.lab17.Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
