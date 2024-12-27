import java.util.*;
public class arrays {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the "+i+"th Element of the array ");
            int a=sc.nextInt();
            arr[i]=a;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("The "+i+" th element of the arrays is: "+arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("The sorted array is"+(Arrays.toString(arr)));
        int[] arr1=new int[n];
        Arrays.fill(arr1,7);
        int[] arr2=new int[n];
        arr2= Arrays.copyOfRange(arr, 0, 3);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr, arr));





    }
    
}
