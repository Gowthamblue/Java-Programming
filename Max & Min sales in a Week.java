import java.util.*;
public class week {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int[] arr=new int[7];
        String[] ar={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for(int i=0;i<7;i++)
        {
            System.out.print("Enter the no. of sales on "+ ar[i] +": ");
            int s=sc.nextInt();
            arr[i]=s;
        }
        int max=arr[0],min=arr[0];
        int j=0,k=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                j=i;
                
            }
            if(min>arr[i])
            {
                min=arr[i];
                k=i;
            }

        }
        sum=arr[5]+arr[6];
        
        System.out.println("the maximum sales on "+(ar[j]));
        System.out.println("the minimum sales on "+(ar[k]));
        System.out.println("Weekend sales is "+sum);
    }
}
