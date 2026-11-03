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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode dummyTemp = dummy;
        int sum = 0;
        ListNode temp = head;
        while(temp != null){
            if(temp.val != 0){
                sum += temp.val;
            }else{
                dummyTemp.next = new ListNode(sum);
                sum = 0;
                dummyTemp = dummyTemp.next;
            }
            temp = temp.next;
        }
        return dummy.next.next;
    }
}