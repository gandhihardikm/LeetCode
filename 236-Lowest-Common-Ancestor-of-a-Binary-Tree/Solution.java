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

public class Solution{
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2){
		if(root == null || root == node1 || root == node2) return root;

		TreeNode left = lowestCommonAncestor(root.left,node1,node2);
		TreeNode right = lowestCommonAncestor(root.right,node1,node2);

		if(left != null && right != null)
			return root;
		else if(left != null)
			return left;
		else if(right != null)
			return right;
		else
			return null;
	}
}