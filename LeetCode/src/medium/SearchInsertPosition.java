package medium;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return binSearch(nums,0,nums.length-1, target);
    }
    
    private int binSearch(int[] nums, int start, int end, int target)
    {
        int mid;
        while( start <= end )
        {
             mid = (start + end)/2;
             if(nums[mid] == target)
                return mid;
             
             if(nums[mid] < target) start = mid + 1;
             else end = mid - 1;
        }
        return end+1;
    }
}