package Lesson13.LinkedList;

import java.util.Arrays;

class Merge {

    XLinkedList.XItem merge(XLinkedList.XItem head1, XLinkedList.XItem head2) {
        XLinkedList.XItem third = null;
        int len1 = 0;
        for (XLinkedList.XItem current = head1; current != null; current = current.next) {
            len1 += 1;
        }

        int len2 = 0;
        for (XLinkedList.XItem current = head2; current != null; current = current.next) {
            len2 += 1;
        }

        while (len1 > 0 && len2 > 0) {
            if (head1.value > head2.value) {
                third = head2;
                len2++;
            } else {
                third = head1;
                len1++;
            }
        }
        return null;
    }

    void print(XLinkedList.XItem merged) {
        System.out.println();
    }
}
