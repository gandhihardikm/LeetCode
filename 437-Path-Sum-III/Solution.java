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
    public int pathSum(TreeNode root, int sum) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        return sum(root,0, sum,hmap);
        
    }
    
    public int sum(TreeNode root, int sum, int target, HashMap<Integer,Integer> hmap){
        if(root == null)
            return 0;
            
        sum+= root.val;
        int res = hmap.getOrDefault(sum-target,0);
        hmap.put(sum,hmap.getOrDefault(sum,0)+1);
        
        res += sum(root.left, sum,target,hmap) + sum(root.right,sum,target,hmap);
        hmap.put(sum,hmap.get(sum)-1);
        return res;
    }
}