import java.util.Stack;
import java.util.ArrayList;

class temperatures{
    public static int[] t(int[] temperatures) {
        // Stack<Integer> stack = new Stack<>();
        // int[] ret = new int[temperatures.length];
        // for(int i = 0; i < temperatures.length; i++) {
        //     while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
        //         int idx = stack.pop();
        //         ret[idx] = i - idx;
        //     }
        //     stack.push(i);
        // }
        // return ret;
        ArrayList<Integer> l=new ArrayList();
        l.add(0);
        for(int i=0;i<temperatures.length;i++){
            while(!l.isEmpty()&&){
                if()
            }
        }
    }
    public static void main(String[] args) {
        int[] temperatures={73,74,75,71,69,72,76,73};
        //int[] temperatures={30,40,50,60};
        int[] ans=t(temperatures);
        for(int i:ans){
            System.out.println(i);
        }
    }
}