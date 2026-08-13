class FirstAndLastOccurrence_34 {
    public int[] searchRange(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;
        int first = -1;
        int last = -1;
        while(st <= end){
            int mid = (st + end) / 2;
            if(nums[mid] < target){
                st = mid + 1;
            }else if(nums[mid] == target){
                first = mid;
                int low = first;
                try{
                    low =first - 1;
                    if(target == nums[low]){
                        first = low;
                    }
                }catch(Exception e){

                }
                end = mid - 1;
            }else{
                end = mid - 1;
            }
        }

        st = 0;
        end = nums.length - 1;
        while(st <= end){
            int mid = (st + end) / 2;
            if(nums[mid] < target){
                st = mid + 1;
            }else if(nums[mid] == target){
                last = mid;
                int high = last;
                try{
                    high = last + 1;
                    if(nums[high] == target){
                        last++;
                    }
                }catch(Exception e){}
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return new int[] {first,last};
    }
}