package linkedlist;

import util.ListNode;

public class DeleteNode {

    public static void run() {
        System.out.println("Delete Node Result:");
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        head.getNext().setNext(new ListNode(3));
        deleteNode(head);
    }

    
    public static void deleteNode(ListNode node) {
        node.setVal(node.getNext().getVal());
        node.setNext(node.getNext().getNext());
    }
}