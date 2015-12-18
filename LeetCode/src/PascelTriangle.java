import java.util.LinkedList;
import java.util.List;

public class PascelTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ll = new LinkedList<List<Integer>>();
        int i = 0;
        
//        if(numRows == 0)
//        	return null;
        
        while(i < numRows)
        {
        	
        	List<Integer> ll2 = new LinkedList<Integer>();
        	ll2.add(1);
        	if(i == 1)
        		ll2.add(1);
        	ll.add(ll2);
        	i++;
        }
        
        i = 2;
        
        if(numRows >= 3)
        while(i < numRows)
        {
        	int j = 1;
        	while(j <= i-1)
        	{
        		List<Integer> ll2 = ll.get(i);
        		ll2.add( ll.get(i-1).get(j) + ll.get(i-1).get(j-1) );
        		if( ++j == i)
        			ll2.add(1);
        	}
        	i++;
        }
        return ll;
    }
}