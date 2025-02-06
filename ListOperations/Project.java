import java.util.*;


public class Project{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Add an Element to List");
            System.out.println("2.Remove the Element from the List");
            System.out.println("3.Display");
            System.out.println("4.Clear the List");
            System.out.println("5.Exit");
            System.out.print("Enter the choice: ");
            int ch = sc.nextInt();
            switch(ch)
            {

                case 1:
                {
                    System.out.print("Enter the number of elements to add in the List: ");
                    int n=sc.nextInt();
                    for(int i=0;i<n;i++)
                    {
                        System.out.print("Enter the element: ");
                        list.add(sc.nextInt());
                    }
                    System.out.println("Elements Successfully added");
                    break;
                }
                case 2:
                {
                    System.out.println("1.To Remove element from a Specfied index");
                    System.out.println("2.To Remove element by its value");
                    System.out.print("Enter Your choice for Remove: ");
                    int r = sc.nextInt();
                    if(r==1 && !list.isEmpty())
                    {
                        System.out.print("Enter the Index: ");
                        int a = sc.nextInt();
                        if(a<list.size())
                        {

                            list.remove(a);
                            System.out.println("The element at the index "+a+" is removed from the List And List is"+list);
                        }
                        else
                        {
                            System.out.println("Enter a Valid Index");
                        }

                    }
                    else if(r==2 && !list.isEmpty())
                    {
                        System.out.print("Enter the value to remove: ");
                        int a = sc.nextInt();
                        if(list.indexOf(a)!=-1)
                        {

                            list.remove(Integer.valueOf(a));
                            System.out.println("The Element "+a+" is removed from the List And the List is"+list);
                        }
                        else
                        {
                            System.out.println("Enter a valid Element to Remove");
                        }
                    }
                    else if(list.isEmpty())
                    {
                        System.out.println("The List is Empty");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("The List Elements are: "+list);
                    break;
                }
                case 4:
                {
                    list.clear();
                    System.out.println("The List is Cleared Successfully");
                    break;
                }
                case 5:
                {
                    System.out.println("Exited Successfully");
                    return;
                }
                default:
                {
                    System.out.println("Enter a valid choice...");
                }
            }

        }
        
    }
}
