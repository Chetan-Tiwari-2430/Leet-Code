class SmallestMissingMultipleOfK_3718 {
    public int missingMultiple(int[] nums, int k) {
        int i = 1;
        while(i <= nums.length + k){
            int mul = k * i;
            if(!isAvailable(nums,mul)){
                return mul;
            }
            i++;
        }
        return k;
    }
    public boolean isAvailable(int[] nums,int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
}