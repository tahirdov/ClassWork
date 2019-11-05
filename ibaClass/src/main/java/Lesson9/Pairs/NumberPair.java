package Lesson9.Pairs;

import java.util.ArrayList;
import java.util.Random;

public class NumberPair {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            int num = random.nextInt( 100 );
            arr.add( num );
        }

        int min_id = 0;
        int min_sum = arr.get( 0 ) + arr.get( 1 );

        for (int id = 1; id < arr.size() - 1; id++) {
            int currentSum = arr.get( id ) + arr.get( id+1 );
            if (currentSum < min_sum) {
                min_id = id;
                min_sum = currentSum;
            }
        }

        System.out.printf( "Array: %s\n", arr );
        System.out.printf( "Left index: %d\n", min_id);
        System.out.printf( "Right index: %d\n", min_id + 1 );
        System.out.printf( "Sum: %d", arr.get( min_id ) + arr.get( min_id + 1 ) );



    }
}
