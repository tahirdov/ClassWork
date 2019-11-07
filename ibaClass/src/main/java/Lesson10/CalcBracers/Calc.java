package Lesson10.CalcBracers;

import java.util.ArrayList;
import java.util.List;

class Calc {

    int calc(String s) {
        List<String> wordList = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        int depth = 0;
        int max_depth = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt( i );

            switch (c) {
                case '(':
                    depth++;
                    break;
                case ')':
                    depth--;
                    break;
            }

            if (c != ')' && c != '(') {
                word.append( c );
                if (s.charAt( i+1 ) == ')' || s.charAt( i + 1 ) == '(') {
                    wordList.add( word.toString() );
                }
            }


            if (depth < 0) throw new IllegalArgumentException( "Extra ')'" );
            max_depth = Math.max( max_depth, depth );
        }

        if (depth > 0) throw new IllegalArgumentException( "Extra '('" );
        System.out.println(wordList);
        return max_depth;
    }
}
