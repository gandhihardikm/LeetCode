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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        if(root != null)
            q.add(root);
        else
            return output;
        
        boolean evenFlag = false;    
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> inner = new ArrayList<>();
            for(int i=0;i<size;i++){
                root = q.remove();
                if(root.left != null)
                    q.add(root.left);
                if(root.right != null)
                    q.add(root.right);
                inner.add(root.val);
            }
            
            if(evenFlag){
                Collections.reverse(inner);
                output.add(inner);
                evenFlag = false;
            }    
            else{
                output.add(inner);
                evenFlag = true;
            }    
        }
        
        return output;
    }
}