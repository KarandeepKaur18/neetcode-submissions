// sum of the longest path from the root to the leaf .
// root -> root.left -> root.right and wherever got leaf node sum up and keep it as max if it greater then the sum initiaally recorded 

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {

    int maxsum = 0;
    int maxlength = 0;


    public static void  checksum(Node root,int length,int sum){
        if(root == null){
            return;
        }

        length++;
        sum+=root.data;

        if(root.left == null && root.right == null){
            if(length > maxlength){
                maxlength = length;
                maxsum = sum;
            }else if(length == maxlength){
                maxsum = Math.max(maxsum,sum);
            }
            return;
        }

        solve(root.left,length,sum);
        solve(root.right,length,sum);

    }
   

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        Solution obj = new Solution();
        obj.checksum(root, 0, 0);

        System.out.println("Maximum sum: " + obj.maxsum);
        System.out.println("Maximum length: " + obj.maxlength);
    }
}
