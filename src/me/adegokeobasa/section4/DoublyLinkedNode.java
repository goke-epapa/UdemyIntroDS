package me.adegokeobasa.section4;

/**
 * Created by epapa on 27/10/2015.
 */
public class DoublyLinkedNode {

    private int data;
    private DoublyLinkedNode nextNode;
    private DoublyLinkedNode prevNode;

    public DoublyLinkedNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    public DoublyLinkedNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoublyLinkedNode prevNode) {
        this.prevNode = prevNode;
    }
}