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
    public TreeNode invertTree(TreeNode root) {
        TreeNode left,right;
        if(root == null)
            return root;
        
        left = invertTree(root.left);
        right = invertTree(root.right);

        root.right = left;
        root.left = right;
        

        /*TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);*/
        
        return root;
        
    }
}