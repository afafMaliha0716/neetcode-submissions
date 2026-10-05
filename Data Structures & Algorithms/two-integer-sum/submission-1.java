class Solution {
    public int[] twoSum(int[] nums, int target) {
        // could use hashing again
        // put all the values in a hashmap
        // when you get a numbers see what target-that num exists because then that would be the answer
        int [] output = new int [2];
        Map<Integer, Integer> seen = new HashMap<>();
        for( int i = 0; i<nums.length; i++){
            int val = target - nums[i];
            if(seen.containsKey(val)){
               output[0] = seen.get(val);
               output[1] = i;
                return output;
            }
            seen.put(nums[i],i);

        }
        return new int[]{};
    }
}