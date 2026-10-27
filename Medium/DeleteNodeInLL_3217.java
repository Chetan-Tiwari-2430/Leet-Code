import java.util.Set;
import java.util.HashSet;
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        ListNode curr = dummy;
        while(curr.next != null){
            if(set.contains(curr.next.val)){
                curr.next = curr.next.next;
                continue;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}