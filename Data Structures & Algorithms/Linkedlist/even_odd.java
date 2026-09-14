class Solution{

    if(head == null || head.next == null){
        return head;
    }


    Node odd = head;
    Node even = head.next;
    Node evenfirst = even;

    while(even.next!=null && even!=null){
        odd.next = even.next;
        odd = odd.next;

        even.next = odd.next;
        even = even.next;
    }

    odd.next = null;
    even.next = head;
    return evenfirst;
}