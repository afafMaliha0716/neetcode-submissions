class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int lowestPrice = prices[0];
        for(int i = 0; i<prices.length; i++){
            int curPrice = prices[i];
            int curProf = curPrice - lowestPrice;
            if(curProf > maxP){
                maxP = curProf;
            }
            if (curPrice < lowestPrice){
                lowestPrice = curPrice;
            }
            
        }
        return maxP;
    }
}
