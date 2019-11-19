package Lesson14;

import java.util.Arrays;
import java.util.Random;

public class SortingArrays {

    private static int[] gen_arr(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(50);
        }

        return arr;
    }

    private static int[] bubbleSorter(int[] arr) {
        int[] newArr = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = newArr[i];
                if (newArr[i] < newArr[j]) {
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        return newArr;
    }

    private static int[] mergeSort(int[] arr) {
        int[] copied = arr.clone();

        int l1 = copied.length / 2;
        int l2 = copied.length - l1;
        int l3 = l2;

        int[] a = new int[l1];
        int[] b = new int[l2];

        System.arraycopy(copied, 0, a, 0, l1);

        for (int ind = 0; ind < l2; ind++) {
            b[ind] = copied[l3];
            l3++;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int[] merged = new int[arr.length];
        int i = 0, j = 0, k = 0;

        while (a.length > i && b.length > j) {
            if (a[i] < b[j]) {
                merged[k] = a[i];
                i++;
            } else {
                merged[k] = b[j];
                j++;
            }
            k++;
        }

        while (b.length > j) {
            merged[k] = b[j];
            j++;
            k++;
        }

        while (a.length > i) {
            merged[k] = a[i];
            i++;
            k++;
        }
        return merged;
    }


    public static void main(String[] args) {
        int[] unsorted = gen_arr(10);
        int[] sorted = bubbleSorter(unsorted);
        int[] merged = mergeSort(unsorted);

        System.out.printf("Unsorted: %s\n", Arrays.toString(unsorted));
        System.out.printf("Sorted by bubble: %s\n", Arrays.toString(sorted));
        System.out.printf("Sorted by merge: %s\n", Arrays.toString(unsorted));
    }
}
