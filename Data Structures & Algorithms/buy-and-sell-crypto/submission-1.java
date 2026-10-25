class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int lowestP = prices[0];
        for( int i = 0; i< prices.length; i++){
            int curP = prices[i];

            lowestP = curP < lowestP? curP: lowestP;
            maxP = (curP-lowestP) > maxP? (curP-lowestP): maxP;
        }

        return maxP;
    }
}
