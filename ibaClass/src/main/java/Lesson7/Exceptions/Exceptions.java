package Lesson7.Exceptions;


public class Exceptions {

    static int sum (String str) {
        if (str == null) return 0;
        String[] spl = str.split( " " );
        int total = 0;
        for (String s : spl) {
            try {
                total += Integer.parseInt( s );
            } catch (NumberFormatException ignore) {
            }
        }
        return total;
    }


    public static void main(String[] args) {
        String first = "1 2 -3 abc"; //return 0
        String second = "1 -3 abc"; //return -2
        String third = "1 2 3 abc"; //return 6
        String fourth = "10 2 3"; //return 15
        System.out.println(sum( second ));
    }

}
