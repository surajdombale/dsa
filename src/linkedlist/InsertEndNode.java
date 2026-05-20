package linkedlist;

public class InsertEndNode {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked List class
    static class LinkedList {
        Node head;

        // Insert at end
        void insert(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        // Delete a node
        void delete(int key) {
            if (head == null) {
                return;
            }

            // If head node itself holds the key
            if (head.data == key) {
                head = head.next;
                return;
            }

            Node current = head;

            while (current.next != null && current.next.data != key) {
                current = current.next;
            }

            // Key found
            if (current.next != null) {
                current.next = current.next.next;
            }
        }

        // Search element
        boolean search(int key) {
            Node current = head;

            while (current != null) {
                if (current.data == key) {
                    return true;
                }

                current = current.next;
            }

            return false;
        }

        // Print linked list
        void printList() {
            Node current = head;

            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }

            System.out.println("null");
        }
    }

    // Run method
    public static void run() {

        LinkedList list = new LinkedList();

        // Insert elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Linked List:");
        list.printList();

        // Search
        System.out.println("\nSearching 20:");
        System.out.println(list.search(20));

        // Delete
        System.out.println("\nDeleting 20...");
        list.delete(20);

        System.out.println("Updated Linked List:");
        list.printList();
    }
}