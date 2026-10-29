class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            long distanceA = (long) a[0] * a[0] + (long) a[1] * a[1];
            long distanceB = (long) b[0] * b[0] + (long) b[1] * b[1];

            return Long.compare(distanceA, distanceB);
        });
        for(int i = 0; i < points.length; i++){
            // calculate distance for each
            // add them each to the priority queue
            // then remove k from the front
            
            pq.offer(points[i]);

        }

        int[][] result = new int[k][2];
        for(int i = 0; i < k; i++){
            result[i] = pq.poll();
        }

        return result;

    }
}
