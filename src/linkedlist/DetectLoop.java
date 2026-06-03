package linkedlist;
import util.ListNode;

public class DetectLoop {
    public static void run() {
        System.out.println("Detect Loop Result:");
        detectLoop();
    }

    /*
    =========================================================
    QUESTION 3: Detect Loop in Linked List
    =========================================================

    Problem:
    Check whether the linked list contains a cycle.

    Example:
    Input:
    1 -> 2 -> 3 -> 4
              ^    |
              |____|

    Output:
    Loop Detected
    */

    public static void detectLoop() {

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);

        // Creating loop manually
        fourth.setNext(fifth);
        fifth.setNext(second);

        ListNode slow = head;
        ListNode fast = head;

        boolean hasLoop = false;

        while (fast != null && fast.getNext() != null) {

            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }

        if (hasLoop) {
            System.out.println("Loop Detected");
        } else {
            System.out.println("No Loop");
        }
    }


}   