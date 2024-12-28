import java.util.*;
public class Fibseries {
    public static int fibbo(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the fibonacci series length: ");
        int n=sc.nextInt();
        System.out.println("Fibonacci Series is: ");
        for(int i=0;i<n;i++)
        {
        
            System.out.print(fibbo(i)+" ");

        }
        sc.close();

    }
    
}
