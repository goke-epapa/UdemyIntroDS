package me.adegokeobasa.section4;

/**
 * Created by epapa on 25/10/2015.
 */
public class Node {
    private int data;
    private Node nextNode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Data: " + this.data;
    }
}
