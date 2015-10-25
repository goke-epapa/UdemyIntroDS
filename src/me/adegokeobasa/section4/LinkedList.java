package me.adegokeobasa.section4;

/**
 * Created by epapa on 25/10/2015.
 */
public class LinkedList<T> {

    private Node<T> head;

    public Node<T> getHead() {
        return head;
    }

    /**
     * Inserts new node at the head
     *
     * @param data
     */
    public void insertAtHead(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    @Override
    public String toString() {
        String result = "{";
        Node<T> current = this.head;

        while (current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }

    public int length() {
        int length = 0;

        Node<T> current = this.head;

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
        Node<T> current = this.head;

        while (current != null) {
            if(current.getClass().equals(data)) {
                return current;
            }
            current = current.getNextNode();
        }

        return null;
    }

    public boolean isEmpty()
    {
        return this.head == null;
    }

}
