package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int TOTAL = -1;
    final private int[] numbers = new int[SIZE];

    public int getTotal() {
        return total;
    }

    public int total = TOTAL;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    final protected boolean callCheck() {
        return total == TOTAL;
    }

    final protected boolean isFull() {
        return total == 11;
    }

    final protected int peekaboo() {
        if (callCheck())
            return TOTAL;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
