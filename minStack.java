import java.util.ArrayList;
import java.util.Collections;
class minStack {
    
    ArrayList<Integer> a;

    public minStack() {
       a=new ArrayList<Integer>();
    }
    
    public void push(int val) {
         a.add(val);
    }
    
    public void pop() {
        if(a.isEmpty()) return;
        
        a.remove(a.size()-1);

    }
    
    public int top() {
        if(a.isEmpty()) return -1;
        return a.get(a.size()-1);
        
    }
    
    public int getMin() {
        if(a.isEmpty()) return -1;
        Integer min=a.get(0);
        ArrayList<Integer> o=a;
        for(int i=0;i<a.size();i++){
          if(a.get(i)<min){
            min=a.get(i);
          }
        }
        
        return min;
    }

    /*["MinStack","push","push","push","push","getMin","pop","getMin","pop","getMin","pop","getMin"]
     * [[],[2],[0],[3],[0],[],[],[],[],[],[],[]]
     */
    public static void main(String[] args) {
        minStack m = new minStack();
        m.push(2);
        m.push(0);
        m.push(3);
        m.push(0);
        m.getMin(); //0
        m.pop();  
        m.getMin(); //0
        m.pop();    
        m.getMin(); //0
        m.pop();    
        m.getMin();
    }
}