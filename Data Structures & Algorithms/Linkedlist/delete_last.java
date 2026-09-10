class Node{
    int data;
    Node next;

    Node(int data1, Node next1){
        data = data1;
        next = next1
    }

    Node(int data1){
        data = data1;
        next = null;
    }
}

class deletetail(){
    public Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }

        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }

        Node tail = curr.next;
        curr.next = null;
        return head;

    }
}

class Main(){
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        deletetail obj =  new deleteTail();
        head = obj.deleteTail(head);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
}