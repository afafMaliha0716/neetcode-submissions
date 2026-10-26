class Solution {
    public int rob(int[] nums) {
        // dynamic programming problem
        // keep score of the most optimal houses to rob
        // last decision to make is which house to rob last
        // smallest subproblems is is the current house is better to rob than its neighbor
        // what should i store the info as i collect it in?
        // an array?
        int[] maxAmnts = new int[nums.length];
        if(nums.length==1){
            return nums[0];
        } else if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        maxAmnts[0] = nums[0];
        maxAmnts[1] = Math.max(nums[0],nums[1]);
        for(int i = 2; i < nums.length; i++){
            // it would be adding the one at i-2, or dont pick this one add the one at i-1
            // choose this one
            int choose = nums[i] + maxAmnts[i-2];
            int notChoose = maxAmnts[i-1];
            maxAmnts[i] = Math.max(choose, notChoose);

        }
        return maxAmnts[nums.length-1];
    }
}
