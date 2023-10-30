package Lab_2.Circle;

public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {return x;}

    public void setX(double x) {this.x = x;}

    public double getY() {return y;}

    public void setY(double y) {this.y = y;}

    public double getR() {return r;}

    public void setR(double r) {this.r = r;}

    public double square () {
        return Math.PI * r * r;
    }

    public double circumference(){
        return 2 * Math.PI * r;
    }

    public boolean equals(Circle otherCircle) {
        return this.x == otherCircle.x && this.y == otherCircle.y && this.r == otherCircle.r;
    }
}
