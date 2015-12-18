public class trailingZeroes {
    public int trailingZeroe(int n) {
        int totalCount = 0;
        int mult = 5;
        
        while(mult < n)
        {
            mult *= 5;
            totalCount++;
        }
        
        totalCount = totalCount*(totalCount+1)/2;
        if( n == mult)
            return totalCount + (2 * n/10);
            
        totalCount += 2*(n/10);
        int rem = n - mult + 5;
        totalCount += 2*(rem/10);
        if(rem % 10 >= 5)
            totalCount++;
            
        return totalCount;
    }
}