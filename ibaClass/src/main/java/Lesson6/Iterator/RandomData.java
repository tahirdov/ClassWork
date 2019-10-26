package Lesson6.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomData implements Iterable<String> {
    private final List<String> months = Arrays.asList(
            "Jan", "Feb", "Mar", "Apr", "May" );
    Random index = new Random( (5) + 1 );

    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {

            int index = months.size() - 1;

            @Override
            public boolean hasNext() {
                return index < months.size() && index >= 0;
            }

            @Override
            public String next() {
                return months.get( index-- );
            }
        };
    }
}
