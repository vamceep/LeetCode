/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
package medium;
public class LinkedListCycle {
    public boolean hasCycle(ListNode head){
        ListNode pt1, pt2;
        
        if(head == null)
            return false;
        
        pt1 = head;
        pt2 = head;
        while( pt1 != null )
        {
            if( pt1.next == null )
                return false;
                
            pt1 = pt1.next.next;
            pt2 = pt2.next;
            
            if(pt2.equals(pt1)) return true;
        }
        
 //       if(pt1 == null || pt2 == null) return false;
            
//        if(pt1.equals(pt2))
//        	{
//        		System.out.println(pt1.val+"   pt2 "+pt2.val+"  pt1.next "+pt1.next.val+" pt2.next "+pt2.next.val);
//        		return true;
//        	}
        
        return false;
    }
}