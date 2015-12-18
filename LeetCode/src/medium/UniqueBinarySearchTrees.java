package medium;

public class UniqueBinarySearchTrees {
int[] ans;
    
    public int numTrees(int n) {
        
        if(n < 3)
            return n;
        if(n == 3)
            return 5;
            
        ans = new int[n+1];
        ans[0] = 1;
        ans[1] = 1;
        ans[2] = 2;
        ans[3] = 5;
        
        calcWays(n);
        return ans[n];
    }
    
    private int calcWays(int n){
        if( ans[n]  != 0 )
            return ans[n];
        
        if(n == 0)
        	return 0;
        
        int count = 0;
        for(int i = 1; i <= n; i++)
        {
            count += calcWays(i-1) * calcWays(n - i );
        }
        ans[n] = count;
        return ans[n];
    }
}
