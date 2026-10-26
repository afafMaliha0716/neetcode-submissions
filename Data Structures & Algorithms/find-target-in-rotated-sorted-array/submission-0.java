class Solution {
    public int search(int[] nums, int target) {
        
        // find the pivot point
        int right = nums.length-1;
        int left = 0;
   
        int mid = (left + right) / 2;      // recomputed every pass


        // now do a bst to find target
        // if the element before is larger and the one after is also larger then this is the rotation point
        while(left<right){
            mid = (left + right) / 2;      // recomputed every pass
            if (nums[mid] > nums[right]) {
                left = mid + 1;                // the drop is to the right of mid
            } else {
                right = mid;                   // mid might be the smallest
            }
        }
        int pivot = left;   
        // now that we know what the pivot is we need to be aware of that idx
        // if the target is to the right then it would be less than or equal to the the last element
        // if target is to the left it would be greater than or equal to the first element of list
        if(nums[pivot]==target){
            return pivot;
        }
        if(target<= nums[nums.length -1]){
            // set right to end
            right = nums.length -1;
            left = pivot +1;
        } else if (target >= nums[0]){
            right = pivot -1;
            left = 0;
        }
        while(right>=left){
            mid = (right+left)/2;

            // check if mid is the pivot. if it is break out of this
            if(target<nums[mid]){
                right = mid -1;
            } else if(target>nums[mid]){
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
