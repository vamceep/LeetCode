package medium;

public class RemoveDuplicatesfromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2)
            return nums.length;
            
        int i = 0;
        for(int x: nums)
            if(i < 2 || x != nums[i-2])
                nums[i++] = x;
                
        return i;
    }
}
