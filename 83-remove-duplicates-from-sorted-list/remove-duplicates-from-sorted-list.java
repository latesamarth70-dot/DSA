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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode p1=head.next;
        ListNode pre=head;
        while(p1!=null){
            if(pre.val==p1.val){
                pre.next=p1.next;
                p1=pre.next;
            }
            else{
                pre=p1;
                p1=p1.next;
            }
        }
        return head;
    }
}