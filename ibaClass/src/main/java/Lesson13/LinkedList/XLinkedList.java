package Lesson13.LinkedList;

import java.util.StringJoiner;

public class XLinkedList {

    private XItem head;

    public XItem getHead() {
        return head;
    }

    boolean contains(int value) {
        XItem current = head;
        while (current != null) {
            if (current.value == value) return true;
            current = current.next;
        }
        return false;
    }

    boolean contains_for(int value) {
        for (XItem current = head; current != null; current = current.next) {
            if (current.value == value) return true;
        }
        return false;
    }

    public void add(int value) {
        XItem item = new XItem(value);
        if (head == null) {
            head = item;
        } else {
            XItem current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = item;
        }
    }

    public void remove(int value) {
        XItem curr = head;
        XItem prev = null;
        while (curr != null) {
            if (curr.value == value) {
                if (prev == null) {
                    head = head.next;
                    break;
                }
                prev.next = curr.next;
                break;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (XItem current = head; current != null; current = current.next) {
            String str = String.valueOf(current.value);
            sj.add(str);
        }
        return sj.toString();
    }

    public int length() {
        int len = 0;
        for (XItem current = head; current != null; current = current.next) {
            len += 1;
        }
        return len;
    }

    private int length_rec(XItem current, int len) {
        if (current == null) return len;
        return length_rec(current.next, 1 + len);
    }

    void revert(XItem curr) {

    }

    public void revertWhile() {
        XItem current = head;
        XItem prev = null;

    }

    public void revertRecursive() {

    }

    static class XItem {
        int value;
        XItem next;

        XItem(int value) {
            this.value = value;
        }


    }

}

