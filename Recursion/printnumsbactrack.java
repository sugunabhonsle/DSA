import java.util.Scanner;

public class printnumsbactrack {
    public void print(int n,int i){
        if(i>n){
           // System.out.print(i);
            return;
        }
        
        print(n,i+1);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter Number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printnumsbactrack obj = new printnumsbactrack();
        obj.print(n,1);
        
    }
}
