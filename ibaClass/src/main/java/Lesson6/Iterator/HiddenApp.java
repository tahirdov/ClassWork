package Lesson6.Iterator;


public class HiddenApp {
    public static void main(String[] args) {
        ReverseData months = new ReverseData();
        for (String month : months) {
            System.out.printf( "** %s **\n", month );
        }
    }
}
