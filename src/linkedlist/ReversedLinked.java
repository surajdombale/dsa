package linkedlist;

import util.ListNode;

public class ReversedLinked {

    public static void run() {
        System.out.println("Reverse Linked List Result:");
        reverseLinkedList();
    }

    /*
    =========================================================
    QUESTION 1: Reverse a Linked List
    =========================================================

    Problem:
    Reverse the given singly linked list.

    Example:
    Input:
    1 -> 2 -> 3 -> 4 -> null

    Output:
    4 -> 3 -> 2 -> 1 -> null
    */

    public static void reverseLinkedList() {
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        head.getNext().setNext(new ListNode(3));
        head.getNext().getNext().setNext(new ListNode(4));
        head.getNext().getNext().getNext().setNext(new ListNode(5));
        head.getNext().getNext().getNext().getNext().setNext(new ListNode(6));
        head.getNext().getNext().getNext().getNext().getNext().setNext(new ListNode(7));

        System.out.println("Original Linked List:");
        printList(head);

        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(reversedHead);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.getVal() + " -> ");
            head = head.getNext();
        }
        System.out.println("null");
    }
    
}