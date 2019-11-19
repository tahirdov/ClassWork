package Lesson16;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    private static Random random;

    private static int[] array_gen() {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            int num = (random.nextInt() + 1000);
            array[i] = num;
        }

        return array;
    }

    private static int number_gen() {
        return (random.nextInt() + 1000);
    }

    private static boolean contains(int num, int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int middle = right - right / 2;
            if (array[middle] == num) return true;
            if (num > array[middle]) left = middle + 1;
            else right = middle - 1;
        }

        return false;
    }


    public static void main(String[] args) {
        int[] array = array_gen();
        int num = number_gen();
        System.out.println(contains(num, array));

    }

}
