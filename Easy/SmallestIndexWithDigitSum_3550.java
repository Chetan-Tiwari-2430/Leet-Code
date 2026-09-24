class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            int temp = nums[i];
            for(int j = temp; j >= 1; j = j / 10){
                int digit = j % 10;
                sum += digit;
            }
            if(sum == i){
                return i;
            }
        }
        return -1;
    }
}