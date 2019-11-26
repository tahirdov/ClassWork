package Lesson18.StreamForReplacing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SentenceMaker {
    public static void main(String[] args) {
        List<String> subjects = list("Noel", "The cat", "The dog");
        List<String> verbs = list("wrote", "chased", "slept on");
        List<String> objects = list("the book", "the ball", "the bed");


        List<String> sentences =
                subjects.stream().flatMap(sub ->
                        verbs.stream().flatMap(verb ->
                                objects.stream().map(obj ->
                                        String.format("%s %s %s.", sub, verb, obj)
                                ))).collect(Collectors.toList());

        sentences.forEach(System.out::println);
    }


    private static <T> List<T> list(T... origin) {
        return Arrays.asList(origin);
    }


}
