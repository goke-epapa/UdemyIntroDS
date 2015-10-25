package me.adegokeobasa.section4;

/**
 * Created by epapa on 25/10/2015.
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(12);
        list.insertAtHead(5);
        list.deleteFromHead();

        System.out.println(list);
        System.out.println(list.length());
        System.out.println(list.find(12));
    }
}
