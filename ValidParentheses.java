import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> pStack = new Stack<Character>();
        
        if(s.length() == 1) return false;
        if(s == "") return true;

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if (c == '('){
                pStack.push(c);
            } else if (c == ')'){
                if (pStack.isEmpty()) return false;
                if (pStack.peek() == '('){ 
                    pStack.pop();
                } else return false;  
            } else if (c == '{'){
                pStack.push(c);
            } else if (c == '}'){
                if (pStack.isEmpty()) return false;
                if (pStack.peek() == '{'){ 
                    pStack.pop();
                } else return false;  
            } else if (c == '['){
                pStack.push(c);
            } else if (c == ']'){
                if (pStack.isEmpty()) return false;
                if (pStack.peek() == '['){ 
                    pStack.pop();
                } else return false;
            }
        }

        if(pStack.size() >= 2) return false;

        System.out.println(true);

        return true;  
    }

    public static void main(String[] args){

        String parantheses = "([])";

        isValid(parantheses);

    }
}