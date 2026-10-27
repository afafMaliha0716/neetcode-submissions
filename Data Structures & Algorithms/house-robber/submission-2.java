class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        } 
        int optN = nums[0];
        int optNotN = 0;
        for(int i = 1; i < nums.length; i++){
            int choose = optNotN + nums[i];
            int notChoose = optN;
            // now update opt
            optNotN = optN;
            optN = Math.max(choose, notChoose);
        }
        return optN;
    }
}
