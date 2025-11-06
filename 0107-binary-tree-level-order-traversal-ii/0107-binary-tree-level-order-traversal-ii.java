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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
        return res;
        Queue<TreeNode> que=new LinkedList<>();
        Stack<List<Integer>> st=new Stack<>();
        que.add(root);
        while(!que.isEmpty()){
            int s=que.size();
            List<Integer> cur=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode cure=que.poll();
                cur.add(cure.val);
                if(cure.left!=null)
                que.add(cure.left);
                if(cure.right!=null)
                que.add(cure.right);
            }
        st.push(cur);
        }
        while(!st.isEmpty()){
            res.add(st.pop());
        }
        return res;
    }
}