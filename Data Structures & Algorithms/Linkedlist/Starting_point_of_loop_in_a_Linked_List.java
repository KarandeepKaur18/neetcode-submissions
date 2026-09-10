import.java.util.*;
    class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    // Function to detect the starting point of loop using Floyd’s algorithm
    public ListNode detectCycle(ListNode head) {
        // Initialize slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;

        // Traverse while fast and fast.next are not null
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;

            // Move fast two steps
            fast = fast.next.next;

            // If they meet, cycle is present
            if (slow == fast) {
                // Reset slow to head
                slow = head;

                // Move both one step to find start of loop
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // Return the starting node of loop
                return slow;
            }
        }

        // If no cycle found
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create nodes
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // Create cycle: last node connects to node with value 2
        head.next.next.next.next = head.next;

        Solution obj = new Solution();
        ListNode result = obj.detectCycle(head);

        if (result != null)
            System.out.println("Cycle starts at node with value: " + result.val);
        else
            System.out.println("No cycle found.");
    }
}
