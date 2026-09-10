public class Main{
    public static void main(String[] args){
        int[] arr = {2,3,4,5};
        Node y = new Node(arr[0]);
        System.out.println(y);
        System.out.println(y.data);
    }
}

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

