class Solution {
    public int orangesRotting(int[][] grid) {
        /* this is a BFS search type of thing since only neighbors can be rotted 
        plus if we need to know minutes elapsed it has to do with levels
        */

        // if not all the fresh fruits may rot then we need to have a track of how many are rotten
        // if total is not zero in teh end we return -1
        int totalFresh = 0;
        Queue<int[]> neighbors = new LinkedList<>();
        for(int i=0; i<grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j]==1){
                    totalFresh++;
                } else if (grid[i][j]==2){
                    neighbors.add(new int[]{i,j});
                }
            }
        }

        // now we have to do a BFS. Each minute is technically a level traverse
        // make a queue to store the neighbors
        int[][] dirs = new int[][] {{1,0}, {0,1}, {0,-1}, {-1,0}};
        int minutes = 0;
        int thisMinute = neighbors.size();
        int processed = 0;
        
        while(!neighbors.isEmpty()){
            // new level is being traversed;
            if(processed==thisMinute){
                minutes++;
                thisMinute=neighbors.size();
                processed=0;
            }

            // check all the nighbors and if they are 1 we set them to a 2 and decrement total,
            //and add them to neighbors
            int[] cur = neighbors.poll();
            processed++;
            for(int[] dir: dirs){
                int newR = cur[0]+dir[0];
                int newC = dir[1]+ cur[1];

                if((newR<grid.length) && (newR>=0) && (newC < grid[0].length) && newC >=0 
                && grid[newR][newC]==1){
                    totalFresh--;
                    grid[newR][newC] = 2;
                    neighbors.add(new int[]{newR,newC});
                }
            }

        }

        return totalFresh > 0 ? -1: minutes;


    }
}
