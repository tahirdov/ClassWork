package lesson4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {

    calculator cal;

    @Before
    public void before() {
        this.cal = new calculator();
    }

    @Test
    public void add() {
        assertEquals(7, cal.add(4,3));
    }

    @Test
    public void sub() {
        int sub = 4-5;
        assertFalse(sub > cal.sub(4,5));
    }

    @Test
    public void mul() {
        int mul = 7*9;
        int check = cal.mul(8, 6);
        assertTrue((mul == cal.mul(7, 9)) && mul > check);
    }

    @Test
    public void div() {
        int div = 81/9;
        int check = cal.div(63, 7);
        assertFalse((div == cal.div(99, 11)) && div < check);
    }
}