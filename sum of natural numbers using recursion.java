import java.util.*;
public class sumofrec {
    public static long sum(int n){
        if(n<=0)
        {
            return 0;
        }
        return n+sum(n-1);

    }
    public static void main(String args[])
    {
        System.out.print("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        long ans = sum(n);
        System.out.println("The sum of the natural numbers is: "+ans);

    }
    
}

