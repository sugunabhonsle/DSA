import java.util.Scanner;

public class sumofnums {

    public int print(int i,int sum){
        if(i<1)
            return sum;
    print(i-1,sum+i);
    

       
}

    public static void main(String[] args) {
        int n;
        System.out.print("Enter Number ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sumofnums obj = new sumofnums();
        int sum1=obj.print(n,0);
        System.out.print(sum1);
        
        
    }
    
}
