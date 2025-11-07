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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)
        return res;
        Queue<TreeNode> qe=new LinkedList<>();
        qe.offer(root);
        while(!qe.isEmpty()){
            int s=qe.size();
            TreeNode n=null;
            for(int i=0;i<s;i++){
                n=qe.poll();
                if(n.left!=null)
                qe.offer(n.left);
                if(n.right!=null)
                qe.offer(n.right);
            }
            res.add(n.val);
        }
        return res;
    }
}