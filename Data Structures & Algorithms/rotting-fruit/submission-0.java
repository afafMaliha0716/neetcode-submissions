class Solution {
    public int orangesRotting(int[][] grid) {
        // find all the starting rotting oranges

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        // queue all teh rotted and count all teh fresh
        for(int r = 0; r< grid.length; r++){
            for(int c = 0; c<grid[0].length; c++){
                if(grid[r][c]==2){
                    queue.add(new int[]{r,c});
                } else if(grid[r][c] == 1 ){
                    fresh++;
                }
            }
        }

        int minute = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while(!queue.isEmpty() && fresh>0){
            int size = queue.size();
            for(int i = 0; i<size; i++){
                // you want to check all teh directions against current index
                int[] cur = queue.poll();
                for( int[] dir: directions){
                    int nr = cur[0]+dir[0];
                    int nc = cur[1]+dir[1];

                    if(nr<0 || nc < 0|| nr>=grid.length || nc >= grid[0].length 
                    || grid[nr][nc] != 1){
                        continue;
                    }

                    // else we add it to queue and reduce the number of fresh fruit
                    grid[nr][nc] = 2; // mark as rotten
                    fresh--;
                    queue.add(new int[]{nr,nc});
                }
            }
            minute++;
        }

        return fresh == 0? minute: -1;
    }
}
