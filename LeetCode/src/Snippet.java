public class Snippet {
	public int myAtoi(String str) {
	        
			if(str.matches("[ ]*\\d+"))
			{
				str.replaceFirst("[]*\\d+", "vamsi");
				String a[] = str.split("vamsi");
				int i = 1;
				
			a = str.split("vamsi");
			return Integer.parseInt(a[0]);
			}
			return 0;
	    }
}

