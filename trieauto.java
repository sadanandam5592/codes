import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class trieauto{

    static class TrieNode{
        HashMap<Character,TrieNode> children;
        char c;
        boolean isWord;
        
        public TrieNode(){
            children=new HashMap<>(); 
        }

        public TrieNode(char c){
           this.c=c;
           children =new HashMap<>();
           isWord=false;
        }

        public void insert(String s){//for every character we are creating a trienode class that
                                     //has a char c,a map,a boolean isWord.
           if(s==null||s.isEmpty()) return;
           char c=s.charAt(0);
           TrieNode child = children.get(c);
           if(child==null){
              children.put(c,new TrieNode(c));
           }
           if(s.length()>1) child.insert(s.substring(1)); //only sending a word with length greater than 2 letters
           else child.isWord=true;// we are writing whether isword or not on top of the hashmap that belongs to a character
           }
        }
    TrieNode root;  

    trieauto(List<String> words){
      root=new TrieNode();
      for(String s:words){
        root.insert(s);
      }
    }
  
    public List<String> suggest(String pre){ //in here we are only checking if the prefix exists or not
        List<String> l=new ArrayList<>();
        if( pre.isEmpty() || pre == null) return List.of();
        TrieNode curr=root;
        for( int i=0; i < pre.length() ; i++ ){
            if(curr==null)return l;
            curr=curr.children.get(pre.charAt(i));
        }
        suggestHelper(curr,l,pre);
        return l;
    }

    public void suggestHelper(TrieNode curr,List<String> s,String pre){
        
        StringBuffer sb=new StringBuffer(pre);
       
        if(curr.isWord==true){
           s.add(pre);
        }
        if(!curr.children.isEmpty()&&curr.children!=null){
          for(TrieNode t: curr.children.values()){
             suggestHelper(t, s, sb.append(t.c).toString());
          }
        }
    }
   

    public static void main(String[] args) {
        List<String> o=List.of("an","ant","and","antelope","cat","car");
        trieauto t=new trieauto(o);
        System.out.println(t.suggest("a"));
    }


}