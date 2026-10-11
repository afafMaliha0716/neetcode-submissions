class KthLargest {

    private final int k;
    private final PriorityQueue<Integer> heap;


    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.heap = new PriorityQueue<>();
        for(int i = 0; i< nums.length; i++){
            if(heap.size() == k){
                if(heap.peek()<nums[i]){
                    heap.poll();
                    heap.add(nums[i]);
                }
            } else {
                heap.add(nums[i]);
            }
        }
    }
    
    public int add(int val) {
        // we need to keep the elements in the heap limited so when we pop we get the kth largest
        if(heap.size() == k){
            if(heap.peek()<val){
                heap.poll();
                heap.add(val);
            }
        } else {
            heap.add(val);
        }
        return heap.peek();
        
    }
}
