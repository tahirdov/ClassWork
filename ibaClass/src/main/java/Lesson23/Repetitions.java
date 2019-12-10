package Lesson23;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Repetitions{
    public static void main(String[] args) {
        System.out.println("Second array:");
        System.out.printf("Minimum occurrence belongs to: %s\n", find_min(random_int_counts(50)));
        System.out.println("Second array:");
        System.out.printf("Minimum occurrence belongs to: %s\n", find_min(random_int_counts(20)));
    }

    static Map<Integer, Long> random_int_counts(int length) {
        return Stream.generate(() -> (int) (Math.random() * 16 + 10))
                .limit(length)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
    }

    static long find_min (Map<Integer, Long> collected) {
        return collected
                .entrySet()
                .stream()
                .peek(p -> System.out.printf("N:%d    L:%d\n", p.getKey(), p.getValue()))
                .min((o1, o2) -> (int) (o1.getValue() - o2.getValue()))
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new IllegalArgumentException("The data is supposed to be non empty"));
    }
}
