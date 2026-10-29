class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // this is a sliding window problem which i cna tell because of the finding teh length of a subarray
        // i would say you are going to start from the smallest window and grow until itsatisfies the target
        // once you satisfy the target see if removing from the left still satisfies target
        // if not add to the right and try removing from the left again
        // update minimum length to min every time your window satisfies the target
        // stop when right is at the end of the list

        int min = Integer.MAX_VALUE;
        int right = 0;
        int curWindow = 1;
        int curSum = 0;
        while(right<nums.length){
            curSum += nums[right];
            int left = right - curWindow + 1;
            
            
            while(curSum>=target){
                min = Math.min(curWindow, min);
                // try reducing the window size by shrinking from the left
                curSum -= nums[left];
                left++;
                curWindow--;
            }
            
            right++;
            curWindow = right-left+1;

            
        }

        if(min==Integer.MAX_VALUE){
            return 0;
        } 
        return min;
    }
}