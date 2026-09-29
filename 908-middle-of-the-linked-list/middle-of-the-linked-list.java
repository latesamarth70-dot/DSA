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
    public ListNode middleNode(ListNode head) {
        int n=0;
        ListNode p1=head;
        while(p1!=null){
            n++;
            p1=p1.next;
        }
        int i=n/2;
        for(int j=0;j<i;j++){
            head=head.next;
        }
        return head;
    }
}