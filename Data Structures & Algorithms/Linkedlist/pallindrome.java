class Node{
    int data;
    Node next;

    Node(int data,Node next1){
        this.data = data;
        next = next1;
    }

    Node(int data){
        this.data = data;
        next = null;
    }


}

class Solution{

    public Node reversedList(Node head){
        Node temp  = head;
        Node prev = null;
        Node curr = null;

        while(temp!=null){
            curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
        }
        
        return prev;

    }


    public boolean isPallindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }

        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!= null ){
            slow = slow.next;
            fast = fast.next.next;   
        }

        Node newhead = reversedList(slow.next);
        Node first = head;
        Node second = newhead;

        while(second != null){
            if(first.data != second.data){
                reversedList(newhead);
                return false;
            }

            first=first.next;
            second=second.next;
        }

        reversedList(newhead);
        return true;

    }
}