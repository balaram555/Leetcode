/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public class Info{
        boolean foundp;
        boolean foundq;
        TreeNode LCA;

    Info(boolean foundp, boolean foundq, TreeNode LCA) {
            this.foundp = foundp;
            this.foundq = foundq;
            this.LCA = LCA;
    }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Info ans=FindLCA(root,p,q);
        return ans.LCA;
    }
    private Info FindLCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return new Info(false, false, null);

        Info left = FindLCA(root.left, p, q);
        if (left.LCA != null) return left;

        Info right = FindLCA(root.right, p, q);
        if (right.LCA != null) return right;

        boolean foundp = left.foundp || right.foundp || (root == p);
        boolean foundq = left.foundq || right.foundq || (root == q);

        TreeNode LCA = null;
        if (foundp && foundq) LCA = root;

        return new Info(foundp, foundq, LCA);
}
}