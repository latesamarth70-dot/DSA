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
    public ListNode removeElements(ListNode head, int val) {
        ListNode p1=head;
        ListNode pre=null;
        while(p1!=null){
            if(p1.val==val){
                if(pre==null){
                    head=p1.next;
                }
                else{
                    pre.next=p1.next;
                }
            }else{
                pre=p1;
            }
            p1=p1.next;
        }
        return head;
    }
}