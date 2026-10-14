class Solution {
    public int numIslands(char[][] grid) {
       // we use a queue
       
        Queue<int[]> queue = new LinkedList<>(); 
        int numIslands = 0;

        // only increment when we find new land
       int[][] dir = {{0,1}, {1,0}, {-1,0}, {0,-1}};
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                if(grid[r][c]=='1'){
                    grid[r][c]= 0;
                    queue.add(new int[]{r,c});
                    numIslands++;
                }
                while(!queue.isEmpty()){
                    int[] cur = queue.poll();
                    int curR= cur[0];
                    int curC = cur[1];
                    // we check all the neighbors
                    for(int i=0; i<dir.length; i++){
                        int nr= curR+dir[i][0];
                        int nc= curC+dir[i][1];

                        if(nr<0 || nc<0 || nr>=grid.length || nc>=grid[0].length || grid[nr][nc] == '0'){
                            continue;
                        } else {
                            grid[nr][nc] = '0';
                            queue.add(new int[]{nr,nc});
                        }
                    }
                   
                }
            }
        }
        return numIslands;
    }
}
