package Lesson5.Geometry;

import java.util.ArrayList;

public class AbstractFigure {
    private Triangle triangle;
    private Rectangle rectangle;
    private Circle circle;

    private AbstractFigure(Triangle triangle, Rectangle rectangle) {
        this.triangle = triangle;
        this.rectangle = rectangle;
    }

    AbstractFigure() {

    }

    public static void main(String[] args) {


        Point r1 = new Point( 4, 2 );
        Point r2 = new Point( -4, -3 );
        Rectangle rectangle = new Rectangle( r1, r2 );
        System.out.println( rectangle.area() );

        Point t1 = new Point( 4, 5 );
        Point t2 = new Point( 3, 6 );
        Point t3 = new Point( 4, 1 );

        Triangle triangle = new Triangle( t1, t2, t3 );
        System.out.println( triangle.area() );

        ArrayList<AbstractFigure> figures = new ArrayList<AbstractFigure>(){{
            add( new AbstractFigure(triangle, rectangle));
        }};

        figures.forEach( System.out::println );
    }
}
