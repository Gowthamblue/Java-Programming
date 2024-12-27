//Reverse of a Number in Java
import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner a= new Scanner(System.in);
        int num;
        num=a.nextInt();
        int temp=num;
        int sum=0;
        while(temp!=0)
        {
            int c=temp%10;
            sum=sum*10+c;
            temp/=10;
        }
        System.out.println("the Reverse of digits: "+sum);
    }
}
