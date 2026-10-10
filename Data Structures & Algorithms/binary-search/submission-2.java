class Solution {
    public int search(int[] nums, int target) {
      int left = 0;
      int right = nums.length-1;
      int cur = 0;
      int mid = 0;
      while(left<=right){
        mid = (left + right)/2;
        cur = nums[mid];

        // if target is less then mid move the right pointer to the left
        if( target < cur){
            right = mid - 1;
        } else if (target > cur){
            left = mid + 1;
        } else if (target == cur){
            return mid;
        }
      } 

      return -1;
    }
}
