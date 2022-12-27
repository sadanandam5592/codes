import java.util.Stack;

class validParenthesis{
    public boolean isValid(String g){
        Stack<Character> k=new Stack<Character>();
        for(char c:g.toCharArray()){
           if(c=='(') k.push(')');
           else if(c=='{') k.push('}');
           else if(c=='[') k.push(']');
           else if(k.isEmpty() || k.pop()!=c) return false;

        }
        return true;
    }
}