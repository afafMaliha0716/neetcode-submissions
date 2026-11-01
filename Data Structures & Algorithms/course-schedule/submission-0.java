class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] needed = new int[numCourses];
        // loop thorugh prerequisites
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
        for (int[] p : prerequisites) {
            int a = p[0], b = p[1];
            graph.get(b).add(a);   // b unlocks a
            needed[a]++;           // a needs one more prerequisite
        }

        // explore with BFS. When a courses needed becomes zero you can now decrement the ones that needed that course
        boolean[] finished = new boolean[numCourses];
        Queue<Integer> q = new ArrayDeque<>();
        // need to know which ones have no prereqs
        int totalLeft = numCourses;
        for(int i = 0; i<numCourses; i++){
            if(needed[i]==0){
                q.offer(i);
                finished[i] = true;
                totalLeft--;
            }
        }

        //now ready to loop through
        
        while(!q.isEmpty()){
            // need to take one off the queue and check its dependendents. if they equal 0 you can mark it as visited
            // loop through its adjacency list, mark each of their needed as -- and if its reached 0 put them in teh queue and mark as visited.
            int n = q.poll();
            List<Integer> dependents = graph.get(n);
            for(int num: dependents){
                needed[num]--;
                if(needed[num]==0){
                    finished[num] = true;
                    q.offer(num);
                    totalLeft--;
                }
            }
        }
        return (totalLeft == 0);

    }
}
