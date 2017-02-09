/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

Time Complexity - O(n)

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return treeHeight(root) != -1;
    }
    
    public int treeHeight(TreeNode root){
        if(root == null) return 0;
        
        int left = treeHeight(root.left);
        if(left == -1) return -1;
        int right = treeHeight(root.right);
        if(right == -1) return -1;
        
        if(Math.abs(left - right) > 1) return -1;
        return Math.max(left,right) + 1;
    }
}