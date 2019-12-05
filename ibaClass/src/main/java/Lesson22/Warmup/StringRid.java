package Lesson22.Warmup;


import java.util.Random;
import java.util.stream.Collectors;

public class StringRid {
    public static void main(String[] args) {
        String origin = gen_Random(15);
        System.out.printf("Original string is: %s\n", origin);
        String origin2 = gen_Random(20);
        System.out.printf("Original second string is: %s\n", origin2);

        System.out.printf("Filtered string is: %s\n", filter(origin));
        System.out.printf("Filtered second string is: %s\n", filter(origin2));

    }

    private static String filter(String origin) {
        return origin.chars().distinct()
                .mapToObj(ob -> String.valueOf((char) ob))
                .collect(Collectors.joining());
    }


    private static String gen_Random(int length) {
        StringBuilder newString = new StringBuilder();
        Random random = new Random();
        for (int i = 1; i <= length; i++) {
            int num = random.nextInt(3);
            if (num == 1) {
                char ch = (char) ((char) random.nextInt(26) + 'a');
                newString.append(ch);
            } else {
                char ch = (char) ((char) random.nextInt(26) + 'A');
                newString.append(ch);
            }
        }
        return newString.toString();
    }


}
