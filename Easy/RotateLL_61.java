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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        k = k % count;
        
        int i = 1;
        while(i <= k){
           head =  rotate(head);
           i++;
        }
        return head;
    }
    public ListNode rotate(ListNode head){
        ListNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;  
        }
        ListNode dummy = temp.next;
        temp.next = null;
        dummy.next = head;
        return dummy;
    }
}