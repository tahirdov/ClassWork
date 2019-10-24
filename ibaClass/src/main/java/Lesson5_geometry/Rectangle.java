package Lesson5_geometry;

public class Rectangle{
    private final Point p1;
    private final Point p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public int area() {
       return Math.abs((p1.getX() - p2.getX()) * (p1.getY() - p2.getY()));
}
}
