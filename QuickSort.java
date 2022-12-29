class QuickSort{

    static int partition(int[] arr,int l,int h){
        int pivot=l;
        int i=pivot+1;
        int j=arr.length-1;
        while(i<j){
          while(arr[i]<arr[pivot])i++;
          while(arr[j]>arr[pivot])j--;
          if(i<j){
            swap(arr,i,j);
          }
        }
        swap(arr,pivot,j);

        return j;
    }
    static void sort(int[] arr,int l,int h){
        if(l<h){
            int pivot=partition(arr,l,h);
            sort(arr,l,pivot-1);
            sort(arr,pivot+1,h);
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={4,6,2,5,7,9,1,3};
        sort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
}