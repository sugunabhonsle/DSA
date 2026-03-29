import java.util.Scanner;
import java.util.Stack;

class Solution{
    public static int prec(char c){
          if(c=='^')
             return 3;
          else if(c=='*' || c=='/')
            return 2;
          else if(c=='+'|| c=='-')
            return 1;
          else
            return -1;
         
    }

    public static void infixtoprefix(String str){
        StringBuilder res = new StringBuilder();
        StringBuilder s = new StringBuilder();
        Stack<Character> st = new Stack<>();
        s = s.append(str);
        s.reverse();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')')
                s.setCharAt(i, '(');
            else if(s.charAt(i)=='(')
                s.setCharAt(i, ')');
        }
        int i1=0;
       while(i1<str.length()){
        if(Character.isWhitespace(s.charAt(i1))){
            i1++;
            continue;
        }
        else if(Character.isLetterOrDigit(s.charAt(i1))){
            res.append(s.charAt(i1));
        }
        else if(s.charAt(i1)=='('){
            st.push(s.charAt(i1));
        }
        else if(s.charAt(i1)==')'){
            while(!st.empty() && st.peek()!='('){
                res.append(st.pop());
            }
            st.pop();
        }
        else{
          if(s.charAt(i1)=='^'){
            while(!st.empty() && prec(s.charAt(i1))<=prec(st.peek())){
                res.append(st.pop());
            }
            st.push(s.charAt(i1));
          }
          else{
            while(!st.empty() && prec(s.charAt(i1))<prec(st.peek())){
                res.append(st.pop());
            }
            st.push(s.charAt(i1));
          }
          }
          i1++;
        }
        while(!st.empty()){
            res.append(st.pop());
        }
        System.out.println("Your Infix To Prefix coversion : "+res.reverse().toString());
       }


    }



public class InfixtoPrefix {
    public static void main(String[] args) {
        System.out.println("Enter Infix Expression");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution.infixtoprefix(str);
    }
    
}
