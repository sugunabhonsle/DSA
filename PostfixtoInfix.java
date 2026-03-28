import java.util.Scanner;
import java.util.Stack;

class Solution{
    public static void postfixtoinfix(String str){
        Stack<String> st = new Stack<>();
        int i=0;
        while(i<str.length()){
            if(Character.isWhitespace(str.charAt(i))){
                i++;
                continue;
            }
            else if(Character.isLetterOrDigit(str.charAt(i))){
                st.push(Character.toString(str.charAt(i)));
            }
            else 
            {
                String t1 = st.pop();
                String t2 = st.pop();
                String expn ="(" + t2 + str.charAt(i) + t1 + ")";
                st.push(expn);
            }
            i++;
        }
        
    System.out.println("Your Postfix to Infix Expression : "+st.peek());
    }
}

public class PostfixtoInfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Postfix Expression");
        String str = sc.nextLine();
        Solution.postfixtoinfix(str);
    }
}
