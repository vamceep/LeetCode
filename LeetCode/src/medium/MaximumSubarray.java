package medium;

public class MaximumSubarray {
    public int maxSubArray(int[] nums)
    {
        int currentMax = nums[0];
        int finalMax = currentMax;
      
        for (int i = 1; i < nums.length; i++)
        {
             currentMax = Math.max(nums[i] + currentMax, nums[i]);
             finalMax = Math.max(currentMax, finalMax);
        }
        return finalMax;
    }
}