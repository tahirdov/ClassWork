package Lesson5.StringWork;

import java.util.Random;

public class SeparateStrings {

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
        String origin = gen_Random( 30 );
        SeparateStrings app = new SeparateStrings();
        Result result = app.process( origin );
//        app.print(result);

    }

    private boolean isUpper(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private boolean isLower(char c) {
        return c >= 'a' && c <= 'z';
    }

    private boolean isVowel(char c) {
        char upper = Character.toUpperCase( c );
        return upper == 'A' || upper == 'E' || upper == 'I'
                || upper == 'O' || upper == 'U';
    }

    private boolean isConsonant(char c) {
        return !isVowel( c );
    }

    private boolean isUpperConsonant(char c) {
        return isConsonant( c ) && isUpper( c );
    }

    private boolean isUpperVowel(char c) {
        return isUpper( c ) && isVowel( c );
    }

    private boolean isLowerConsonant(char c) {
        return isLower( c ) && isConsonant( c );
    }

    private boolean isLowerVowel(char c) {
        return isLower( c ) && isVowel( c );
    }

    private Result process(String origin) {
        StringBuilder uc = new StringBuilder();
        StringBuilder lc = new StringBuilder();
        StringBuilder uv = new StringBuilder();
        StringBuilder lv = new StringBuilder();

        for (int i = 0; i < origin.length(); i++) {
            char ch = origin.charAt( i );
            if (isUpperConsonant( ch )) {
                uc.append( ch );
            } else if (isUpperVowel( ch )) {
                uv.append( ch );
            } else if (isLowerConsonant( ch )) {
                lc.append( ch );
            } else if (isLowerVowel( ch )) {
                lv.append( ch );
            }
        }
        return new Result( origin,
                uc.toString(),
                uv.toString(),
                lc.toString(),
                lv.toString() );
    }

    private void print(Result result) {
        System.out.printf( "Origin: %s\nUC: %s\nUV: %s\nLC: %s\nLV: %s",
                result.getOrigin(),
                result.getUpper_consonants(),
                result.getUpper_vowels(),
                result.getLower_consonants(),
                result.getLower_vowels() );
    }


}
