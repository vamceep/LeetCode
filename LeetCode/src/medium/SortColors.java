package medium;

public class SortColors {
    public void sortColors(int[] nums) {
	       int last = nums.length -1;
	       int windex = -1;
	        
	        for(int i = 0; i <= last; i++)
	        {
	            while(last !=-1 && nums[last] == 2) last--;
	            
	            if(nums[i] == 2)
	            {
	                while(i < last && nums[i] == 2)
	                {
	                    nums = swap(nums,i,last);
	                    last--;
	                }
	                i--;
	            }
	            
	            else if( nums[i] == 0)
	            {
	                if(windex == -1);
	                else
	                {
	                    nums = swap(nums, windex, i);
	                    ++windex;
	                }
	                
	            }

	            else if(nums[i] == 1)
	            {
	                if(windex == -1) windex = i;
	            }
	        }
	        for(int x: nums)
	        	System.out.print(x+" ");
	    }
	    
	    private int[] swap(int[] nums, int a, int b)
	    {
	        nums[a] = nums[a] ^ nums[b];
	        nums[b] = nums[a] ^ nums[b];
	        nums[a] = nums[a] ^ nums[b];
	        
	        return nums;
	    }
}