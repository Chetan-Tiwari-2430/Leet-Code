class CountCommasInRange_3870 {
    public int countCommas(int n) {
      if(n < 999){
        return 0;
      } else{
        return n - 999;
      }
    }
}