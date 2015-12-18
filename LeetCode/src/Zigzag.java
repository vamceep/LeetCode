public class Zigzag
{
    public String convert(String s, int numRows)
    {
    	boolean doUp = false;
        int start = 1;
        int count = 0;
        int DownskipCount = 2*numRows - 3;
        int UpSkipCount = 1;
 
        if(s.length() <= numRows  || numRows == 1)
    		return s;
        
        StringBuffer sb = new StringBuffer();
  
        while(count < s.length())
        {
        	sb.append(s.charAt(count));
        	count += DownskipCount+1;
        }
        
        DownskipCount -= 2;
        
        if(numRows != 2)
        while(numRows -1 != start)
        {
        	count = start;
        	while(count < s.length() )
        	{
        		sb.append(s.charAt(count));
        		if(doUp)
        		{
        			count += UpSkipCount+1;
        			doUp = false;
        		}
        		else
        		{
        			doUp = true;
        			count += DownskipCount+1;
        		}
        	}
        	doUp = false;
        	start++;
        	DownskipCount -= 2;
        	UpSkipCount += 2;
        }

        while(start < s.length())
        {
        	sb.append(s.charAt(start));
        	start += UpSkipCount+1;
        }
        return sb.toString();
    }
}