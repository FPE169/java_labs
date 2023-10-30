package Lab_4.Shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "Lab_4.Shapes.Square";
    }
}
