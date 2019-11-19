package Lesson16;

import java.util.ArrayList;
import java.util.List;

public class PrimeChecker {

    private static boolean isPrime(int num) {
        boolean checker = true;

        if (num == 0 || num == 1) return false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++)
                if (num % i == 0) {
                    checker = false;
                    break;
                }
        }
        return checker;
    }

    private static boolean isPalindrome(int num) {
        int copyNum = num;
        int check = 0;
        while (copyNum >= 1) {
            check = check * 10 + copyNum % 10;
            copyNum = copyNum / 10;
        }

        return check == num;
    }

//    private static boolean isReallyPalindrome (int num) {
//        List<Integer> digits = new ArrayList<>();
//
//        for (int i = 0; i < num; i ++) {
//            digits.add(num % 10);
//            num = num <<3 + num <<1;
//        }
//    }

    private static List<Integer> generatePrime() {
        List<Integer> primes = new ArrayList<>();
        int i = 3;
        while (primes.size() < 10000) {
            if (isPrime(i)) {
                primes.add(i);
            }
            i++;
        }
        return primes;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1991));
        System.out.println(isPrime(14));
        long l1 = System.currentTimeMillis();
        System.out.println(generatePrime());
        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1);

    }
}
