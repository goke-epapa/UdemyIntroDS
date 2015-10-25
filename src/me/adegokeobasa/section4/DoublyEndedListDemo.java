package me.adegokeobasa.section4;

/**
 * Created by epapa on 25/10/2015.
 */
public class DoublyEndedListDemo {

    public static void main(String[] args) {
        DoubleEndedLinkedList doubleEndedLinkedList = new DoubleEndedLinkedList();

        doubleEndedLinkedList.insertAtTail(2);
        doubleEndedLinkedList.insertAtTail(3);
        doubleEndedLinkedList.insertAtTail(20);
        doubleEndedLinkedList.insertAtTail(1);

        System.out.println(doubleEndedLinkedList);
    }
}
