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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode evenHead = head.next;
        ListNode even = head.next;
        while(even != null && even.next != null){
            ListNode oddTemp = odd.next.next;
            ListNode evenTemp = even.next.next;

            odd.next = oddTemp;
            even.next = evenTemp;
            odd = odd.next;
            even = even.next;
        }
        if(odd.next != null && odd.next.next != null){
            odd.next = odd.next.next;
        }
        odd.next = evenHead;
        return head;
    }
}