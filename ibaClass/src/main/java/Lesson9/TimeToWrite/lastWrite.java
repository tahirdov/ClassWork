package Lesson9.TimeToWrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class lastWrite {
    static void wrote() throws IOException {
        ArrayList<String> unsorted = Reader.read();
        new Comparator<ArrayList<String>>() {

            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return Integer.compare( o1.size(), o2.size() );
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };

        BufferedWriter bw = new BufferedWriter(
                new FileWriter(
                        new File( "C:\\Users\\hp\\IdeaProjects\\ClassWork\\ibaClass\\src\\main\\java/secondText.txt" ) ) );

        bw.write( String.valueOf( unsorted ) );
        bw.close();
    }
}
