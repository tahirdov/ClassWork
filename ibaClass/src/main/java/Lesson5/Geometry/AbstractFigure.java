package Lesson5.Geometry;

public class AbstractFigure {
    public static void main(String[] args) {
        Point t1 = new Point( 4, 5 );
        Point t2 = new Point( 3, 6 );
        Point t3 = new Point( 4, 1 );

        Triangle triangle = new Triangle( t1, t2, t3 );
        System.out.println( triangle.area() );

        Point r1 = new Point( 4, 2 );
        Point r2 = new Point( -4, -3 );
        Rectangle rectangle = new Rectangle( r1, r2 );
        System.out.println( rectangle.area() );


    }
}
