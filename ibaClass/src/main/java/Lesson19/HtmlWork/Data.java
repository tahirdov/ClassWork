package Lesson19.HtmlWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Data {
    private String name;
    private int messages;

    Data() throws IOException {
        BufferedReader read =
                new BufferedReader(new FileReader("C:\\Users\\hp\\IdeaProjects\\ClassWork\\ibaClass\\src\\main\\java\\ReadFrom"));
        this.name = read.readLine();
        this.messages = Integer.parseInt(read.readLine());
    }

    String getName() {
        return name;
    }


    int getMessages() {
        return messages;
    }

}
