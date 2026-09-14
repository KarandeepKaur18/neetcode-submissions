// Node class represents a node in the linked list
class Node {
    // Data stored in the node
    int data;

    // Pointer to the next node
    Node next;

    // Constructor with data and next pointer
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data
    Node(int data1) {
        data = data1;
        next = null;
    }
}

// Solution class contains method to delete middle node
class Solution {
    // Function to delete the middle node
    public Node deleteMiddle(Node head) {
        // If list has only one node, delete it
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize slow pointer to head
        Node slow = head;

        // Initialize fast pointer two steps ahead
        Node fast = head.next.next;

        // Traverse until fast reaches end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Bypass the middle node
        slow.next = slow.next.next;

        // Return head of updated list
        return head;
    }
}

// Main class for driver code
public class Main {
    // Function to print linked list
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Driver function
    public static void main(String[] args) {
        // Creating linked list 1->2->3->4->5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Printing original list
        System.out.print("Original Linked List: ");
        printLL(head);

        // Deleting middle node
        Solution obj = new Solution();
        head = obj.deleteMiddle(head);

        // Printing updated list
        System.out.print("Updated Linked List: ");
        printLL(head);
    }
}
