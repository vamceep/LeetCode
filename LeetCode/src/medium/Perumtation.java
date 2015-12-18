package medium;

import java.util.LinkedList;
import java.util.List;

public class Perumtation {
    List<List<Integer>> priv;
    List<Integer> privli;
    
	public List<List<Integer>> permute(int[] nums){
		priv = new LinkedList<List<Integer>>();
        privli = new LinkedList<Integer>();
        return permute(nums, 0, nums.length-1);
    }

	private List<List<Integer>> permute(int[] nums, int start, int end) {
		
		List<List<Integer>> ll = new LinkedList<List<Integer>>();
		List<Integer>li = new LinkedList<Integer>();
        if(end + 1 == start )
        	return ll;
        
        if( start == end )
        {
        	li.add(nums[start]);
        	ll.add(li);
        	return ll;
        }
        else
        {
        	priv = permute(nums,start+1, end);
        	System.out.println(priv);
        	System.out.println("Hello hell");
//        	for(int i = 0; i < priv.size(); i++)
//        	{
//        		privli = priv.get(i);
//        		for(int j = 0; j <= privli.size(); j++)
//        		{
//        			li = new LinkedList<Integer>();
//        			privli.add(j, nums[start]);
//        			li.addAll(privli);
//        			ll.add(li);
//        			privli.remove(j);
//           		}
//        	}
        	
        	for(int i = 0; i <= privli.size(); i++)
        	{
        		for(int j = 0; j < priv.size(); j++)
        		{
        			li = new LinkedList<Integer>();
        			privli = priv.get(j);
        			li.addAll(privli);
        		    li.add(i, nums[start]);
        			ll.add(li);
           		}
        	}
        	
        	priv.clear();
        	return ll;
        }
	}
}