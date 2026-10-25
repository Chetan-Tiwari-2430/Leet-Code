class Solution {
    public int[] transformArray(int[] nums) {
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        int[] temp = new int[nums.length];
        for(int i = temp.length - 1; i >= evenCount; i--){
            temp[i] = 1;
        }
        return temp;
    }
}