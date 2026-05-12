/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        ListNode temp=new ListNode(-1);
        ListNode t=temp;
        for(ListNode node:lists)
        {
            if(node!=null) pq.add(node);
        }
        while(!pq.isEmpty())
        {
            ListNode s=pq.poll();
            t.next=s;
            t=t.next;
            if(s.next!=null)
            {
                pq.add(s.next);
            }
        }
        return temp.next;
    }
}
