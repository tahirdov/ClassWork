package Lesson9.TimeToWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

class Writer {
    static void write() throws IOException {
        Random random = new Random();
        ArrayList<String> ourStrings = new ArrayList<>();

        for (int i = 0; i < 33; i++) {
            int length = random.nextInt( 10 ) + 20;
            ourStrings.add( CreateString.gen_Random( length ) );
        }

        BufferedWriter bw = new BufferedWriter(
                new FileWriter(
                        new File( "C:\\Users\\hp\\IdeaProjects\\ClassWork\\ibaClass\\src\\main\\java/ourText.txt" ) ) );

        bw.write( String.valueOf( ourStrings ) );
        bw.close();
    }


}
