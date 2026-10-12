class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }

    public class height(Node root){
        if(root == null){
            return 
        }

        int left_h = root.left;
        int right_h = root.right;
        return max(left_h,right_h)+1;


    }
}