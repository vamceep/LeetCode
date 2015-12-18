package medium;

public class RotateImage {
	public void rotate(int[][] matrix) {
        int srow = 0;
        int scol = 0;
        int erow = matrix.length - 1;
        int ecol = erow;
        
        while(erow > srow && ecol > scol)
        {
            int i = 0;
            while(srow + i < ecol)
            {
                matrix[srow][scol+i] = matrix[srow][scol+i] ^ matrix[srow+i][ecol] ^ matrix[erow][ecol-i] ^ matrix[erow-i][scol];
                matrix[srow+i][ecol] = matrix[srow][scol+i] ^ matrix[srow+i][ecol] ^ matrix[erow][ecol-i] ^ matrix[erow-i][scol];
                matrix[erow][ecol-i] = matrix[srow][scol+i] ^ matrix[srow+i][ecol] ^ matrix[erow][ecol-i] ^ matrix[erow-i][scol];
                matrix[erow-i][scol] = matrix[srow][scol+i] ^ matrix[srow+i][ecol] ^ matrix[erow][ecol-i] ^ matrix[erow-i][scol];
                matrix[srow][scol+i] = matrix[srow][scol+i] ^ matrix[srow+i][ecol] ^ matrix[erow][ecol-i] ^ matrix[erow-i][scol];
                i++;
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
    }
}
