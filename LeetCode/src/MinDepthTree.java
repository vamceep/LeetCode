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
/*public class MinDepthTree {
    public int minDepth(TreeNode root) {
        
    	if(root == null)
    		return 0;
    		
    	if(root.left == null || root.right ==null )
    	    return root.left==null?
    	                1 + minDepth(root.right):
    	                1 + minDepth(root.left);
    		
    	int templ = 1 + minDepth(root.left);
    	int tempr = 1 + minDepth(root.right);
    	
    	return templ < tempr? templ:tempr;
    }
}*/

public class MinDepthTree {
    public int minDepth(TreeNode root) {
        
    	if(root == null)
    		return 0;
    		
    	if(root.left == null || root.right ==null )
    	    return 1 	;
    		
    	int templ = 1 + minDepth(root.left);
    	int tempr = 1 + minDepth(root.right);
    	
    	return templ < tempr? templ:tempr;
    }
}
