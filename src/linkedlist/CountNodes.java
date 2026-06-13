package linkedlist;

import util.ListNode;

public class CountNodes {
    public static void run() {
        System.out.println("Count Nodes Result:");
        countNodes();
    }

    /*
    =========================================================
    QUESTION 3: Count Nodes in Linked List
    =========================================================

    Problem:
    Count the number of nodes in the linked list.

    Example:
    Input:
    1 -> 2 -> 3 -> 4 -> null

    Output:
    4
    */

    public static void countNodes() {

        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        head.getNext().setNext(new ListNode(3));
        head.getNext().getNext().setNext(new ListNode(4));
        head.getNext().getNext().getNext().setNext(new ListNode(5));
        head.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        head.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));
        head.getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(8));
        head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(9));
        head.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(10));

        int count = 0;
        ListNode current = head;

        while (current != null) {
            count++;
            current = current.getNext();
        }

        System.out.println("Number of Nodes: " + count);
    }
}   