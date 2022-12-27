
class caps{
    public static int countWays(int[][] persons){
        int count=0;
        for(int i=0;i<persons.length;i++){
            int basket[]=new int[101];
            basket[persons[0][i]]=1;
            count+=countUtil(persons,basket,1,1);

        }
        return count;
    }
    static int countUtil(int[][] persons,int[] basket,int count,int pid){
        
        int size=persons[pid].length;

        if(pid==size) return count;
        for(int j:persons[pid]){
          if(basket[j]==1){
            size--;
          }
          basket[j]=1;
        }
        int b=size*count;
       return countUtil(persons, basket, b, pid+1);
    }
    public static void main(String[] args) {
        int[][] persons={{5,1,100},{2},{5,100}};
        System.out.println(countWays(persons));
     }
}