class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = left+1;
        int maxprofit = 0;

        while(right < prices.length){
            if(prices[left] < prices[right]){
                int currentProfit = prices[right] - prices[left];
                maxprofit = Math.max(maxprofit,currentProfit);
            }else{
                left = right;
            }
            right++;
        }

        return maxprofit;
    }
}
