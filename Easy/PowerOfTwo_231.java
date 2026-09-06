class PowerOfTwo_231 {
    public boolean isPowerOfTwo(int n) {
        double div = n;
        while(div > 1.0){
            div = div / 2;
        }
        if(div == 1.0){
            return true;
        }else{
            return false;
        }
    }
}