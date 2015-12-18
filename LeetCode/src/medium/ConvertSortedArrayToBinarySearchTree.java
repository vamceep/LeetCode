package medium;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
            return sab(nums, 0, nums.length - 1);
    }
    
    private TreeNode sab(int[] nums, int start, int end)
    {
        TreeNode a;
        if( start < 0 || end >= nums.length || nums.length == 0 )
            return null;
        
        if(start + 1 == end) 
            {
                a = new TreeNode(nums[start]);
                a.right = new TreeNode(nums[end]);
                return a;
            }
            
        if(start == end)
           return new TreeNode(nums[start]);
        
        int mid = (start + end ) / 2;
        a = new TreeNode(nums[mid]);
        
        a.left = sab(nums, start, mid - 1);
        a.right = sab(nums, mid + 1, end);
        return a;
    }
}