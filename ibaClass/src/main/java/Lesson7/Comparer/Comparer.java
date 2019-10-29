package Lesson7.Comparer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Comparer {

    public static boolean isOdd(int val) {
        return val %2 != 0;
    }

    public static boolean isEven(int val) {
        return !isOdd(val);
    }

    public static void main(String[] args) {
        List<Integer> origin = Stream.generate( () -> (int) (Math.random()*100) )
                .limit( 30 ).collect( Collectors.toList());
        ArrayList<Integer> sorted = new ArrayList<>(origin);

        Comparator<Integer> super_comparator =
                (i1, i2) -> {
            if (isEven(i1) && isOdd( i2 )) return -1;
            else if (isEven( i1 )&& isEven( i2 )) return i2 - i1;
            else if (isOdd( i1 ) && isOdd( i2 )) return i1 - i2;
            return -1;
        };

        sorted.sort( super_comparator );

        System.out.println(origin);
        System.out.println(sorted);
    }
}