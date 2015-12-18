package medium;

public class MissingNumber{
    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        
        while( n != 0)
            xor ^= n--;
        
        while(n != nums.length)
            xor ^= nums[n++];
            
        return xor;
    }
}