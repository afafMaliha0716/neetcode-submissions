class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];

        // now we pop onto the the stack
        // if the stack is empty then we pop on, if not we peek at the front and keep going until this temprature is not higher
        for(int i = 0; i < temperatures.length; i++){
            int cur = temperatures[i];
            while(!stack.isEmpty() && stack.peek()[0]<cur){
                int[] top = stack.pop();
                result[top[1]] = i-top[1];
            }
            stack.push(new int[]{cur,i});
        }

        return result;
    }
}
