package Lesson9.Pairs;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class PairApp {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            int num = random.nextInt( 100 );
            arr.add( num );
        }

        Pair myPair = IntStream.range( 0, arr.size() - 1 )
                .mapToObj( index -> new Pair( index, arr.get( index ) + arr.get( index + 1 ) ) )
                .min( (p1, p2) -> p1.getSum() - p2.getSum() )
                .orElseThrow( () -> new IllegalArgumentException( "The stream must contain elements" ) );

        System.out.printf( "Array: %s\n", arr );
        System.out.printf( "Left index: %d\n", myPair.getIndex());
        System.out.printf( "Right index: %d\n", myPair.getIndex() + 1 );
        System.out.printf( "Sum: %d", myPair.getSum() );


    }
}
