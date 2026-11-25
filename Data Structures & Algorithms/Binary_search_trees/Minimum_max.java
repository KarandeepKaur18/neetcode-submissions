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

    public static int min(Node root){
        if(root == null){
            return -1;
        }

        while(root.left !=null){
            root = root.left;
        }

        return root;
    }

    public static int(Node root ){
        if(root == null){
            return -1;
        }

        while(root.right!=null){
            root = root.right;
        }

        return root ;
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