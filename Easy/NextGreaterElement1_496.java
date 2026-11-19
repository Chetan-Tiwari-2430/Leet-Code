import java.util.Map;
import java.util.Stack;
import java.util.HashMap;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = nums2.length - 1; i >= 0; i--){

            while(!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }
            int key = nums2[i];
            if(stack.isEmpty()){
                nums2[i] = -1;
            }else{
                nums2[i] = stack.peek();
            }
            int value = nums2[i];
            stack.push(key);
            map.put(key,value);
        }

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}