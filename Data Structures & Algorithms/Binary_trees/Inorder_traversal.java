
public class Node{

    
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }

    public static void main(String args[]){
        Node root = new Node(1);
        Node a = new Node(4);
        Node b = new Node(4);
        Node c = new Node(2);
       

        root.left = a;
        a.left  = b;
        a.right = c;

        Inorder_traversal(root);

    }

    public static void Inorder_traversal(Node root){
        if(root == null){
            return;
        }

        Inorder_traversal(root.left);
        System.out.print(root.val);
        Inorder_traversal(root.right);
    }

}