package medium;

public class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
        ListNode temp = head, retHead,prev;
        
        if( head == null || head.next == null)
                return head;
                
        retHead = head.next;
        prev = null;
        while(head != null && head.next != null)
        {
           temp = head.next;
           head.next = temp.next;
           temp.next = head;
           prev = head;
           
           head = head.next;
           if(head != null && head.next != null)
                prev.next = head.next;
        }
        
        return retHead;
    }
}