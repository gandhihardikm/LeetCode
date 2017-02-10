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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        Stack<TreeNode> s= new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        TreeNode temp;
        while(current != null || !s.empty()){
            if(current != null){
                s.push(current);
                current = current.left;
            }else{
                temp = s.peek().right;
                if(temp == null){
                    temp = s.pop();
                    result.add(temp.val);
                    while(!s.empty() && temp == s.peek().right){
                        temp = s.pop();
                        result.add(temp.val);
                    }
                }else{
                    current = temp;
                }
            }
        }
        return result;
        
    }
}