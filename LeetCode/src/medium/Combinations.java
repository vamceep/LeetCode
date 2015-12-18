package medium;

import java.util.LinkedList;
import java.util.List;

public class Combinations {
	List<List<Integer>> ll;
    LinkedList<Integer> li;
    
   public List<List<Integer>> combine(int n, int k) {
       
       ll = new LinkedList<List<Integer>>();
       li = new LinkedList<Integer>();

       if(k == 0 || n == 0)
       {
           ll.add(li);
           return ll;
       }
       if(k > n)
           return ll;
           
       return combinations(1, k, n);
   }
   
   private List<List<Integer>> combinations(int start, int k, int n)
   {
       if(k == 0)
       {
           ll.add(li);
           li = new LinkedList<Integer>();
           li.addAll(((LinkedList<List<Integer>>) ll).getLast());
       }
       else
       {
           for(int i = start; i <= n-k+1; i++)
           {
               li.add(i);
               combinations(i+1, k-1, n);
               li.removeLast();
           }
       }
       return ll;
   }
}
