import java.util.List;
import java.util.ArrayList;

class FindMissingElements_3731 {
    public List<Integer> findMissingElements(int[] nums) {
        int sml = nums[0];
        int lar = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(sml > nums[i]){
                sml = nums[i];
            }else if(lar < nums[i]){
                lar = nums[i];
            }
        }
        List<Integer> al1 = new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            al1.add(nums[i]);
        }

        for(int i = sml; i < lar; i++){
            if(!al1.contains(i)){
                al2.add(i);
            }
        }
        return al2;
    }
}