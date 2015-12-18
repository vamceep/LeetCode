public class ReverceBits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
       int pow = 1;
       int a = 1 << 31;
       int result = 0;
       int temp;
       
       while( a != 0)
       {
    	   temp = a & n;
    	   if( temp != 0)
    		   result += pow;
    	   
    	   pow  = pow * 2;
    	   a = a >>> 1;
       }
       return result;
    }
}