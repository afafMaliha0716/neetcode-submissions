class Solution {
    public int findMin(int[] nums) {
        // some kind of binary search
        // find the point of rotation.
        // compare it to the end of the array
        // check if mid is teh rotation point
        // if not then check
        // if this element is greater than end of the array
        // if it is then the rotation point is within this window and move left pointer
        // if its not the rotation point is on the left so move right pointer.
        // once you have rotation point, check if element is less than that and greater than the last element, so you do a binaryserahc in teh array to the left of rotation point.
        // if its less than the last element then check between rotation point and teh current element


        int left = 0;
        int right = nums.length - 1;
        int rotIdx = 0;
        int min = 0;
        while(left < right){
            int mid = left + (right - left) / 2;
            // need to check if mid is at the end, is that a weird edge case to check
            if(nums[mid]<nums[right]){
                // move right
                right = mid;
            } else if (nums[mid] >nums[right]){
                left = mid +1;
            }
        }
        return nums[right];
            
    }
}
