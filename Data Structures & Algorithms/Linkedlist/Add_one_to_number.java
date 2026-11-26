// Standard approach !! reverse add reverse (new node creation)
public class {
    public static Node reverse(head){
        Node temp = head;
        Node prev = null;
        Node curr = null;

        while(temp != null){
            curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
        }

        return prev;
    }

    public static Node addone(head){
        head = reverse(head);
        Node temp = head;
        int carry = 1;

        Node dummy = new Node(0);
        Node in = dummy;
        while(temp!=null || carry!= 0){
            int val = (temp != null) ? temp.data : 0;
            int sum = val + carry;
            carry = sum / 10;
            int digit = sum % 10;

            Node fin = new Node(digit);
            in.next = fin;
            in = in.next;

            if(temp !=null){
                temp = temp.next;
            }
        }

        return reverse(dummy.next);
    }
}

// SECOND METHOD : Changing same linkedlist 
