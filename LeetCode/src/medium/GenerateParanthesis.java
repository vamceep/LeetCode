package medium;

import java.util.LinkedList;
import java.util.List;

public class GenerateParanthesis {
	List<String> ll;
    public List<String> generateParenthesis(int n) {
        ll = new LinkedList<String>();
        char[] car = new char[2*n];
        generateParan(ll, n, n, car, 0);
        return ll;
    }
    
    private void generateParan(List<String> ll, int leftCount, int rightCount, char[] str, int count)
    {
        if(leftCount < 0 || rightCount < leftCount)
            return;
            
        if(leftCount == 0 && rightCount == 0)
            ll.add( String.copyValueOf(str) );
        else
        {
            if(leftCount > 0 )
            {
                str[count] = '(';
                generateParan(ll, leftCount-1, rightCount, str, count+1);
            }
            
            if(rightCount > 0)
            {
                str[count] = ')';
                generateParan(ll, leftCount, rightCount-1, str, count+1);
            }
        }
    }
}
