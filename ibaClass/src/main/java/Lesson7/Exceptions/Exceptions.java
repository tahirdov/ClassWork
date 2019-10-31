//package Lesson7.Exceptions;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class Exceptions {
//
//    static Holder sum (String str) {
//        if (str == null) return new Holder();
//        ArrayList<String> wrong = new ArrayList<>();
//        String[] spl = str.split( " " );
//        int num = 0;
//        int unused = 0;
//        int used = 0;
//        for (String s : spl) {
//            try {
//                num = Integer.parseInt( s );
//                used++;
//            } catch (NumberFormatException ex) {
//                unused++;
//                wrong.add( s );
//            }
//        }
//        return new Holder( used, unused, wrong );
//    }
//
//
//    public static void main(String[] args) {
//        String first = "1 2 -3 abc"; //return 0
//        String second = "1 -3 abc"; //return -2
//        String third = "1 2 3 abc"; //return 6
//        String fourth = "10 2 3"; //return 15
//        System.out.println(sum( second ).getUsed() +" : " + sum( second ).getUnused()
//                                + " : " + sum( second ).getWrong());
//
//    }
//
//}
