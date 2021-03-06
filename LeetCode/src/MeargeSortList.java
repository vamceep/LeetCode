/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MeargeSortList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1 == null || l2 == null)
            return l2 == null?l1:l2;
        
        ListNode head,tempHead;
   
        if(l1.val < l2.val)
        {
             head = l1;
             l1 = l1.next;
        }
        else
        {
            head = l2;
            l2 = l2.next;
        }
        tempHead = head;
        if(l1 == null || l2 == null){
            if(l1 == null)
            {
                tempHead.next = l2;
                return head;
            }
            else
            {
                tempHead.next = l1;
                return head;
            }
        }

        while(l1.next != null && l2.next != null )
        {
            if(l1.val < l2.val)
            {
                 tempHead.next = l1;
                 l1 = l1.next;
            }
            else
            {
                tempHead = l2;
                l2 = l2.next;
            }
            tempHead = tempHead.next;
        }
        
        if(l1.next == null)
            tempHead.next = l2;
        else
            tempHead.next = l1;
        
        return head;
        
    }
}
