class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //now we want to make sure this thing stays at a size k
        for(int i = 0; i < nums.length; i++){
            if (pq.size() == k){
                // peek at the front and if this one is larger poll taht and insert this one
                int c = pq.peek();
                if (nums[i] > c){
                    pq.poll();
                    pq.offer(nums[i]);
                }
            } else {
                pq.offer(nums[i]);
            }
        }

        return pq.poll();
    }
}
