import java.util.*;
public class Reverseofanarray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
           // System.out.println("Enter the element at position "+i+": ");
            arr[i]=sc.nextInt();
        }
        System.out.print("The original array is: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("The Reversed array is:");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
