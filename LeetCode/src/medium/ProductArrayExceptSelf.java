package medium;

public class ProductArrayExceptSelf {
	public int[] productExceptSelf(int[] nums)
	{
        
			int temp = nums[nums.length-1];
			int[] output = new int[nums.length];

			output[0] = 1;

			for( int i = 1; i < nums.length; i++)
				output[i] = output[i-1] * nums[i-1];

			for(int j = nums.length-2; j >= 0; j--)
			{
				output[j] *= temp;
				temp *= nums[j];
			}
            return output;
    }
}