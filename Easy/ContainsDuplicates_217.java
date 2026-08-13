import java.util.HashSet;
import java.util.Set;
class ContainsDuplicates_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int i : nums){
            set.add(i);
        }
        int setSize = set.size();
        if(setSize == nums.length){
        return false;
        }else{
            return true ;
        }
    }
}