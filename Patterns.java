import java.util.Scanner;
public class patterns {
    public static void Square_pattern(int a)
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangle_pattern(int a)
    {
        for(int i=1;i<=a;i++)
        {
            for(int j=a-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
           
            System.out.println();
        }
    }
    public static void Invtri(int a)
    {
        for(int i=a;i>=1;i--)
        {
            for(int j=a-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void revtri(int a)
    {
        for(int i=a;i>=1;i--)
        {
            for(int j=a-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[])
    {
System.out.println("===============Pattern Menu===============");
System.out.println("1.Square pattern");
System.out.println("2.Triangle Pattern");
System.out.println("3.Inverted Triangle Pattern");
System.out.println("4.Reverse Triangle Pattern");
System.out.println("5.Exit");
Scanner sc = new Scanner(System.in);
while(true)
{
    System.out.print("Enter the choice: ");
    int choice=sc.nextInt();
    if(choice==1)
    {
        System.out.print("Enter the Square pattern size: ");
        int s=sc.nextInt();
        Square_pattern(s);
    }
    else if(choice==2)
    {
        System.out.print("Enter the Triangle pattern size: ");
        int s=sc.nextInt();
        triangle_pattern(s);
    }
    else if(choice==3)
    {
        System.out.print("Enter the Inverted Triangle pattern size: ");
        int s=sc.nextInt();
        Invtri(s);
    }
    else if(choice==4)
    {
        System.out.print("Enter the Reverse triangle pattern size: ");
        int s=sc.nextInt();
        revtri(s);
    }
    else if(choice==5)
    {
        break;

    }
    else 
    {
        System.out.println("Invalid Option ");
    }
}
   }
    
}