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
public class SumRoottoLeafNumbers {
    long total = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;
            
        return sum(root, 0, 0);
    }
    
    private int sum(TreeNode root, int pow, long num)
    {
        long temp = num;
        if(num == 0)
            pow = 0;
            
        if(root.left == null && root.right == null)
           {
               num += root.val*Math.pow(10,pow);
               num += 1*Math.pow(10,pow+1);
               num = reverseNum(num);
               total += num;
           }
          
        else
        {
            if(root.left != null)
            {
                num += root.val*Math.pow(10,pow);
                sum(root.left, pow+1, num);
                num = temp;
            }
            
            if(root.right != null)
            {
                num += root.val*Math.pow(10,pow);
                sum(root.right, pow+1, num);
            }
            num = temp;
        }
        
        return (int)total;
    }
    
    private long reverseNum(long num)
    {
        long temp = 0;
        while(num > 0)
        {
            temp += num %10;
            temp *= 10;
            num /= 10;
        }
        temp /= 10;
        
        return temp/10;
    }
}


/*  best solution

public int sumNumbers(TreeNode root) {
    return sum(root, 0);
}

public int sum(TreeNode n, int s){
    if (n == null) return 0;
    if (n.right == null && n.left == null) return s*10 + n.val;
    return sum(n.left, s*10 + n.val) + sum(n.right, s*10 + n.val);
}
*/