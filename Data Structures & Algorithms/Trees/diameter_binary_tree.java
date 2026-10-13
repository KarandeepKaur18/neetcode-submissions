class Node{
    int val;
    Node left;
    Node right;

    public Node(int val){
        this.val = val;
        left = null;
        right = null;
    }

}

public class Diameter{

    private static int maxdiam = 0;

    public static int diameter(Node root) {
        maxDiameter = 0; // Reset for each call
        height(root);
        return maxDiameter;
    }


    public static int height(Node root){
        if(root == null){
            return 0;
        }


        int leftheight = height(root.left);
        int rightheight = height(root.right);

        int currpath = leftheight + rightheight;
        maxdiam = Math.max(currpath,maxdiam);

        return Math.max(leftheight,rightheight)+1;

    } 
}