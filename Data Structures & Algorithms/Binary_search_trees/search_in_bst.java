
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
        }
        else if (val > root.val) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static Node search(Node root, int check) {

        if (root == null) {
            return null;
        }

        if (root.val == check) {
            return root;
        }

        if (check > root.val) {
            return search(root.right, check);
        }
        else {
            return search(root.left, check);
        }
    }

    public static void preorder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        int check = 2;

        Node root = null;

        root = insert(root, 4);
        root = insert(root, 2);
        root = insert(root, 7);
        root = insert(root, 1);
        root = insert(root, 3);

        Node ans = search(root, check);

        preorder(ans);
    }
}
