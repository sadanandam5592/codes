import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Allocate{
    public static int m(int[] a,int books,int people){
        int sum=0;
        int booksleft=books-people+1;
        Arrays.sort(a);int i=0;
        while(i<booksleft){
            sum+=a[i];
            i++;
        }
        return sum;
    }
public static void main(String[] args) {
    int[] a={12,34,67,90};
    int ans=Allocate.m(a,4,2);
    System.out.println(ans);
}
}