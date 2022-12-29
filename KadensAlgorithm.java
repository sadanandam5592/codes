class KadensAlgorithm{

    // kadens algorithm states that if we encounter negative sum at a certain point
    // then we should ignore that subarray
    static int find(int[] arr){
        int curr=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr>max){
                max=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={-5,4,6,-3,4,-1};
       System.out.println(find(arr));
    }
}