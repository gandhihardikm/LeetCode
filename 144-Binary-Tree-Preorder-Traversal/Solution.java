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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> output = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<>();
        while(true){
            while(root != null){
                output.add(root.val);
                s.push(root);
                root = root.left;
            }
            
            if(s.empty())
                break;
                
            root = s.pop();
            root = root.right;
        }
        return output;
    }
}