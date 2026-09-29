class Solution {
    public int maxProfit(int[] prices) {
        int profit = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
            }
            int temp = prices[i] - min;
            if(temp > profit){
                profit = temp;
            }
        }
        return profit;
    }
}