import medium.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MaxDepthTree {
    public int maxDepth(TreeNode root)
    {
        if(root == null)
            return 0;
        return 1 + max( maxDepth(root.left),maxDepth(root.right) );
    }
    
    private int max(int a,int b)
    {
        return a > b? a: b;
    }
}