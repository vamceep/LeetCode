public class RightShiftAry {
	 public void rotate(int[] nums, int k) {
	       while( k!=0 )
	       {
	    	  nums = xorAry(nums);
	    	   k--;
	       }
	       
	    }

	private int[] xorAry(int[] nums) {
	    
		for(int i = 0;i < nums.length; i++)
	    	 nums[i] = xor(nums);
		
		nums[0] = xor(nums);
		return nums;
	}
	private int xor(int[] nums) {
		
		int result = 0;
		for(int i = 0; i < nums.length; i++ )
			result ^= nums[i];
		return result;
	}
}