package Lesson10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    Calc app = new Calc();


    @Test
    public void should_ok() {
        assertEquals( 4, app.calc( "(())()(((())))" ));
    }

    @Test
    public void should_ok2() {
        assertEquals( 1, app.calc( "()()()()()" ));
    }

    @Test
    public void should_ok3() {
        assertEquals( 2, app.calc( "(()()()()())" ));
    }

    @Test
    public void should_ok4() {
        assertEquals( 3, app.calc( "((())))))))9098435128512" ) );
    }

    @Test
    public void should_ok5() {
        assertEquals( 0, app.calc( "9098435128512" ) );
    }

}