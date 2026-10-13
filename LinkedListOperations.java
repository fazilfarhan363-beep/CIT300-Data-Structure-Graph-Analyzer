/** Singly linked list for integer values. */
public class LinkedListOperations {
    private static class Node {
        int value;
        Node next;
        Node(int value) { this.value = value; }
    }

    private Node head;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
        System.out.println(value + " inserted into linked list.");
    }

    public boolean delete(int value) {
        if (head == null) return false;
        if (head.value == value) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null && current.next.value != value) {
            current = current.next;
        }
        if (current.next == null) return false;
        current.next = current.next.next;
        return true;
    }

    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) return true;
            current = current.next;
        }
        return false;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked list is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            System.out.print(current.next == null ? " -> null\n" : " -> ");
            current = current.next;
        }
    }
}
