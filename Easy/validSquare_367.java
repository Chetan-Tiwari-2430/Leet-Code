class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        int st = 1; 
        int end = num / 2;
        while(st <= end){
            int mid = st + (end - st) / 2;
            long squ = (long) mid * mid;
            if(squ == num){
                return true;
            }else if(squ > num){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        } 
        return false;
    }
}