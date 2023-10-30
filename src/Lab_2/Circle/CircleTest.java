package Lab_2.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0, 2.0, 5.0);
        Circle circle2 = new Circle(3.0, 4.0, 7.5);

        System.out.println("Координаты центра окружности 1: (" + circle1.getX() + ", " + circle1.getY() + ")");
        System.out.println("Координаты центра окружности 2: (" + circle2.getX() + ", " + circle2.getY() + ")\n");
        System.out.println("Площадь круга 1: " + circle1.square());
        System.out.println("Площадь круга 2: " + circle2.square());

        System.out.println("Длина окружности 1: " + circle1.circumference());
        System.out.println("Длина окружности 2: " + circle2.circumference());

        if (circle1.equals(circle2)) {
            System.out.println("Окружности совпадают");
        }
        else {
            System.out.println("Окружности не совпадают");
        }
    }
}
