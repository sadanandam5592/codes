import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
class phonebook{
    public static void main(String[] args) {

        Scanner f=new Scanner(System.in);
        HashMap<String,String> h=new HashMap<>();
        int n=f.nextInt();
        for(int i=0;i<n;i++){
             h.put(f.next(),f.next());
        }
        
        while(f.hasNext()){
            String key=f.next();
            if(h.containsKey(key)){
                System.out.println(key+"="+h.get(key));
            }
            else{
                System.out.println("Not found");
            }
        }
         f.close();
     }
}
