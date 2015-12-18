public class Stairs {
    int[] nums;
    public int climbStairs(int n)
    {
        nums = new int[n];
        nums[0] = 1;
        nums[1] = 2;
        
        return totalWays(n);
    }
    
    private int totalWays(int n)
    {
        if(nums[n-1] != 0)
            return nums[n-1];
            
        nums[n-1] = (totalWays(n-2) + totalWays(n-1));
        return nums[n-1];
    }
}