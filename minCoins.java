import java.util.Arrays;

class minCoins{
    public static void main(String[] args) {
        int a[]={7,5,1};
        int n=18;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        int ourAns=min(18,a,dp);
        System.out.println(ourAns);
    }
    static int min(int n,int[] a,int[] dp){
     if(n==0) return 0;
     int ans=Integer.MAX_VALUE;
     for(int i=0;i<a.length;i++){ 
        //for -ve values we dont calculate subArray value and skip them.we calculate the +ve values only
        //until they encounter 0;
         if(n-a[i]>=0){

         int subAns=0; 
         if(dp[n-a[i]]!=-1){
           subAns=dp[n-a[i]];
         } else {
           subAns = min(n-a[i],a,dp);
         }
        
         if(subAns!=Integer.MAX_VALUE && subAns+1<ans){
           ans=subAns+1;
         }
         }
      }
     return dp[n] = ans;
    }
}