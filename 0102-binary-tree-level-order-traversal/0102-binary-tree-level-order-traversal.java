/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
        return res;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int s=qu.size();
            List<Integer> cur=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode cure=qu.poll();
                cur.add(cure.val);
                if(cure.left!=null)
                qu.add(cure.left);
                if(cure.right!=null)
                qu.add(cure.right);
            }
            res.add(cur);
        }
        return res;
    }
}