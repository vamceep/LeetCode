
public class LinkedListCycle2 {
	public ListNode detectCycle(ListNode head) {
        ListNode pt1, pt2;
        
        if(head == null)  return null;
        
        pt1 = head;
        pt2 = head;
        while( pt1 != null )
        {
            if( pt1.next == null )
                return null;
                
            pt1 = pt1.next.next;
            pt2 = pt2.next;
            
            if(pt2.equals(pt1))
            {
                pt1 = head;
                break;
            }
        }
        
        if(pt1 == null)
        	return null;
        
         while( !pt1.equals(pt2) )
        {
            pt1 = pt1.next;
            pt2 = pt2.next;
        }
        return pt1;
    }
}
