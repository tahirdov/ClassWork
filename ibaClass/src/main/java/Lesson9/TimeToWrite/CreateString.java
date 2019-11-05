package Lesson9.TimeToWrite;

import java.util.Random;

class CreateString {
    static String gen_Random(int length) {
        StringBuilder newString = new StringBuilder();
        Random random = new Random();
        for (int i = 1; i <= length; i++) {
            char ch = (char) ((char) random.nextInt( 26 ) + 'A');
            newString.append( ch );
        }
        return newString.toString();
    }
}
