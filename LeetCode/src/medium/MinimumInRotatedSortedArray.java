package medium;

public class MinimumInRotatedSortedArray {
	 public int findMin(int[] nums) {
	        return fmin(nums, 0, nums.length-1);
	    }
	    
	    private int fmin(int[] nums, int start, int end)
	    {
	        if(start < 0 || end >= nums.length || start > end) return -9;
	            
	        int mid;
	        while(start <= end)
	        {
	            if(nums[start] < nums[end])  return nums[start];
	            
	            if(start == end)  return nums[start];
	            
	            if(start +  1 == end )  return Math.min(nums[start], nums[end] );
	            
	            mid = (start + end) / 2;
	            
	            if(nums[mid] < nums[start]) end = mid;  
	            else start = mid+1;
	                
	        }
	        return -2;
	    }
}
