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
public class InorderTraversal {
    List<Integer> l;
    Stack<TreeNode> s;
    
    public List<Integer> inorderTraversal(TreeNode root) {
    	l = new LinkedList<Integer>();
    	s = new Stack<TreeNode>();
    	
    	while(root != null ) 
    	{
    		while(root.left != null)
    		{
    			s.push(root);
    			root  = root.left;
    		}
    		
    		l.add(root.val);
    		root = root.right;
    		while(root == null && !s.isEmpty())
    		{
    			root = s.pop();
    			l.add(root.val);
    			root = root.right;
    		}
    	}
    	return l;
    }
}