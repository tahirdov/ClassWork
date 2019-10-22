import org.junit.Test;

import static org.junit.Assert.*;

public class RandomStringerTest {

    @Test
    public void gen_Random() {
        String generated = RandomStringer.gen_Random(10);
        assertEquals(10, generated.length());
    }

    @Test
    public void gen_Random2() {
        RandomStringer t = new RandomStringer();
        String generated = RandomStringer.gen_Random(10);
        char char0 = generated.charAt(0);
        assertTrue((char0 >= 'A' && char0 <= 'Z') || (char0 >= 'a' && char0 <= 'z'));

    }
}