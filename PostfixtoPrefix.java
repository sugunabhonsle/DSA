
import java.util.Scanner;
import java.util.Stack;

class Solution{
    public static void postfixtoprefix(String str){
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
            else{
                String t1 = st.pop();
                String t2 = st.pop();
                String expn = str.charAt(i)+t2+t1;
                st.push(expn);
            }
            i++;
          }
          System.out.println("Your Postfix to Prefix Conversion : "+st.peek());
    }
}



public class PostfixtoPrefix {
    public static void main(String[] args) {
        System.out.println("Enter Postfix expression");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution.postfixtoprefix(str);
        
    }
    
}
