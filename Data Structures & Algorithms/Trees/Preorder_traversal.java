class Node{
    int val ;
    Node left;
    Node right;

    public Node(int val){
        this.val = val;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;

        Node c = new Node(4);
        Node d = new Node(5);

        a.left = c;
        a.right = d;
        
        preorder(root);

    }

    public static preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.val + "->" + " ");

        print_all(root.left);
        print_all(root.right);
        
    }
}