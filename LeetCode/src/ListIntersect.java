/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class ListIntersect {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return headA == null? headA: headB;
        
        ListNode a,b;
        a = headA;
        b = headB;
        int alength = 0,blength = 0;
        
        while(a != null)
        {
            a = a.next;
            alength++;
        }
        
        while(b != null)
        {
            b = b.next;
            blength++;
        }
        
        if(blength > alength)
        while(blength != alength)
        {
            headB = headB.next;
            blength--;
        }
        else if(blength < alength)
        while(blength != alength)
        {
            headA = headA.next;
            alength--;
        }
            
        while(headB != null && !headA.equals(headB))
        {
            headB = headB.next;
            headA = headA.next;
        }
            return headB;
    }
}