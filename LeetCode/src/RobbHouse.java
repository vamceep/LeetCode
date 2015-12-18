public class RobbHouse {
    public int rob(int[] nums) {
        return maxRob(nums,0,nums.length-1);
    }
    
    private int maxRob(int[] nums,int start, int end)
    {
        if(end < start)
            return 0;
            
        if(end == start)
            return nums[end];
        
        if(start+1 == end)
        	return nums[start]>nums[end]?nums[start]:nums[end];
            
        int largest = start;
        for(int i = start; i <= end; i++)
            if(nums[largest] <= nums[i]) largest = i;
        
        System.out.println(largest+"  start : "
            +start+"  end  :"+end);
        return nums[largest] + maxRob(nums, start , largest-2) + maxRob(nums,largest + 1,end);
    }
}