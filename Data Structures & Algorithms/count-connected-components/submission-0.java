class Solution {
    public int countComponents(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        // start with populating the adjacency list
        for(int i =0; i<n;i++){
            graph.put(i, new ArrayList<>());
        }
       for(int[] e: edges){
        int a = e[0];
        int b = e[1];
        graph.get(a).add(b);
        graph.get(b).add(a);
       }

       // now we go through and count the components
       boolean[] visited = new boolean[n];
        int cc = 0;
        for(int i=0; i<n; i++){
            // check if its visited. if not we have found a new connected components
            if(!visited[i]){
                cc++;

                //... mark as visited and check all the neighbors
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                visited[i] = true;

                while(!queue.isEmpty())
                // loop through the current nodes neighbors

                // int cur = 
                for(int v: graph.get(queue.poll())){
                    if(!visited[v]){
                        queue.add(v);
                        visited[v] = true;
                    }                    
                }
            } 
        }
        return cc;
    }
}
