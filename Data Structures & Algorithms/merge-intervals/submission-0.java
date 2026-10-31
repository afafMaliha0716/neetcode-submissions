class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));

        List<int[]> result = new ArrayList<>();

        for(int[] c: intervals){
            if(result.isEmpty() || result.get(result.size()-1)[1]<c[0]){
                result.add(c);
            } else{
                int[] last = result.get(result.size()-1);
                last[1] = Math.max(last[1],c[1]);
            }
        }

        return result.toArray(new int[result.size()][]);

    }
}
