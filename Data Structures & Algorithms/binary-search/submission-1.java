class Solution {
    public int search(int[] nums, int target) {
        // start from the middle of the list
        int right = (nums.length) - 1;
        int left = 0;
        int cur = -1;
        int mid = 0;
        boolean targetFound = false;
        while (left <= right){
            mid = (left + right)/2;
            cur = nums[mid];
            if(target == cur){
                return mid;                
            } else if(target< cur){
                // go left
                right = mid-1;
            } else if( target> cur){
                // go right
                // which means you add mid/2 to mid
                left = mid+1;
            } 

        }
        return -1;

    }
}
