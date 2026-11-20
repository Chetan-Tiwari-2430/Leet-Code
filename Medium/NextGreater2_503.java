import java.util.Stack;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length * 2;
        int len = nums.length;
        int[] result = new int[len];
        for(int i = n-1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= nums[i%len]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i%len] = -1;
            }else{
                result[i%len] = stack.peek();
            }
            stack.push(nums[i%len]);
        }
        return result;
    }
}