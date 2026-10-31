import java.util.Map;
import java.util.HashMap;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int com = n / 3;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            }else{
                map.put(nums[i],1);
            }
        }
        List<Integer> al = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > com){
                al.add(entry.getKey());
            }
        }
        return al;
    }
}