import java.util.*;
public class powrec {
    public static long pow(int n,int p)
    {
        if(p==0)
        {
            return 1;
        }
        return n*pow(n,p-1);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Base: ");
        int n=sc.nextInt();
        System.out.print("Enter the pow: ");
        int p =sc.nextInt();
        long ans = pow(n,p);
        System.out.println("The power of the base is : "+ans);
        sc.close();


    }
    
}
