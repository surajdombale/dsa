package linkedlist;

import util.ListNode;

public class FindMiddleNode {
    public static void run() {
        System.out.println("Find Middle Node Result:");
        findMiddleNode();
    }
       /*
    =========================================================
    QUESTION 2: Find Middle Node
    =========================================================

    Problem:
    Find the middle node of the linked list.

    Example:
    Input:
    1 -> 2 -> 3 -> 4 -> 5 -> null

    Output:
    3
    */

    public static void findMiddleNode() {

        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        head.getNext().setNext(new ListNode(3));
        head.getNext().getNext().setNext(new ListNode(4));
        head.getNext().getNext().getNext().setNext(new ListNode(5));
        head.getNext().getNext().getNext().getNext().setNext(new ListNode(6));

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.getNext() != null) {

            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        System.out.println("Middle Node: " + slow.getVal());
    }
}