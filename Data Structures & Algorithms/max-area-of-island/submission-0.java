class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int r = 0; r< grid.length; r++){
            for (int c = 0; c< grid[0].length; c++){
                int thisArea = dfs(grid, r, c);
                maxArea = Math.max(maxArea, thisArea);
            }
        }

        return maxArea;

    }

    private int dfs(int[][] grid, int r, int c){
        // base case: your off the grid or reached water
        if( r< 0 || c<0 || r>=grid.length || c>= grid[0].length || grid[r][c] == 0){
            return 0;
        } 

        // mark this land as visited
        grid[r][c] = 0;
        return 1 + dfs(grid, r+1, c) + dfs(grid, r-1, c) + dfs(grid, r, c + 1) 
        + dfs(grid, r, c-1);

    }
}
