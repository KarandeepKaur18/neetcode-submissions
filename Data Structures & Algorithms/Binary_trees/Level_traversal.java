class Node{
    int val ;
    Node left;
    Node right;

    public Node(int val){
        this.val = val;
        left = null;
        right = null;
    }

     
    void printlevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // we does this to identify the next level when reached 
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr == null){
                if(q.isEmpty()){
                    return;
                }
                q.add(null);
                System.out.println();
                continue;
            }
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