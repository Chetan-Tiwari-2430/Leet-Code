class RemovingMinAndMaxFromArray_2091 {
    public int minimumDeletions(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int minIndex = 0;
        int maxIndex = 0;

        for(int i = 0; i < nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
                minIndex = i;
            }else if(max < nums[i]){
                max = nums[i];
                maxIndex = i;
            }
        }

        // Find From the Front
        int front;

        if(maxIndex > minIndex){
            front = maxIndex + 1;
        }else{
            front = minIndex + 1;
        }
        
        // Finding from the back
        int back;

        if(minIndex < maxIndex){
            back = nums.length - minIndex;
        }else{
            back = nums.length - maxIndex;
        }

        // Finding from the Middle
        
        int first;
        int last;
        if(maxIndex > minIndex){
            first = minIndex + 1;
            last = nums.length - maxIndex;
        } else{
            first = maxIndex + 1;
            last = nums.length - minIndex;
        }
        int middle = first + last;

        // Comapare This numbers and find the Smallest One
        if(front <= middle && front <= back){
            return front;
        }else if(back <= middle && back <= front){
            return back;
        }else{
            return middle;
        }
    }
}