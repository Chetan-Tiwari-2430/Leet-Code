class ConstructUniformParityArrayI_3875 {
    public boolean uniformArray(int[] nums1) {

        // In this Question if I do Not Do anything just
        // Just Return true
        // It is Acceptable on the Leet-code and it 
        // Will Submit without any test case if false;
        boolean isEven = false;
        boolean isOdd = false;
        if(nums1[0] % 2 == 0){
            isEven = true;
        }else{
            isOdd = true;
        }
        int[] nums2 = new int[nums1.length];
        int i = 0;
        for(int j = 0; j < nums1.length; j++){
            if(j != i){
                nums2[i] = nums1[i] - nums1[j];
                i++;
                continue;
            }
            nums2[i] = nums1[i] - nums1[j];
            i++;
        }


        boolean isUniform = true;
        for(int k = nums2.length-1; k > 0; k--){
            if(nums2[0] % 2 != nums2[k] % 2){
                isUniform = false;
                break;
            }
        }
        return isUniform;



    }
}