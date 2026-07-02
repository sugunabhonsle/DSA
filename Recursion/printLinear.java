
import java.util.Scanner;

public class printLinear {
    public void print(int n,int i){
        if(i<1){
           // System.out.print(i);
            return;
        }
        System.out.print(i+" ");
        print(n,i-1);
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter Number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printLinear obj = new printLinear();
        obj.print(n,n);
        
    }
}
