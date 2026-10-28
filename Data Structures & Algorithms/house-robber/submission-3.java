class Solution {
    public int rob(int[] nums) {
        /* the way to do this is to go through the houses and store the optimal
        solution so far if you pick the last one (which means you cnat pick this one)
        or if you pick the previos one
        */
        if(nums.length==1){
            return nums[0];
        }
        int maxOne = nums[0];
        int maxTwo = 0;

        for(int i=1; i<nums.length; i++){
            // now compare this one with the last
            int dummy = maxOne;
            if(maxOne<maxTwo+nums[i]){
                maxOne = nums[i]+maxTwo;
            } 
            maxTwo = dummy;
        }
        return maxOne;
    }
}
