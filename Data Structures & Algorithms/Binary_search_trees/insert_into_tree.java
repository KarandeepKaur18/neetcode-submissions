
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class Main {

    public static Node insert(Node root, int val) {

        if (root == null) {
            return new Node(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 8);
        root = insert(root, 3);
        root = insert(root, 10);
        root = insert(root, 1);
        root = insert(root, 6);
        root = insert(root, 14);
        root = insert(root, 7);

        System.out.println("Inorder:");
        inorder(root);

        System.out.println("\nPreorder:");
        preorder(root);

        System.out.println("\nPostorder:");
        postorder(root);
    }
}
