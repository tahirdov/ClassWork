package Lesson6.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ReverseData implements Iterable<String> {
    private final List<String> months = Arrays.asList(
            "Jan", "Feb", "Mar", "Apr", "May" );

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
