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

class solution{
    public static boolean check(Node p, Node q){
        if(p==null && q== null){
            return true;
        }else{
            return false;
        }

        
        if(p.val != q.val ){
            return false;
        }

        check(p.left,q.left);
        check(p.right,q.right);
    }

    public static void main(String[] args){

    }
}