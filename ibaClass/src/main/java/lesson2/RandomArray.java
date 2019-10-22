package lesson2;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

    public static int[] filter_negatives(int[] origin) {
        int[] result = new int[origin.length];
        int pos = 0;
        for (int val: origin) {
            if (val < 0 )  result[pos++] = val;

        }

        return pos == origin.length ? result : Arrays.copyOf(result, pos);

        //    throw new IllegalArgumentException("not implemented yet");
        //    this exception is used to prevent not to implement yet
    }

    public static int[] filter_oddPos(int[] origin) {
        int[] result = new int[origin.length];
        int pos = 0;
        for (int val: origin) {
            if (val > 0 && val % 2 != 0)  result[pos++] = val;
        }


        return pos == origin.length ? result : Arrays.copyOf(result, pos);

    }

    public static int[] filter_evenPos(int[] origin) {
        int[] result = new int[origin.length];
        int pos = 0;
        for (int val: origin) {
            if (val > 0 && val % 2 == 0)  result[pos++] = val;
        }

        return pos == origin.length ? result : Arrays.copyOf(result, pos);
    }
    public static void main(String[] args) {
       int min = -10;
       int max = 10;
       int range = max - min;
      int [] data = new int[20];
      for (int i = 0; i < data.length; i ++) {
          data[i] = (int) (Math.random()*range+min);
      }
        System.out.println("Our array is: " + Arrays.toString(data));

        int [] reverted = new int[data.length];
        for (int i = 0; i < reverted.length; i++) {
            int dst_pos = reverted.length - i - 1;
            reverted[dst_pos] = data[i];
        }
        System.out.println("Reverted array is: " + Arrays.toString(reverted));

        int [] negatives = Arrays.stream(data).filter(x -> x < 0).toArray(); //check the method for filtering
        System.out.println("Negative array is: " + Arrays.toString(negatives));

        int[] oddPos = Arrays.stream(data).filter(x -> (x > 0 && x%2 != 0)).toArray();
        System.out.println("Positive odd array is: " + Arrays.toString(oddPos));

        int[] evenPos = Arrays.stream(data).filter(x -> (x > 0 && x%2 == 0)).toArray();
        System.out.println("Positive even array is: "  + Arrays.toString(evenPos));

        int count = 19;
        while (count >=0) {
            data[count] = data[data.length - 1 - count];
            count--;
        }
        System.out.println("Second time reverted array is: " + Arrays.toString(data));

    }
}

