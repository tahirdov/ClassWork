package Lesson5.Geometry;

public class Circle extends AbstractFigure {
    private final Point center;
    private final Point rad;

    public Circle(Point center, Point rad) {
        this.center = center;
        this.rad = rad;
    }

    public double area() {
        return Math.abs( 3.14 * ((center.getX() - rad.getX()) * (center.getY() - rad.getY())) *
                ((center.getX() - rad.getX()) * (center.getY() - rad.getY())) );
    }
}
