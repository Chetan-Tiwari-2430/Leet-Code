class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int suffix = 0;
        for(int i = 0; i < nums.length; i++){
            int prefix = sum - suffix - nums[i];
            if(prefix == suffix){
                return i;
            }
            suffix += nums[i];
        }
        return -1;
    }
}