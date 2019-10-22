import java.util.Random;
import java.util.Scanner;

public class RandomStringer {

    public static String gen_Random(int length) {
        StringBuilder newString = new StringBuilder();
        Random random = new Random();
        for (int i = 1; i <= length; i++) {
            char ch = (char) ((char) random.nextInt(26) + 'a');
            newString.append(ch);
        }
        return newString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length: ");
        int a = scanner.nextInt();

        System.out.println(gen_Random(a));
    }
}
