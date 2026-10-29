class Solution {
    public int findMin(int[] nums) {
        // this is going to be done using binary search
        // remember that the value we are looking for is what left and right converge
        // if the last value of the array is less than teh current, move to the left to the mid
        // if it is greater than current, then pivot is earlier.
        // we found the pivot once we converge left and right
        int left = 0;
        int right = nums.length-1;

        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]>nums[right]){
                left = mid + 1;
            } else if(nums[mid]<nums[right]){
                right = mid;
            }
        }
        return nums[left];
    }
}
