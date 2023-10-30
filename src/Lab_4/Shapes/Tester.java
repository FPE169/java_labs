package Lab_4.Shapes;

public class Tester {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(7),
                new Rectangle(6, 4),
                new Square(3)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
