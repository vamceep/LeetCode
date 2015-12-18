package medium;

import java.util.LinkedList;
import java.util.List;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> li = new LinkedList<Integer>();
        int last = 1,pow = 1;
        if( n == 0)
        	return li;
        
        li.add(0);
        li.add(1);
        if( n == 1)
        	return li;
        int index = last+1;
        while(n != 1)
        {
        	pow = pow*2;
        	int i = last;
        	while(i >= 0)
        		li.add(index++, pow+li.get(i--));

        	last = index-1;
        	n--;
        }
        
        return li;
    }
}