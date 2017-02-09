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
    public TreeNode sortedArrayToBST(int[] nums) {
            if(nums.length == 0) return null;
        return constructTree(0,nums.length-1,nums);
        
    }
    // return root node
    public TreeNode constructTree(int low, int high, int[] nums){
        if(low > high){
            return null;
        }    
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = constructTree(low,mid-1,nums);
        root.right = constructTree(mid+1,high,nums);
        return root;
    }
}