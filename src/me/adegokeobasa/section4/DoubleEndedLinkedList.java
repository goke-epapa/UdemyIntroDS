package me.adegokeobasa.section4;

/**
 * Created by epapa on 25/10/2015.
 */
public class DoubleEndedLinkedList {

    private Node head;
    private Node tail;

    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            this.head = newNode;
        }

        if(this.tail != null) {
            this.tail.setNextNode(newNode);
        }

        this.tail = newNode;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
