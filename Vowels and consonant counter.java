import java.util.*;
public class vowels{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a  String: ");
	String str=sc.nextLine();
	int vow=0,con=0;
	for(char u:str.toCharArray())
	{
		if("AEIOUaeiou".indexOf(u) != -1)
		{
			vow++;
		}
		if("AEIOUaeiou".indexOf(u) == -1 && u!=' ')
		{
			con++;
		}
	}
	System.out.println("The no. vowels in the given String is: "+vow);
	System.out.println("The no. Consonants in the given String is: "+con);
	}
}
