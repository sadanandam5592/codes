class Bubblesort{
    static int[] sort(int[] a){
        int n=a.length;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    return a;
    }
    public static void main(String[] args) {
        int[] arr={4,3,7,1,5};
       int[] sol= sort(arr);
        for(int i=0;i<sol.length;i++){
            System.out.println(sol[i]);
        }
    }
}