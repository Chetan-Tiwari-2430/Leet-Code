class CheckDivisibility_3622 {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int product = 1;
        for(int i = temp; i >= 1; i = i / 10){
            int digit = i % 10;
            sum += digit;
            product *= digit;
        }
        return n % (sum + product) == 0;
    }
}