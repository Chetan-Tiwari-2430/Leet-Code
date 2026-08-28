class MaxConsecutiveOnes_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        
        int max = 0;
        int count = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == 1){
                count++;
            }else{
                count = 0;
                i = j;
            }
            if(max < count){
                max = count;
            }
        }
        return max;
    }
}