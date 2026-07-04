package linkedlist;

import util.ListNode;

public class ShiftNode {

    public static void run() {
        System.out.println("Running Shift Node...");
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original Linked List: ");
        printList(head);

        int k = 2;
        ListNode shiftedHead = shiftNode(head, k);

        System.out.print("Shifted Linked List: ");
        printList(shiftedHead);
        System.out.println();
    }

    /*
    =========================================================
    QUESTION 5: Shift Node
    =========================================================

    Problem:
    Given a linked list, shift the nodes to the right by k positions.

    Example:
    Input:
    Linked List: 1 -> 2 -> 3 -> 4 -> 5
    k: 2

    Output:
    Shifted Linked List: 4 -> 5 -> 1 -> 2 -> 3
    */

    public static ListNode shiftNode(ListNode head, int k) {
        if (head == null || head.next == null || k <= 0) {
            return head;
        }

        // Find the length of the linked list
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Make the linked list circular
        tail.next = head;

        // Find the new tail and new head after shifting
        k = k % length; // Handle cases where k is greater than length
        int stepsToNewTail = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;

        // Break the circular link
        newTail.next = null;

        return newHead;
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}   