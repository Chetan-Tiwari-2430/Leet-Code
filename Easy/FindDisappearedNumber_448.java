class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> al = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int i = 1; i < nums.length+1; i++){
            if(!set.contains(i)){
                al.add(i);
            }
        }
        return al;
    }
}