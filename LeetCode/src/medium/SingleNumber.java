package medium;

public class SingleNumber {
	public int singleNumber(int[] nums) {
        int i = nums.length;
        int a = 0;
        while(--i != -1)
        	a = a ^ nums[i];
        
        return a;
    }
}
