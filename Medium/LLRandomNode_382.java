 import java.util.ArrayList;
import java.util.Random;
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
    ListNode head;
    ArrayList<Integer> al = new ArrayList<>();
    Random random = new Random();

    public Solution(ListNode head) {
        this.head = head;
        while(head != null){
            al.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
        int indx = random.nextInt(al.size());
        return al.get(indx);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */