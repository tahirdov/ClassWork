package lesson4;

import java.util.Random;
import java.util.Scanner;

public class RandomStringer {

    public static String gen_Random(int length) {
        StringBuilder newString = new StringBuilder();
        Random random = new Random();
        for (int i = 1; i <= length; i++) {
            int num = random.nextInt(3);
            if (num == 1) {
                char ch = (char) ((char) random.nextInt(26) + 'a');
                newString.append(ch);
            }
            else {
                char ch = (char) ((char) random.nextInt(26) + 'A');
                newString.append(ch);
            }
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
