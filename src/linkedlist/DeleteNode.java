package linkedlist;

import util.ListNode;

public class DeleteNode {

    public static void run() {
        System.out.println("Delete Node Result:");
        deleteNode();
    }

    
    public static void deleteNode(ListNode node) {
        node.setVal(node.getNext().getVal());
        node.setNext(node.getNext().getNext());
    }
}