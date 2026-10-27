class Solution{
    public static boolean isleaf(Node root){
        return (node.left == null && node.right == null);
    }

    public static void addleftboundary(Node root,ArrayList<Integer> res){
        Node curr = root.left; 
        while(curr!=null){ 
            if(!isleaf(curr)){
                res.add(curr.val);
            }

            if(curr.left != null){
                curr = curr.left;
            }else{
                curr = curr.right;
            }
        }
    }

    public static void addleaves(Node root, ArrayList<Integer> res){
        if(root == null){
            return;
        }

        if (isleaf(root)){
            res.add(root.val);
            return;
        }

        addleaves(root.left,res);
        addleaves(root.right,res);


    }

    public static void addrightboundary(Node root,ArrayList<Integer> res){
        Node curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();

        while(curr!=null){
            if(!isleaf(curr)){
                temp.add(curr.val);
            }

            if(curr.right != null){
                curr = curr.right;
            }else{
                curr = curr.left;
            }
        }

        for(int i = temp.size()-1;i>=0;i--){
            res.add(temp.get(i));
        }
    }

    public static ArrayList<In bteger> traverseboundary(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        if(!isleaf(root)){
            res.add(rott.val);
        }

        addleftboundary(root,res);
        addleaves(root,res);
        addrightboundary(root,res);

        return res;
    }
}