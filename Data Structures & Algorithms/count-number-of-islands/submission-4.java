class Solution {
    public int numIslands(char[][] grid) {
        // when you visit a peice of land switch it to water so its marked as visited
        // when you land on a peice then check its neighbors
        // use a BFS method to do this and a queue to get through the neighbors.
        // loop through them all and go to the nieghbors
        int total = 0;
        Queue<int[]> queue = new LinkedList<>();

        int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};

        for(int r = 0; r < grid.length; r++){
            for(int c =0; c < grid[0].length; c++){
                if(grid[r][c]=='1'){
                    total++;
                    queue.offer(new int[]{r, c});
                
                while(!queue.isEmpty()){
                    int[] cur = queue.poll();
                    for(int i = 0; i< dir.length; i++){
                        int nr = cur[0]+dir[i][0];
                        int nc = cur[1]+dir[i][1];
                            if(nr>=grid.length || nr < 0 || nc >= grid[0].length 
                            || nc < 0 || grid[nr][nc] == '0'){
                                // do nothing?
                                continue;
                            } else {
                                grid[nr][nc] = '0';
                                queue.offer(new int[] {nr,nc});
                            }
                    }
                }
            }
                // add this element to the linked list
            }
        }
        return total;
    }

}
