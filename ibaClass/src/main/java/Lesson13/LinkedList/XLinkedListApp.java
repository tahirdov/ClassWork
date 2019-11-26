package Lesson13.LinkedList;


public class XLinkedListApp {
    public static void main(String[] args) {
        XLinkedList xl1 = new XLinkedList();
        xl1.add(11);
        xl1.add(22);
        xl1.add(33);
        xl1.add(44);
        XLinkedList xl2 = new XLinkedList();
        xl2.add(2);
        xl2.add(4);
        xl2.add(6);
        xl2.add(10);
        xl2.add(100);
        System.out.printf("XL1:%s\n", xl1);
        System.out.printf("XL2:%s\n", xl2);
        Merge app = new Merge();
        XLinkedList.XItem merged = app.merge(xl1.getHead(), xl2.getHead());
        app.print(merged);

    }
}
