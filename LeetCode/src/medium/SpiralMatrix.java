package medium;

public class SpiralMatrix {
	public int[][] generateMatrix(int n) {
        int result[][] = new int[n][n];
    
        if(n == 0)
            return result;
            
        int srow = 0;
        int erow = n-1;
        int scol = 0;
        int ecol = n-1;
        int count = 1;
        
        while(srow < erow && scol < ecol)
        {
            for(int i = scol; i <= ecol; i++)
                result[srow][i] = count++;
            srow++;
                
            for(int i = srow; i <= erow; i++)
                result[i][ecol] = count++;
            ecol--;
            
            for(int i = ecol; i >= scol; i--)
                result[erow][i] = count++;
            erow--;
            
            for(int i = erow; i >= srow; i--)
                result[i][scol] = count++;
            scol++;
        }
        if(result[n/2][n/2] == 0 )
            result[n/2][n/2] = count;
            
        return result;
    }
}
