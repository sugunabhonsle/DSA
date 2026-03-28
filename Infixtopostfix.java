import java.util.Scanner;
import java.util.Stack;

class Solution{
    public static int prec(char c){

        if(c == '^')
            return 3;
        else if(c == '*' || c == '/')
            return 2;
        else if(c == '+' || c == '-')
            return 1;
        else
            return -1;
    }
    public static void infixtoPostfix(String str){

        Stack<Character> st = new Stack<>();
        int i=0;
        StringBuilder res = new StringBuilder();
        while(i<str.length()){
            if(Character.isWhitespace(str.charAt(i))){
                i++;
                continue;
            }
            else if(Character.isLetterOrDigit(str.charAt(i))){
                res.append(str.charAt(i));
                
            }
            else if(str.charAt(i) == '('){
                st.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')'){
                while(st.peek() != '('){
                    res.append(st.pop());
                }
                st.pop();
            }
            else{
                
                while(!st.empty() && prec(str.charAt(i))<= prec(st.peek())){
                    res.append(st.pop());
                }
                st.push(str.charAt(i));
               
            }
            i++;
            System.out.println(i);
        }
        while(!st.empty()){
            res.append(st.pop());
        }
        System.out.println("InfixtoPostfix Conversion :"+ res.toString());
    }



}

public class Infixtopostfix{
    public static void main(String[] args) {
        System.out.println("Enter Infix Expression");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution.infixtoPostfix(str);

        
    }
}