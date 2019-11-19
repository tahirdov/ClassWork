package Lesson13.Recursion;
//the function calls itself

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class FactApp {

    public static void main(String[] args) {
        FactApp app = new FactApp();
        int F6 = app.fact(6);
        System.out.println(F6);

        LocalTime localTime = LocalTime.now();
        LocalTime delete = localTime.plusHours(1);
        if (localTime.compareTo(delete) < 0) {
            System.out.println("Flight started");
        }

        Date date = new Date();
        System.out.println(date);

    }

    private int fact(int num) {
        if (num == 0) return 1;
        return num * fact(num - 1);
    }
}
