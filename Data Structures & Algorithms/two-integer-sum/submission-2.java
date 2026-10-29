class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> numSet = new HashMap<>();
        // loop through and add each num to the map as the key and teh value is teh index. if the set contains taregt-num, then return the current index and teh index of that value
        int [] result = new int[2];
        for(int i = 0; i<nums.length; i++){
            int complement = target - nums[i];
            if(numSet.containsKey(complement)){
                result[0] = numSet.get(complement);
                result[1] = i;
                break;
            } else {
                numSet.put(nums[i],i);
            }
        }
        return result;
    }
}
