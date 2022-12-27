import java.util.ArrayList;
class TargetSum{

    static class Node{
        int val;
        ArrayList<Node> children;
      Node(int val){
        this.val=val;
        this.children=new ArrayList<Node>();
      }
    }
     
  
     TargetSum(){
        
     }
    
     public static void createGraph(int[] arr,Node positiveRoot,Node negativeRoot){
        Node positiveNode = positiveRoot;
        Node negativeNode = negativeRoot;
        
        for(int i=1;i<arr.length;i++){
          Node a=new Node(arr[i]);
          Node b=new Node(-arr[i]);
           positiveNode.children.add(a);
           positiveNode.children.add(b);
           negativeNode.children.add(a);
           negativeNode.children.add(b);
           positiveNode=a;
           negativeNode=b;
        }
        System.out.println("done");
     }
    
    public static int findTargetSumWays(int[] nums, int target) {
      
      if(nums.length==1){
       if( nums[0]==target) return 1;
       else if(-nums[0]==target) return 1;
       else return 0;
      }
      Node positiveRoot=new Node(nums[0]);
      Node negativeRoot=new Node(-nums[0]);
         createGraph(nums,positiveRoot,negativeRoot);
         int count=find(positiveRoot,target,0,0);
         count+=find(negativeRoot,target,0,0);
         return count;
    }

    public static int find(Node n,int target,int sum,int count){
      if(n==null){
        if(sum==target) return count++;
        else return count;
      }
       sum+=n.val;
       for(Node k:n.children){
         count=find(k,target,sum,count);
       }
     return count;
    }
     public static void main(String[] args) {
      int[] arr={7,5,3,4};
       TargetSum s=new TargetSum();
       s.()
     }
}