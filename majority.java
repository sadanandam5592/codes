import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class majority{
    public static int m(List<Integer> A){
         Collections.sort(A);
         int i=0;
         int length=A.size();
         int count=1;
         int floor=length/2;
         if(length==1){
            return A.get(0);
         }
         while(i<length-1){
            int currelement=A.get(i);
            if(currelement==A.get(i+1)){
                count++;
            }
            else{
                count=1;
            }
             if(count>floor){
                return currelement;
             }
             i++;
         }
        return 0;
         
        
    }    
    public static void main(String[] args) {
        Integer[] arr={2,1,1,1};
        List<Integer> s=Arrays.asList(arr);
         System.out.println(majority.m(s));
        
    }
}