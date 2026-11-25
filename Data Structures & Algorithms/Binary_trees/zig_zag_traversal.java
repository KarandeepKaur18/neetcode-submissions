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
            return; 
        }

        Stack<Node> curr = new Stack<>();
        Stack<Node> next = new Stack<>();

        boolean leftToRight = true; 

        curr.push(root);

        while (!curr.isEmpty()) {
            Node temp = curr.pop(); 

            if (temp != null) {
                System.out.print(temp.val + " "); 

                if (leftToRight) {
                    if (temp.left != null) next.push(temp.left);
                    if (temp.right != null) next.push(temp.right);
                } else {
                    if (temp.right != null) next.push(temp.right);
                    if (temp.left != null) next.push(temp.left);
                }
            }

            
            if (curr.isEmpty()) {
                leftToRight = !leftToRight; 
              
                Stack<Node> tempStack = curr;
                curr = next;
                next = tempStack;
            }
        }
    }
}