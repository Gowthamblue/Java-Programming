import java.util.*;
public class countdigits {
    public static long digits(long n,int count)
    {
        if(n==0)
        {
            return count;
        }
        count++;
        return digits(n/10,count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        System.out.print("Enter the number : ");
        n=sc.nextInt();
        long ans=digits(n,c);
        System.out.println("The Number contains "+ans+" digits.");
        sc.close();

    }
    
}
