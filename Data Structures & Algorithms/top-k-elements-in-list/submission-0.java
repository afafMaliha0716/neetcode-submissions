class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // make a hashMap
        // keys are the integers and values is number of repetitions
        // but the complexity of this im not sure
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n: nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        // now that u created this map with values and frequencies
        // you have to return the tops k ones
        // what would have a sorted version of this? maybe if i used an actual map instead of a hashmap?
        int size = nums.length + 1;
        List<Integer>[] buckets = new List[size];   
        for(int n:freq.keySet()){
            int count = freq.get(n);
            if(buckets[count]==null){
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(n);
        }

        int[] result = new int[k];
        int idx=0;
        for(int i= buckets.length-1; i>=0 && idx < k; i--){
            if (buckets[i] != null){
                for(int n: buckets[i]){
                    result[idx] = n;
                    idx++;
                    if (idx == k) return result;
                }
            }
        }
        return result;
        // now you have a list of the frequencies and each frequency stores what number shave that
    }
}