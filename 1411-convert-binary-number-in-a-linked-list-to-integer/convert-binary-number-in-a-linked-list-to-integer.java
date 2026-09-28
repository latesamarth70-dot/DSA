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
    public int getDecimalValue(ListNode head) {
        int res=0;
        ListNode p1=head;
        while(p1!=null){
            res++;
            p1=p1.next;
        }
        p1=head;
        int sum=0;
        while(p1!=null){
            sum=sum+p1.val*(int)Math.pow(2,--res);
            p1=p1.next;
        }
        return sum;
    }
}