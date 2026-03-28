import java.util.Scanner;
import java.util.Stack;

class Solution{
    public static void prefixtopostfix(String str){
        Stack<String> st = new Stack<>();
        int i= str.length()-1;
        while(i>=0){
            if(Character.isWhitespace(str.charAt(i))){
                i--;
                continue;
            }
            else if(Character.isLetterOrDigit(str.charAt(i))){
                st.push(Character.toString(str.charAt(i)));
            }
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String expn = t1+t2+str.charAt(i);
                st.push(expn);
            }
            i--;
        }
        System.out.println("Your Prefix to Postfix expression : "+st.peek());
        
    }
}

public class PrefixtoPostfix {
    
    public static void main(String[] args) {
        System.out.println("Enter Prefix expression");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution.prefixtopostfix(str);
    }

    
}
