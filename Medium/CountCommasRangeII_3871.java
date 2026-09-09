class CountCommasRangeII_3871 {
    public long countCommas(long n) {
        long ans = 0;
        if(n >= 1_000l){
            ans += n - 999l;
        }
        if(n >= 1_000_000l){
            ans += n - 999_999l;
        }
        if(n >= 1_000_000_000l){
            ans += n - 999_999_999l;
        }
        if(n >= 1_000_000_000_000l){
            ans += n - 999_999_999_999l;
        }
        if(n >= 1_000_000_000_000_000l){
            ans += n - 999_999_999_999_999l;
        }

        
        return ans;
    }
}