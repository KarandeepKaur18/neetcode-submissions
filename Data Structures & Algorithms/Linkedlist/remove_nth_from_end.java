// THis can be okay if we have to delete the n node from starting but we are asked to delete the n node from the end !!
class Solution{
    public static Node delete(Node head,N){
        Node temp = head;
        Node prev = null;
        int count = 0;
        while(temp != null){
            count++;    
            if(count == N){
                prev.next = temp.next;
                if(head == N){
                    return head.next;
                }
                return  head;
            }
            prev = temp;
            temp = temp.next;
        }
    }
}


// N NODE FROM END DELETE !!
class Solution{
    Node dummy = new Node(0,head);
    Node slow = dummy;
    Node fast = dummy ;

    for(int i = 0;i<=n;i++){
        fast = fast.next;
    }

    while(fast!=null){
        slow = slow.next;
        fast = fast.next;
    }

    slow.next = slow.next.next;
    return dummy.next;
}