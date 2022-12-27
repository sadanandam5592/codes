import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

class solution{
   
   static class TrieNode {
        HashMap<Character,TrieNode> children;
        boolean isWord;

        public TrieNode(){
           children =new HashMap<>();
           isWord=false;
        }
      }
     
      TrieNode root;

      public solution(){
         root=new TrieNode();
       }

      public void insert(TrieNode curr,String s) {
           if(s==null||s.isEmpty()) return;
           char c=s.charAt(0);
           TrieNode child = curr.children.get(c);
           if(child==null){
              curr.children.put(c,new TrieNode());
           }
           if(s.length()>1) {
            insert(curr.children.get(c),s.substring(1));
           }
           else curr.children.get(c).isWord=true;
       }
     
      public String replace(List<String> dict,String s){
         ArrayList<String> l=new ArrayList<>();
         StringTokenizer st=new StringTokenizer(s);
         if(s.isEmpty()) return "";
         while(st.hasMoreTokens()){
           l.add(st.nextToken());
         }
         for(String p:dict){
            insert(root,p);
         }
         StringBuilder x=new StringBuilder();
         
         return findAndReplace(l);   
       }
      
      public String findAndReplace(List<String> h){
         StringBuilder sb=new StringBuilder();
          for(String s:h){
            sb.append(find(s));
            sb.append(" ");
          }
          return sb.toString().substring(0,sb.length()-1);
      }

      public String find(String k){
         TrieNode curr=root;
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<k.length();i++){
            char c=k.charAt(i);
            if(curr.children.get(c)==null) return k;
            else{
               curr=curr.children.get(c);
               sb.append(c);
               if(curr.isWord==true) return sb.toString();
            }
         }
         return sb.toString();
      }
   
      public static void main(String[] args) {
         List<String> f=List.of("cat","bat","rat");
         String a="the cattle was rattled by the battery";
         solution s=new solution();
         
         System.out.println(s.replace(f,a));
   
   }
}