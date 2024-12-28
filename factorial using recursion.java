import java.util.*;
public class exe {
    public static long factorial(int n){
        if(n<=0)
        {
            return 1;
        }
        return n*factorial(n-1);

    }
    public static void main(String args[])
    {
        System.out.print("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        long ans = factorial(n);
        System.out.println("The factorial of the number is: "+ans);

    }
    
}
