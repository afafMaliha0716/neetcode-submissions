class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        // start by picking one element
        for (int i = 0; i < nums.length - 1; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (nums[left] + nums[right] < -nums[i]) {
                    // too small: move left to the right
                    left++;
                } else if (nums[left] + nums[right] > -nums[i]) {
                    // too big: move right to the left
                    right--;
                } else {
                    // found a triplet
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    if (!result.contains(triplet)) {
                        result.add(triplet);
                    }
                    left++;
                }
            }
        }

        return result;
    }
}