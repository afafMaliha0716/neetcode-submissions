class Solution {
    public int maxSubArray(int[] nums) {
        // need to loop through the array 
        // could be a two pointer question since we want to do it in O(n) time
        // lets think of what the right method would be
        // to clarify the ints can be positive or negative irght? and a subarray can eb the length of the whole array right?
        // right now im thinking you loop through the whole array and sum up that
        // then have pointers on either end and make them bigger or smaller based on the right versus left
        // Actually now that i talk about this problem seems like a typical dynamic programming problemw ith the smallest subproblem being wether or not to extend teh subarray
        // we could keep a running sum and see if adding a value would make it bigger or smaller
        // if smaller we dont add it and move to the other side
        // so go through each index and see if adding it would make it bigger or should we start a new subarray
        // this looks like kadanes algorithm
        int maxSub = nums[0];
        int curSum = 0;

        for(int i = 0; i < nums.length; i++){
            if(curSum<0){
                curSum = 0;
            }
            curSum += nums[i];
            maxSub = Math.max(curSum,maxSub);
        }

        return maxSub;
    }
}
