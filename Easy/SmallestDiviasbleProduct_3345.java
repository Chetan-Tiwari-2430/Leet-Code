class SmallestDivisableProduct_3345{
    public int smallestNumber(int n, int t) {
        while (true){
            int num = n;
            int product = 1;
            
            for(int i = num; i >= 1; i = i / 10){
                int digit = i % 10;
                product *= digit;
            }
            if(product % t == 0){
                return n;
            }
            n++;
        }
    }
}