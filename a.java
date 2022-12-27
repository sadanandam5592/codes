
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class a{
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // // Code here 
        // ArrayList<Integer> list = new ArrayList<>();
        // boolean visited[] = new boolean[V+1];
        // Queue<Integer> q= new LinkedList<>();
        // q.add(0);
        // visited[0]=true;
        // while(!q.isEmpty()){
        //     int u=q.poll();
        //     list.add(u);
        //     for(int v : adj.get(u)){
        //         if(visited[v]==false){
        //             visited[v]=true;
        //             q.add(v);
        //         }
        //     }
        // }
        Queue<Integer> q=new LinkedList<>();
        ArrayLis<Integer> f=new ArrayList<>();
        q.add(0);
        while(!q.isEmpty()){
            int a=q.poll();
            
        }
        return list;
    }
}