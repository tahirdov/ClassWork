package Lesson20Main.ArrayCheck;


import java.util.Arrays;

public class ArrayCheckApp {
    private static int[] generate_array(int length) {
        int[] arr = new int[length];

        int val = (length >> 1) - ((length + 1) & 1);
       for (int i = 0; i < length/2; i++, val--) {
           arr[i] = val;
           arr[length-1-i] = val;
       }

        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generate_array(11)));
        System.out.println(Arrays.toString(generate_array(14)));

    }
}
