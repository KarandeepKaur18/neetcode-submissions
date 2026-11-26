/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public TreeNode lca(TreeNode root, int p, int q) {
        //your code goes here
        if(root == null){
            return null;
        }

        if(p< root.data && q > root.data || p>root.data && q < root.data){
            return root;
        }

        if(p < root.data && q < root.data){
            return lca(root.left,p,q);
        }else{
            return lca(root.right,p,q);
        }
    }
}