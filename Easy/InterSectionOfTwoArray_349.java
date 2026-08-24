import java.util.Set;
import java.util.HashSet;

class InterSectionOfTwoArray_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] nums;
        if(nums1.length > nums2.length){
            nums = new int[nums1.length];
        }else{
            nums = new int[nums2.length];
        }
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
        int[] result = set.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}