package medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Preorder {
    List<Integer> l;
    Stack<TreeNode> s;
    
    public List<Integer> preorderTraversal(TreeNode root) {
    	l = new LinkedList<Integer>();
    	s = new Stack<TreeNode>();
    	
    	while(root != null ) 
    	{
    		while(root != null)
    		{
    			l.add(root.val);
    			s.push(root);
    			root  = root.left;
    		}

    		while(root == null && !s.isEmpty())
    		{
    			root = s.pop().right;
    		}
    	}
    	return l;
    }
}