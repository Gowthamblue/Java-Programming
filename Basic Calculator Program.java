import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num1,num2,op;
    num1 = sc.nextInt();
    num2 = sc.nextInt();
    while(true)
    {
        System.out.println("Enter a operation ('+' , '-' ,'*','/'): ");
         op = sc.next().charAt(0);
        if(op=='+')
        {
            System.out.println("The sum is "+(num1+num2));
        }
        else if(op=='-')
        {
            System.out.println("The sub is "+(num1-num2));
        }
        else if(op=='*')
        {
            System.out.println("The mul is "+(num1*num2));
        }
        else if(op=='/')
        {
            if(num2!=0)
            {
                System.out.println("The Divide is "+(num1/num2));
            }
            else{
                System.out.println("Zero Division Error");
            }
        }
        else if(op=='#')
        {
            break;
        }
        else{
            System.out.println("Invalid option");
        }
    }
  }
}
