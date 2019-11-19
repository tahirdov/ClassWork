package Lesson14;

import java.util.stream.Collectors;

public class vowelFilter {

    static String filter(String origin) {
        String[] vow = {"A", "E", "O", "I", "E", "U", "Y"};
        String vowel = "AEOIUY";

        return origin.chars().mapToObj(c -> (char) c)
                .filter(c -> !vowel.contains((Character.toUpperCase(c)) + ""))
                .map(String::valueOf).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s = "I am the doctor";
        System.out.println(filter(s));
    }
}
