import java.util.Map;
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int temp = map.get(nums[i]);
                temp += 1;
                map.put(nums[i],temp);
            }else{
                map.put(nums[i],1);
            }
        }
        int major = -1;
        int element = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > element){
                element = entry.getValue();
                major = entry.getKey();
            }
        }
        return major;
    }
}