class Solution {
    public int maxArea(int[] heights) {
        // start at a certain height and check what each of the heights
        // start at the widest with pointers on either end
        // at each iteration calculate the area and compare it to max
        // then move the pointer on the smaller height inward
        int maxArea = 0;
        int leftIndex = 0;
        int rightIndex = heights.length-1;
        int curWidth = rightIndex - leftIndex;
        
        while(curWidth>0){
            // we start moving the pointers
            int curArea = Math.min(heights[rightIndex], heights[leftIndex])*curWidth;
            maxArea = Math.max(curArea,maxArea);

            // move the pointer forward for whichever index has a lower height
            if(heights[rightIndex]<heights[leftIndex]){
                rightIndex--;
            } else if (heights[rightIndex]>heights[leftIndex]){
                leftIndex++;
            } else {
                rightIndex--;
                leftIndex++;
            }
            curWidth = rightIndex - leftIndex;
        }
        return maxArea;
    }
}
