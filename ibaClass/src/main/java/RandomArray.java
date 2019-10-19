import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
       int min = -5;
       int max = 5;
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
        System.out.print("Positive even array is: "  + Arrays.toString(evenPos));


    }
}

