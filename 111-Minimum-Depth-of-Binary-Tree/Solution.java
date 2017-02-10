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
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
            
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        int height = 1;
        while(!q.isEmpty()){
            root = q.poll();
            if(root == null){
                height++;
                q.offer(null);
            }else{
                if(root.left == null && root.right == null)
                    break;
                if(root.left != null)
                    q.offer(root.left);
                if(root.right != null)
                    q.offer(root.right);
            }
        }
        return height;
        
    }
}