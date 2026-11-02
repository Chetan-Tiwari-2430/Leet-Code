/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.Set;
import java.util.HashSet;
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // if(head == null || head.next == null){
        //     return null;
        // }
        ListNode temp = head;
        Set<ListNode> set = new HashSet<>();
        while(temp != null){
            if(set.contains(temp)){
                return temp;
            }else{
                set.add(temp);
            }
            temp = temp.next;
        }
        return null;
    }
}