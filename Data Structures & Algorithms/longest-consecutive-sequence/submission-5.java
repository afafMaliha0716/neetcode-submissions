class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new TreeSet<>();

        int maxC = 0;
        if(nums.length==1){
            return 1;
        }
        for(int i = 0; i< nums.length; i++){
            numSet.add(nums[i]);
        }
        int prev = 0;
        int curLength = 0;
        for(Integer n : numSet){
            System.out.println(curLength);
            if(n == prev+1){
                curLength++;
            } else {
                
                curLength=1;
            }
            maxC = Math.max(curLength,maxC);
            prev = n;
        
        }
        return maxC;
    }
}
