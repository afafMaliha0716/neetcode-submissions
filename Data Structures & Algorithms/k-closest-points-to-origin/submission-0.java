class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // largest distance on top: swap a and b in the compare
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> Integer.compare((b[0])*(b[0]) + (b[1])*(b[1]), (a[0])*(a[0]) + ( a[1])*( a[1])));

        for (int i=0; i<points.length; i++){
            
            // only add it to the heap under certain conditions
            heap.add(points[i]);
            if(heap.size()>k){

                // this should remove the largest off the top
                heap.poll();
            }
        }

        int[][] result = new int[k][];
        for (int i=0; i< k; i++){
            result[i] = heap.poll();
        }

        return result;

    }
}
