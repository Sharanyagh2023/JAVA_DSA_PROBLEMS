package DAY1.Session2;
import java.util.*;
public class StackParenthesis {
    public boolean isValid(String s) {
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.peek();
                if((c==')' && top=='(') || (c=='}' && top=='{') || (c==']' && top=='[')){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
    return st.isEmpty();
    public static void main(String[] args) {    
        Stack<Character> st=new Stack<Character>();
        st={'(',')','{','}','[',']'};
            
        }
    }
}
