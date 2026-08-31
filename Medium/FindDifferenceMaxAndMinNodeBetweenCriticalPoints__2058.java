import java.util.ArrayList;
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
class FindDifferenceMaxAndMinNodeBetweenCriticalPoints__2058 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp = head.next;
        ListNode prev = head;
        ArrayList<Integer> al = new ArrayList<>(); 
        int i = 2;
        while(temp.next != null){
            if((prev.val < temp.val && temp.val > temp.next.val) || (prev.val > temp.val && temp.val < temp.next.val)){
                al.add(i);
            }
            i++;
            temp = temp.next;
            prev = prev.next;
        }
        int[] nums = {-1,-1};
        
        if(!(al.isEmpty()) && al.size() >= 2){
            nums[1] = al.get(al.size() - 1) - al.get(0);
            int min = Integer.MAX_VALUE;
            for(int j = 1; j < al.size(); j++){
                int num = al.get(j) - al.get(j-1);

                if(num < min){
                    min = num;
                }
            }
            nums[0] = min;
        }
        System.out.println(al);
        return nums;
    }
}