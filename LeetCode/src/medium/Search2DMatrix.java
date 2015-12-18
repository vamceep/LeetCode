package medium;

public class Search2DMatrix {
	
	public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0 || matrix[0].length == 0)
            return false;
        System.out.println(matrix.length);
            
        int row = binColSearch(matrix, target, 0, matrix.length-1);
        
        if(row == -1 || row == matrix.length)
            return false;
            
        return binRowSearch(matrix, target, row, 0, matrix[row].length-1);
    }
    
    private int binColSearch(int[][] matrix, int target, int start, int end)
    {
        while(start <= end)
        {
            int mid  = start+ end;
            mid /= 2;
        
            if(matrix[mid][0] > target)
                end  = mid-1;
            else if(matrix[mid][0] < target)
            {
                if(matrix[mid][matrix[mid].length-1] >= target)
                    return mid;
                else
                    start = mid+1;
            }
            else return mid;
        }
        return -1;
    }
    
    private boolean binRowSearch(int[][] matrix, int target, int row, int start, int end)
    {
        while(start <= end)
        {
            int mid  = start+end;
            mid /= 2;
            
            if(matrix[row][mid] == target)
                return true;
            else if(matrix[row][mid] < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return false;
}

}