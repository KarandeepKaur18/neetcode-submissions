class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }

    Node(int data1){
        data = data1;
        next = null;
    }
}

class Solution{
    static Node findmiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}

public static void main(String args[]){
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    // Find the middle node
    Node middleNode = findMiddle(head);

    // Display the value of the middle node
    System.out.println("The middle node value is: " + middleNode.data);
}

