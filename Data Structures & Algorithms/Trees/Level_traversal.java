class Node{
    int val ;
    Node left;
    Node right;

    public Node(int val){
        this.val = val;
        left = nul;
        right = null;
    }

     
    void printlevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEpty()){
            Node curr = q.poll();
            print(curr.data);

            if(curr.left!=null){
                q.add(curr.left);
            }

            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }

    

}