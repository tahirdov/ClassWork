package Lesson24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomPairs {
    enum T10 {Max10, Min10,  Bet10}
    enum T2 {ODD, EVEN}


    public static void main(String[] args) {
//        int[] origin = random_int_arr(50);
//
//        int [] negatives = Arrays.stream(origin).filter(x -> x < -10).toArray();
//        int[] negativeOdd = Arrays.stream(negatives).filter(x-> (x % 2 != 0 )).toArray();
//        int[] negativeEven = Arrays.stream(negatives).filter(x -> (x % 2 == 0)).toArray();
//
//        int[] positives = Arrays.stream(origin).filter(x-> x > 10).toArray();
//        int[] positiveOdd = Arrays.stream(positives).filter(x-> (x % 2 != 0 )).toArray();
//        int[] positiveEven = Arrays.stream(positives).filter(x -> (x % 2 == 0)).toArray();
//
//        int[] middle = Arrays.stream(origin).filter(x-> (x >= -10 && x <= 10)).toArray();
//        int[] middleOdd = Arrays.stream(middle).filter(x-> (x % 2 != 0 )).toArray();
//        int[] middleEven = Arrays.stream(middle).filter(x -> (x % 2 == 0)).toArray();

        Function<Integer, T10> class1 = (Integer el) -> {
            if (el < -10) return T10.Max10;
            if (el > 10) return T10.Min10;
            else return T10.Bet10;
        };
        Function<Integer, T2> class2 = el -> Math.abs(el)%2 > 0 ?
                T2.ODD : T2.EVEN;


        Map<T10, Map<T2, List<Integer>>> collect = Stream.generate(() -> (int) (Math.random() * 51 - 25))
                .limit(50)
                .collect(Collectors.groupingBy(class1,
                        Collectors.groupingBy(class2)));

        collect.forEach((k, v) -> System.out.printf("%s, %s\n",k,v));

    }

    static int[] random_int_arr(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int)(Math.random() * ((25 - (-25)) + 1)) - 25;
        }

        return arr;
    }
}
