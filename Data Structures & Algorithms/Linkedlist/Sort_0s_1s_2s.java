// Mistakes here i did : 
// if there is empty list then ? 
// suppose there is no 0 or 1 or 2 [any one among three num] : no zero hence null ptr next is not possible
// initialized null pointers next which we cannot . 


class Solution{

    if(head == null || head.next == null){
        return head;
    }

    Node zerohead  = null,zerotail = null;
    Node onehead = null , onetail = null;
    Node twohead = null, twotail = null;

    Node temp = head;

    while(temp!=null){
        Node next = temp.next;
        temp.next = null;

        if(temp.data == 0){
            if(zerohead == null){
                zerohead = temp;
                zerotail = temp;
            }else{
                zerotail.next = temp;
                zerotail = temp;
            }
        }else if(temp.data == 1){
            if(onehead == null){
                onehead = temp;
                onetail = temp;
            }else{
                onetail.next = temp;
                onetail = temp;
            }
        }else{
            if (twoHead == null) {
                    twoHead = temp;
                    twoTail = temp;
            } else {
                twoTail.next = temp;
                twoTail = temp;
            }
        }

        temp = next;
    
    }

    if (zeroHead != null) {
            if (oneHead != null) {
                zeroTail.next = oneHead;
            } else {
                zeroTail.next = twoHead;
            }
        }

        if (oneHead != null) {
            oneTail.next = twoHead;
        }

        if (zeroHead != null)
            return zeroHead;

        if (oneHead != null)
            return oneHead;

        return twoHead;
}
