package Lesson11;

class Solution {

    int solution(String s) {
        int countL = 0;
        int countR = 0;
        int worker = 0;


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                countL++;
            } else if (s.charAt( i ) == 'R') {
                countR++;
            }

            if (countL == countR) {
                worker++;
            }
        }


        return worker;
    }
}
