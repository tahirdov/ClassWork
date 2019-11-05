package Lesson9.Pairs;

final class Pair {
    private final int index;
    private final int sum;

    public static Pair empty() {
        return new Pair( -1, Integer.MAX_VALUE );
    }

    Pair(int index, int sum) {
        this.index = index;
        this.sum = sum;
    }

    int getIndex() {
        return index;
    }

    int getSum() {
        return sum;
    }
}
