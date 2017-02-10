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
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root,false);       
    }
    
    public int sum(TreeNode root,boolean dir){
        int total=0;
        if(root == null)
            return 0;
          
       if(dir == true && root.left == null && root.right == null)
            return root.val;
        total = sum(root.left,true)+sum(root.right,false);
        
         
            
        return total;
    }
}