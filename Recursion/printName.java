
import java.util.Scanner;

class printName{
public static void print(int n,int i){
    if(i==n)
    {   System.out.println("Suguuu");
        return;
    }
   
  
    System.out.println("Suguuu");
    print(n,i+1);
}



public static void main(String[] args)  {
        int n;
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printName obj = new printName();
        obj.print(n,1);
    }
    

}

