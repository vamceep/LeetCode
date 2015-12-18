package medium;

public class UniquePaths {
	public int uniquePaths(int m, int n) {
        int[][] ans  = new int[m][n];
        
        for(int i = m-1; i >= 0; i--)
            ans[i][n-1] = 1;
            
        for(int i = n-1; i >=0; i--)
            ans[m-1][i] = 1;
            
        for(int i = m-2; i >=0; i--)
            for(int j = n-2; j >=0; j--)
                ans[i][j] = ans[i+1][j] + ans[i][j+1];
                
         return ans[0][0];   
    }
}
