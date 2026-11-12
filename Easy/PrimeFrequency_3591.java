import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int i : prime){
            set.add(i);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(set.contains(entry.getValue()))
            {
                return true;
            }
        }
        return false;
    }
}