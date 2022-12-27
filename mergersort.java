class mergersort{
    static void divide(int[] arr,int si,int ei){
       if(si>=ei){ return;}
       int mid=si+(ei-si)/2;
       divide(arr,si,mid);
       divide(arr,mid+1,ei);
       conquer(arr,si,mid,ei);

    }
    static void conquer(int[] arr,int si,int mid,int ei){
      int arr1idx=si;
      int arr2idx=mid+1;
      int x=0;
      int[] newarr=new int[ei-si+1];
        while(arr1idx<=mid && arr2idx<=ei){
            if(arr[arr1idx]<arr[arr2idx]){
                newarr[x++] = arr[arr1idx++];
            }else{
                newarr[x++]=arr[arr2idx++];
            }
        }

        while(arr1idx<=mid){
            newarr[x++] = arr[arr1idx++];
        }
        while(arr2idx<=ei){
            newarr[x++]=arr[arr2idx++];
        }
       for(int i=0,j=si;i<newarr.length;i++,j++){
        arr[j]=newarr[i];
       }
    }
    public static void main(String[] args) {
        int[] arr={4,3,1,8,2,9,6};
        int ei=arr.length-1;
        divide(arr, 0, ei);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
      }
}
}