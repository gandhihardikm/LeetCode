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
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        sumNumbers(root, list, "");
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        
        return sum;
    }
    
    private void sumNumbers(TreeNode root, ArrayList<Integer> list, String current) {
        if (root == null) {
            return;
        }
        
        if (root.left == null && root.right == null) {
            list.add(Integer.parseInt(current + root.val + ""));
            return;
        }
        
        sumNumbers(root.left, list, current + root.val + "");
        sumNumbers(root.right, list, current + root.val + "");
    }
}