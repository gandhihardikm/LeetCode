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
    public int maxDepth(TreeNode root) {
        int left,right;
        int max=0;
        if(root == null)
            return 0;
        
        left = maxDepth(root.left);
        right = maxDepth(root.right);
        
        return Math.max(left,right)+1;
        
    }
}