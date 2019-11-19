package Lesson14;

public class caseConverter {
    private static String convert(String string) {
        StringBuilder sb = new StringBuilder();

        int magicNumber = 1 << 5;

        for (int i = 0; i < string.length(); i++) {
            int digit = (int) string.charAt(i) ^ magicNumber;
            sb.append((char) digit);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "hElLo WoRLD";
        System.out.println(convert(s));
    }

}
