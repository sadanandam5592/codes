import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
class cloneGraph{
    
    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    Node root;

    public cloneGraph(List<List<Integer>> adjList){
       Node r= createGraph(adjList);
       this.root=r;
    }

    public Node createGraph(List<List<Integer>> adjList){
        if(adjList==null) return null;
        if(adjList.isEmpty()) return new Node(1);
        
        HashMap<Integer,Node> nodes=new HashMap<>();
        int size=adjList.size();
        for(int i=1;i<=size;i++){
            nodes.put(i,new Node(i));
        }
        for(int i=0;i<size;i++){
            List<Integer> l=adjList.get(i);
            Node g=nodes.get(i+1);
            ArrayList<Node> k=new ArrayList<>();
            for(int j:l){
                Node p=nodes.get(j);
                k.add(p);
            }
            g.neighbors=k;
        }
      return nodes.get(1);
    }

    public static Node deepClone(Node node){
      Node cloneRoot=new Node(node.val);
      HashMap<Integer,Node> visited=new HashMap<>();
      visited.put(node.val,node);
      cloneIt(node,node,cloneRoot,visited);
      return cloneRoot;
    }
    public static void cloneIt(Node root,Node real,Node cloneRoot,HashMap<Integer,Node> visited){

     for(Node n:real.neighbors){
        if(!visited.containsKey(n.val)){
           visited.put(n.val,n);
           Node c=new Node(n.val);
           cloneRoot.neighbors.add(c);
            cloneIt(root,n,c,visited);
        } 
        else{
            Node neighbor=visited.get(n.val);
            cloneRoot.neighbors.add(neighbor);
        }
    }
    if(real.equals(root)) return;
    
    }
    
    
    public static void main(String[] args) {
        List<List<Integer>> c=new ArrayList<>();
        for(int i=0;i<4;i++){
        List<Integer> a=new ArrayList<>();
        if(i%2==0){
        a.add(2);
        a.add(4);}
        else{
           a.add(1);
           a.add(3); 
        }
        c.add(a);
        }
        cloneGraph h=new cloneGraph(c);
        Node f=h.deepClone(h.root);
        System.out.println(h.root.val);
    }
}