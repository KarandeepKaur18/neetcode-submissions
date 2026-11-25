class Node{
    int val ;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
        left = null;
        right = null;

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
        
        postorder(root);
    }

    public static void postorder(Node root){
        if(root == null){
            return ;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val);
    }
}