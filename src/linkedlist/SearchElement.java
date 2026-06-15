package linkedlist;

import util.ListNode;

public class SearchElement {
    public static void run() {
        System.out.println("Search Element Result:");
        searchElement();
    }

    public static void searchElement() {
        // Create a linked list
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        head.getNext().setNext(new ListNode(3));
        head.getNext().getNext().setNext(new ListNode(4));
        head.getNext().getNext().getNext().setNext(new ListNode(5));
       

        int target = 3;
        boolean found = search(head, target);

        if (found) {
            System.out.println("Element " + target + " found in the linked list.");
        } else {
            System.out.println("Element " + target + " not found in the linked list.");
        }
    }
    public static boolean search (ListNode head, int target) {
            ListNode current = head;
            while (current != null) {
                if (current.getVal() == target) {
                    return true;
                }
                current = current.getNext();
            }
            return false;
    }
}