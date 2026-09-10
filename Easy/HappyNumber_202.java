class HappyNumber_202 {
    public boolean isHappy(int n) {
        int result = n;
        while(true){
             if(result == 1){
                return true;
            }else if( result < 0){
                return false;
            }
            
            result = Solution.square(result);

        }

    }
    public static int square(int num){
        int sum = 0;
        if(num < 7){
            return -1;
        }
        for(int i = num; i >= 1; i = i / 10){
            int digit = i % 10;
            sum = sum + (digit * digit);
        }
        return sum;
    }
}