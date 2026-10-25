  class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int first = nums1.length - 1;
        int last = nums2.length - 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(first < 0){
                nums[i] = nums2[last];
                last--;
            }else if(last < 0){
                nums[i] = nums1[first];
                first--;
            }else if(nums1[first] > nums2[last]){
                nums[i] = nums1[first];
                first--;
            }else {
                nums[i] = nums2[last];
                last--;
            }
        }
        if(nums.length % 2 != 0){
            int n = nums.length / 2;
            return (double) nums[n];
        }
            int n1 = nums.length /2;
            int n2 = (nums.length/2)+1;

            int middle1 = nums[n1-1];
            int middle2 = nums[n2-1];
            int sum = middle1 + middle2;
            double median = (double) sum / 2;
            return median;
        
    }
}