
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

Time Complexity = O(n)

public class Solution {
    int count = 0;
	int result = Integer.MIN_VALUE;

	public int kthSmallest(TreeNode root, int k) {
    	traverse(root, k);
    	return result;
	}

	public void traverse(TreeNode root, int k) {
    	if(root == null) return;
    	traverse(root.left, k);
    	count ++;
    	if(count == k) result = root.val;
    	traverse(root.right, k);       
	}
}