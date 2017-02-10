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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        if(root == null)
            return output;
            
        queue.add(root);
        queue.add(null);
        int count=1;
        while(!queue.isEmpty() && count != 0){
            root = queue.remove();
            stack.push(root);
            if(root == null){
                queue.add(null);
            }else{
                if(root.right!=null){ 
                    queue.add(root.right);
                    count++;
                }
                if(root.left!=null){ 
                    queue.add(root.left);
                    count++;
                }    
                count--;
            }
        }
        List<Integer> inner=new ArrayList<Integer>();
        while(!stack.empty()){
            root = stack.pop();
            if(root == null){
                output.add(inner);
                inner = new ArrayList<Integer>();
            }else{
                inner.add(root.val);
            }
        }
        output.add(inner);
        return output;
        
    }
    
    
    /*public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        levelMaker(wrapList, root, 0);
        return wrapList;
    }
    
    public void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
        if(root == null) return;
        System.out.println(list.size());
        if(level >= list.size()) {
            list.add(0, new LinkedList<Integer>());
        }
        levelMaker(list, root.left, level+1);
        levelMaker(list, root.right, level+1);
        list.get(list.size()-level-1).add(root.val);
    }*/

}