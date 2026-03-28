import java.util.Scanner;
import java.util.Stack;

class Solution{
    public static void prefixtoinfix(String str){
        Stack<String> st = new Stack<>();
        int i=str.length()-1;
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
                String expn ="(" + t1 + str.charAt(i) + t2 + ")";
                st.push(expn);
            }
            i--;
        }
        
    System.out.println("Your Prefix to Infix Expression : "+st.peek());
    }
}

public class PrefixtoInfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Prefix Expression");
        String str = sc.nextLine();
        Solution.prefixtoinfix(str);
    }
}
