package medium;

public class MinimumathSum {
	public int minPathSum(int[][] grid) {
        
        int m = grid.length;
        int n = grid[m-1].length;
        
        for(int i = m-2; i >= 0; i--)
            grid[i][n-1] += grid[i+1][n-1];
            
        for(int i = n-2; i >=0; i--)
            grid[m-1][i] += grid[m-1][i+1];

        for(int i = m-2; i >=0; i--)
            for(int j = n-2; j >=0; j--)
                grid[i][j] += Math.min(grid[i+1][j], grid[i][j+1]);
                
         return grid[0][0];
    }
}
