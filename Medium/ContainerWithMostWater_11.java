class  ContainerWithMostWater_11{
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int i = 0; 
        int j = height.length - 1;
        while(i <= j){
            if(height[i] < height[j]){
                int temp = height[i] * (j - i);
                if(temp > max){
                    max = temp;
                }
                i++;
            }else{
                int temp = height[j] * (j-i);
                if(temp > max){
                    max = temp;
                }
                j--;
            }
        }
        return max;
    }
}