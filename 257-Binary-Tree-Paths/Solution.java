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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> s= new ArrayList<String>();
        printPath(root,s,"");
        return s;
    }
    
    public void printPath(TreeNode root, List<String> s,String output){
        if(root == null)
            return;
        
        if(root.left == null && root.right == null){
            s.add(output+String.valueOf(root.val));
            return;
        }

        if(root.left != null)
            printPath(root.left,s,output+String.valueOf(root.val)+"->");
        if(root.right != null)    
            printPath(root.right,s,output+String.valueOf(root.val)+"->");
    }
}