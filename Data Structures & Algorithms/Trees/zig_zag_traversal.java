import java.util.Stack;

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

public class Solution {
    public static void zigzagTraversal(Node root) {
        if (root == null) {
            return; // Semicolon missing tha
        }

        Stack<Node> curr = new Stack<>();
        Stack<Node> next = new Stack<>();

        boolean leftToRight = true; // 'bool' ki jagah 'boolean'

        curr.push(root);

        while (!curr.isEmpty()) {
            Node temp = curr.pop(); // C++ pointer style hata diya

            if (temp != null) {
                System.out.print(temp.val + " "); // temp.data ki jagah temp.val

                if (leftToRight) {
                    if (temp.left != null) next.push(temp.left);
                    if (temp.right != null) next.push(temp.right);
                } else {
                    if (temp.right != null) next.push(temp.right);
                    if (temp.left != null) next.push(temp.left);
                }
            }

            // Jab current level ke saare nodes khatam ho jayein
            if (curr.isEmpty()) {
                leftToRight = !leftToRight; // Direction reverse karo
                
                // Stacks ko swap karna
                Stack<Node> tempStack = curr;
                curr = next;
                next = tempStack;
            }
        }
    }
}