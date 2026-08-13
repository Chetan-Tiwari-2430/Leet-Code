class FindEvenNumberDigit_1295 {
    public int findNumbers(int[] nums) {
        int overAllCount = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            count = 0;
            for(int j = nums[i]; j >= 1; j = j / 10){
                int digit = j % 10;
                count++;
            }
            if (count % 2 == 0){
                overAllCount++;
            }
        }
        return overAllCount;
    }
}