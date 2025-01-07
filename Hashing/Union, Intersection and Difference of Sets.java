import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setprogram {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        System.out.print("Enter the number of the element for set1: ");
        int n=sc.nextInt();
        System.out.print("Enter the number of the element for set2: ");
        int m =sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the Elements for the set1: ");
            set1.add(sc.nextInt());
        } 
        for(int i=0;i<m;i++)
        {
            System.out.print("Enter the Elements for the set2: ");
            set2.add(sc.nextInt());
        }
        System.out.println("The Set1 is: "+set1);
        System.out.println("The Set2 is: "+set2);
        Set<Integer> clone = new HashSet<>();
        Set<Integer> clone1 = new HashSet<>();

        clone.addAll(set1);
        clone1.addAll(set2);
        System.out.println("The Union of Two sets: "+clone1);
        clone.retainAll(set2);
        System.out.println("The Interection of the Sets: "+clone);
        set1.removeAll(clone);
        set2.removeAll(clone);
        System.out.println("The Subraction of set2 from set1: "+set1);
        System.out.println("The Subraction of Set1 from set2: "+set2);
            
        
    }
    
}
