package Lesson9.TimeToWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Reader {
    static ArrayList<String> read() throws IOException {
        Writer.write();
        BufferedReader br = new BufferedReader(
                new FileReader(
                        new File( "C:\\Users\\hp\\IdeaProjects\\ClassWork\\ibaClass\\src\\main\\java/ourText.txt" ) ) );

        Scanner s = new Scanner( br );
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()) {
            list.add( s.next() );
        }
        s.close();
        return list;
    }


}
