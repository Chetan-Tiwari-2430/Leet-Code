class ReverseDegreeString_3498 {
    public int reverseDegree(String s) {
        int[] nums = {26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int sum = 0;
        int j = 1;
        for(int i = 0; i < s.length(); i++){
            int temp =  s.charAt(i) - 97;
            sum += nums[temp] * j;
            j++;
        }
        return sum;
    }
}