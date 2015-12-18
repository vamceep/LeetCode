import java.util.LinkedList;
import java.util.List;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ll = new LinkedList<Integer>();
        
        if(rowIndex < 0) return ll;
        
        ll.add(1);
        if(rowIndex  == 0)
            return ll;
        else if(rowIndex == 1)
        {
                ll.add(1);
                return ll;
        }
        ll.add(1);
        int i = 2;
        int  j = 0;
        List<Integer> llPriv  = new LinkedList<Integer>();
        while( i != rowIndex +1 )
        {
            j = 1;
            llPriv.clear();
            llPriv.addAll(ll);
            ll.clear();
            ll.add(0,1);
            while( j < i )
                 ll.add( j, llPriv.get(j) + llPriv.get(j++ - 1) );
               
            ll.add(1);
            i++;
         }
        return ll;
    }
}