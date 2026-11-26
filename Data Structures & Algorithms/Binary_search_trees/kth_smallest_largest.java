// it is the bianry tree only but its left nodes are less than the root and the right nodes are greater than the root 
// search in binary tree  worst case is o(n) but as name itself suggest binary tree so binary algorithm has beeen used here . 
// We will search acc to the number greater or lesser than the root 
// biary search tree has 0(n) time complexity 
// inorder traversal is sorted 

class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}

public class Main{

    int count ;
    int smallest;
    int largest;

    public static Node insert(Node root,int val){
        if(root == null){
            return new Node(val);
        }

        if(val < root.val){
            root.left =  insert(root.left,val);

        }else if(val>root.val){
            root.right = insert(root.right,val);
        }
        return root ;
    }

    public int[] smallestlargest(Node root, int k){
        count = 0;
        inorder(root,k);
        int kth_smallest = smallest;


        count = 0;
        reverse_inorder(root,k);
        int kth_largest = largest;

        return new int[]{kth_smallest,kth_largest};
    }

    public void inorder(Node root,int k){
        if(root == null){
            return;
        }

        root = inorder(root.left,k);
        count++;
        if(count == k){
            smallest = root.val;
            return;
        }

        inorder(root.right,k);
    }

    public void reverse_inorder(Node root,int k){
        if(root == null){
            return;
        }

        reverse_inorder(root.right,k);
        count++;
        if(count == k){
            largest = root.val;
            return;
        }

        reverse_inorder(root.left,k);

    }



    public static void main(String[] args){
        Node root = null;
        
        root = insert(root,50);
        root = insert(root,30);
        root = insert(root,70);
        root = insert(root,20);
        root = insert(root,40);
    }
}