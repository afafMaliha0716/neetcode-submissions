class Solution {
    public int[] productExceptSelf(int[] nums) {
      // start from the end and calculate product at each step and start from teh end and calculate product at each step
      int[] left = new int [nums.length];
      int[] right = new int [nums.length];
      left[0] = nums[0];
      for (int i=1; i< nums.length; i++){
        left[i] = left[i-1]*nums[i];
      }
      right[nums.length-1] = nums[nums.length-1]; // set the last index
      for (int i=nums.length -2; i>0; i--){
        right[i] = nums[i]*right[i+1];
      }

      // now construct result
        int[] result = new int[nums.length];
        result[0] = right[1];
        for (int i =1; i<nums.length-1; i++){
            result[i] = left[i-1] * right[i+1];
        }
        result[nums.length-1] = left[nums.length-2];
     
      return result;   
    }
}  
