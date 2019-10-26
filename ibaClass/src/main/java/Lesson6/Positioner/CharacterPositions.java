package Lesson6.Positioner;

import java.util.*;
import java.util.function.BiConsumer;

public class CharacterPositions {

    private static String gen_Random(int length) {
        StringBuilder newS = new StringBuilder();
        Random random = new Random();
        for (int i = 1; i <= length; i++) {
            int num = random.nextInt( 3 );
            if (num == 1) {
                char ch = (char) ((char) random.nextInt( 26 ) + 'a');
                newS.append( ch );
            } else {
                char ch = (char) ((char) random.nextInt( 26 ) + 'A');
                newS.append( ch );
            }
        }
        return newS.toString();
    }

    public static void main(String[] args) {
        // 1. data obtaining
        final String origin = gen_Random( 80 );
        // 2. data process
        CharacterPositions app = new CharacterPositions();
        Map<Character, List<Integer>> result = app.process( origin );
        // 3. output the result
//        System.out.println(origin);
//        System.out.println(result);
        app.printOut( result );
    }

    public Map<Character, List<Integer>> process(String origin_) {
        // unique
        Set<Character> unique = new HashSet<Character>();
        for (int index = 0; index < origin_.length(); index++) {
            char c = origin_.charAt( index );
            unique.add( c );
        }
        // map initialization with <char, empty list>
        Map<Character, List<Integer>> positions = new HashMap<>();
        for (Character c : unique) {
            positions.put( c, new ArrayList<>() );
        }

        for (int index = 0; index < origin_.length(); index++) {
            char c = origin_.charAt( index );
            positions.get( c ).add( index + 1 );
        }
        return positions;
    }

    private void printOut(Map<Character, List<Integer>> data) {
        data.forEach( new BiConsumer<Character, List<Integer>>() {
            @Override
            public void accept(Character character, List<Integer> integers) {
                System.out.printf( "Letter: %c : %d: %s\n",
                        character, integers.size(), integers );
            }
        } );
//        Set<Map.Entry<Character, List<Integer>>> entries = data.entrySet();
//        for (Map.Entry<Character, List<Integer>> item: entries) {
//            System.out.printf( "Letter: %c : %d: %s\n",
//                    item.getKey(),
//                    item.getValue().size(),
//                    item.getValue());
    }

}
