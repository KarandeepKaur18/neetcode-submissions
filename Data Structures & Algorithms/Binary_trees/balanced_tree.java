class Node{
    int val;
    Node left;
    Node right;

    public Node(int val){
        this.val = val;
        left == null;
        right == null;
    }

}

public class Balanced_tree{
    public boolean isbalanced(Node root){
        return checkheight(root) != -1;
    }

    private int checkheight(Node node){
        if(node == null){
            return 0;
        }

        int leftheight = checkheight(node.left);
        if(leftheight == -1) return -1;

        int rightheight = checkheight(node.right);
        if(rightheigth == -1) return -1;

        if(Math.abs(leftheight-rightheight > 1)){
            return -1;
        }

        return Math.max(leftheight,rightheight)+1;

    }
}