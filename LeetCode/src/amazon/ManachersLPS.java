package amazon;

public class ManachersLPS{

	public String lps(String s)
	{
		String t = preprocess(s);
		int c = 0;
		int r = 0;
		int[] p = new int[t.length()];
		
		for(int i = 1; i < t.length() - 1; i++)
		{
			int i_mirror = 2*c - i;
			if(r > i)
				p[i] = Math.min(r-i, p[i_mirror]);
			
			while( t.charAt(i+1+ p[i])  == t.charAt(i-p[i]-1) )
				p[i]++;

			if(i + p[i] > r)
			{
				c = i;
				r = i + p[i];
			}
		}
		r = 0;
		c = 0;
		for (int i = 1; i < t.length()-1; i++)
		    if (p[i] > r)
		    {
		      r = p[i];
		      c = i;
		    }
		String x ="";
		System.out.println(c+"  "+r);
		for(int z = c-r; z <= c+r ;z++)
			if(t.charAt(z) != '#')
				x += t.charAt(z);
		
		return x;
	}

	private String preprocess(String s) {
		if(s == null)
			return "^$";
		String ret = "^";
		for(int i = 0; i < s.length(); i++)
			ret += "#"+s.charAt(i);
		ret += "#$";
		System.out.println(ret);
		return ret;
	}
} 