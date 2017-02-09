/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    private static final String spliter = ",";
    private static final String NN = "X";
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        builder(root,sb);
        System.out.println(sb.toString());
        return sb.toString();
    }
    
    public void builder(TreeNode root, StringBuilder sb){
        if(root == null){
            sb.append(NN).append(spliter);
        }else{
            sb.append(root.val).append(spliter);
            builder(root.left,sb);
            builder(root.right,sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(spliter)));
        return buildTree(nodes);
    }
    
    public TreeNode buildTree(Deque<String> nodes){
        String val = nodes.remove();
        if(val.equals(NN))
            return null;
        else{
            TreeNode root = new TreeNode(Integer.valueOf(val));
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            return root;
        }    
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));