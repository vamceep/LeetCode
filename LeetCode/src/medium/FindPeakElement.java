package medium;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid;
        
        while(left < right)
        {
            mid = left+right;
            mid /= 2;
            if(nums[mid] < nums[mid+1])
            {
                left = mid+1;
            }
            else
                right = mid;
        }
        return right;
    }
}