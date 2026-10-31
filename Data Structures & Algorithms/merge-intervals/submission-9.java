class Solution {
    public int[][] merge(int[][] intervals) {
        // start by sorting the intervals in this array. this will make the complexity O(nlogn) which
        // is better than O(n^2) which it would be if we compared each one with every other element
        // two intervals a & b can be merged if (a[0] less than b[1] and greater than b[0])
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        // now loop through intervals and see if this one has a start thats less than the end of last one
        for(int i = 0; i<intervals.length; i++){

            // if result is empty or if the last one in result can be merged with this interval
            if(result.size()==0 || result.get(result.size()-1)[1]<intervals[i][0] || result.get(result.size()-1)[0] > intervals[i][0]){
                result.add(intervals[i]);
            }

            // else if our interval is within we need to update the end time of the last interval in result
            else{
                if(intervals[i][1] > result.get(result.size()-1)[1]){
                    result.get(result.size()-1)[1] = intervals[i][1];
                }
                
            }
        }

        return result.toArray(new int[0][]);

    }
}
