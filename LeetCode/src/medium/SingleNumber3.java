package medium;

public class SingleNumber3 {
	public int[] singleNumber(int[] nums) {
		
		if(nums == null || nums.length <= 1)
			return null;

        int xor = 0;
        for(int i : nums)
        	xor ^= i;
        
        xor = Integer.highestOneBit(xor);
        int[] ans = {0,0};
        
        for(int x : nums)
        	if( (xor & x) == 0)
        		ans[0] ^= x;
        	else
        		ans[1] ^= x;
        
        return ans;
      }
}
