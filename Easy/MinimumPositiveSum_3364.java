import java.util.List;
import java.util.ArrayList;

class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int min = Integer.MAX_VALUE;

        for(int k = l; k <= r; k++){

            for(int i = 0; i <= nums.size()-k; i++){
                int sum = 0;

                List<Integer> al = nums.subList(i, i+k);

                for(int num : al){
                    sum += num;
                }

                if(sum < min && sum > 0){
                    min = sum;
                }
            }
        }

        if(min == Integer.MAX_VALUE){
            return -1;
        }

        return min;
    }
}