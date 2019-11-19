package Lesson12;

import java.util.Arrays;
import java.util.Random;

public class ArraySorter {

    private static int[] sortArray(int[] array) {
        int[] sorted = array.clone();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp = array[i];
                if (array[i] < array[j]) {
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return sorted;
    }

    private static int[] gen() {
        Random random = new Random();
        int[] array = new int[25];

        for (int i = 0; i < 25; i++) {
            int ran = random.nextInt(41) + 10;
            array[i] = ran;
        }
        return array;
    }


    public static void main(String[] args) {
        int[] x = gen();
        int[] z = x.clone();
        int[] y = sortArray(z);
        System.out.printf("Unsorted array is: %s\n", Arrays.toString(x));
        System.out.printf("Sorted array is: %s", Arrays.toString(y));
    }


}
