package edu.kis.vh.nursery.list;

public class Node {

    private final int value;
    private Node prev;
    private Node next;

    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node(int i) {
        value = i;
    }

}
