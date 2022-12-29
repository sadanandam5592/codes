class maxSubarr{ 

    //find the maximum contiguous subarray
    static int maxSubArraySum(int[] arr,int fromindex,int toindex,int max){
        if(fromindex-toindex==0) return (max>arr[0]?max:arr[0]);
        int localmax= Sum(arr,fromindex,toindex);
        max= (localmax>max?localmax:max);
        
        return max(maxSubArraySum(arr,fromindex,toindex-1,max),maxSubArraySum(arr, fromindex+1,toindex,max));
    }
    static int Sum(int[] arr,int fromindex,int toindex){
        int sum=0;
        for(int i=fromindex;i<=toindex;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static int max(int a, int b) { return (a > b) ? a : b; }
    public static void main(String[] args) {
        int[] arr={-5,4,6,-3,4,-1};
        System.out.println(maxSubArraySum(arr,0,arr.length-1,0));
        System.gc();
    }
}