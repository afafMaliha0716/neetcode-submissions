class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        // use a stack to store the tempratures waiting for a warmer value
        Deque<int[]> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];
        for(int i =0; i< temperatures.length; i++){
            int temp = temperatures[i];
            // if the temp of this is greater than the one at the top of the stack, pop it and update its index in result to the the index of this minus that one
                while(!stack.isEmpty() && stack.peek()[0]<temp){
                    int[] popped = stack.pop();
                    result[popped[1]] = i - popped[1];
                }
                stack.push(new int[]{temp, i});
        }
        return result;
    }
}
