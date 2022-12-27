import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;


class rpn{
    Stack stack=new Stack<>();
    public int evalRPN(String[] tokens) {
        ArrayList<Integer> h=new ArrayList();
        h.add(3);
        
        if(tokens.length==0) return 
        
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].matches("[^a-zA-Z]")){
               int b= stack.pop();
               int a=stack.pop();
                switch(tokens[i]){
                    case "+":
                        stack.push(b+a);
                    case "-":
                        stack.push(b-a);
                    case "*":
                        stack.push(b*a);
                    case "/":
                        stack.push(b/a);
                }
            }
            else{
                int y=Integer.parseInt(tokens[i]);
                stack.push(y);
            }
        }
        return stack.pop;
    }
}