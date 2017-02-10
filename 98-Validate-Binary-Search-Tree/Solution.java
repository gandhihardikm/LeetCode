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
    public boolean isValidBST(TreeNode root) {
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    public boolean valid(TreeNode root, long min, long max){
        if(root == null)return true;
        return (min < root.val && root.val < max) && valid(root.left,min,root.val) && valid(root.right,root.val,max);
    }
}