package me.adegokeobasa.section4;

/**
 * Created by epapa on 27/10/2015.
 */
public class DoublyLinkedList {
    private DoublyLinkedNode head;

    public void insertAtHead(int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);

        if(this.head != null) {
            this.head.setPrevNode(newNode);
        }
        this.head = newNode;
    }

    public int length() {
        int length = 0;

        DoublyLinkedNode current = this.head;

        while (current != null) {
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    @Override
    public String toString() {
        String result = "{";
        DoublyLinkedNode current = this.head;

        while (current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }

}