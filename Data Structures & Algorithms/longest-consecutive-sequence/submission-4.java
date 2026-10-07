class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        // now loop through and keep a count of consecutive sequences
        int max = 1;
        int curCount = 1;
        if(nums.length == 0){
            max = 0;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i-1]+1){
                    curCount++;
                    max = (curCount > max) ? curCount : max;
                } else{
                    curCount = 1;
                }
            }
        }

        return max;
    }
}
