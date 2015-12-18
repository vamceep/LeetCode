package medium;

public class KthSmallestElementInBST {
	 public int kthSmallest(TreeNode root, int k) {
	        WithCount wroot = createWithCount(root);
	        return kelement(wroot, k);
	    }
	    
	    private WithCount createWithCount(TreeNode root) {
	        int rightCount = 0;
	        int leftCount = 0;
	        if(root == null)
	            return null;
	        WithCount wroot = new WithCount(root.val);
	        wroot.left = createWithCount(root.left);
	        wroot.right = createWithCount(root.right);
	      
	        if(wroot.left != null)
	            leftCount = wroot.left.count;
	            
	        if(wroot.right != null)
	            rightCount = wroot.right.count;
	        
	        wroot.count = rightCount+ leftCount +1;
	        return wroot;
	    }
	    
	    private int kelement(WithCount wroot, int k) {
	        if( k== 0)  return new Integer(null);
	        int leftCount = 0;
	        if(wroot.left != null)
	            leftCount = wroot.left.count;
	            
	        if(k-1 < leftCount )
	            return kelement(wroot.left, k);
	        else if(k-1 > leftCount)
	            return kelement(wroot.right, k - leftCount-1);
	        else
	            return wroot.val;   
	    }
	}

	class WithCount {
			WithCount left;
			WithCount right;
	        int count;
	        int val;
	        public WithCount(int val) {
	        	left = null;
	        	right = null;
	        	this.val = val;
	            count = 1;
	        }
	}