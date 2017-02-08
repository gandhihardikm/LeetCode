/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {

        if(root == null)
            return true;
        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right))
            return true;

        return false;
    }

    public int height(TreeNode root){
        int left,right;
        if(root == null)
            return 0;

        left = height(root.left);
        right = height(root.right);
        return Math.max(left,right)+1;
    }
}