class ConstructUniformParityArrayII_3876 {
    public boolean uniformArray(int[] nums1) {
        boolean result = ConstructUniformParityArrayII_3876.check(nums1);
        if(result) { return true;}
        int j = 0;
        int[] nums2 = new int[nums1.length];
        int minOdd = Integer.MAX_VALUE;
        for(int i = 0; i < nums1.length; i++){
            if(minOdd > nums1[i] && nums1[i] % 2 != 0){
                minOdd = nums1[i];
            }
        }

        for(int i = 0; i < nums2.length; i++){
            if(nums1[i] % 2 == 0){
                int diff = nums1[i] - minOdd;
                if(diff >= 1){
                    nums2[j] = nums1[i];
                    j++;
                }else{
                    return false;
                }
            }
        }

        result = ConstructUniformParityArrayII_3876.check(nums2);
        return result;
    }
    public static boolean check(int[] nums){
        for(int i = 1; i < nums.length; i++){
            if(nums[0] % 2 != nums[i] % 2){
                return false;
            }
        }
        return true;
    }
}