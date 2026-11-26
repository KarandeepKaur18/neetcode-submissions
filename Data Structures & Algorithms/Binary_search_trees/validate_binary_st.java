/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int data;
 *     TreeNode *left;
 *     TreeNode *right;
 *      TreeNode(int val) : data(val) , left(nullptr) , right(nullptr) {}
 * };
 **/

class Solution{
	
		public boolean isBST(TreeNode root){
            return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
		}

        public boolean check(TreeNode root,long min , long max){
            if(root == null){
                return true;
            }

            if(root.data <= min || root.data >= max){
                return false;
            }

            boolean left = check(root.left,min,root.data);
            boolean right = check(root.right, root.data , max);

            return left && right;
        }
};