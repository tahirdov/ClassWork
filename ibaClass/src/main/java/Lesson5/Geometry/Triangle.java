package Lesson5.Geometry;

public class Triangle extends AbstractFigure {
    private final Point p1;
    private final Point p2;
    private final Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        super();
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double area() {
        return Math.abs( (p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY())
                + p3.getX() * (p1.getY() - p2.getY())) / 2 );
    }
}
