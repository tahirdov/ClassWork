package Lesson12;

import java.util.Arrays;

public class MergeSort {

    private static int[] merge(int[] a, int[] b) {
        int length = a.length + b.length;
        int[] merged = new int[length];
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
        int[] first = {4, 5, 6, 8};
        int[] second = {1, 2, 3};
        int[] merged = merge(first, second);
        System.out.println(Arrays.toString(merged));

    }
}
