package me.adegokeobasa.section4;

/**
 * Created by epapa on 25/10/2015.
 */
public class LinkedList {

    private Node head;

    /**
     * Inserts new node at the head
     *
     * @param data
     */
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
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

    public int length() {
        int length = 0;

        Node current = this.head;

        while (current != null) {
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    public void deleteFromHead() {
        this.head = head.getNextNode();
    }

    public Node find(int data) {

        Node current = this.head;

        while (current != null) {
            if(current.getData() == data) {
                return current;
            }
            current = current.getNextNode();
        }

        return null;
    }


}