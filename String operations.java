import java.util.*;
class Stringoperations{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        str.append("Hello");
	System.out.println("Enter the String : "+str);
	str.append(" World");
	System.out.println("The String after appending: "+str);
	str.replace(5,6," to the ");
	System.out.println("The String after Replacing: "+str);
	str.delete(13,18);
	System.out.println("The String after Deleting : "+str);
	str.reverse();
	System.out.println("The string after Reversing :"+str);
	System.out.println("The capacity of the String is: "+str.capacity());
	System.out.println("=====End of Builder String=====");
	String str1 = " Normal String";
	System.out.println("The length of the String is : "+str1.length());
	System.out.println("The index of the a of the string is "+str1.indexOf('a'));
	System.out.println("The charAt operation is : "+str1.charAt(0));
	String str2="String ";
	System.out.println("The comparision operation : "+(str2.compareTo("String")));
	System.out.println("The compareToIgnoreCase operation : "+str2.compareToIgnoreCase("STRING"));
	System.out.println("The contains operations : "+str1.contains("mal"));
	System.out.println("The endwith operation : "+str1.endsWith("g"));
	System.out.println("The Replacing with string : "+str1.replace("Normal","Programming with Java"));
	System.out.println("The Replace all operations : "+str2.replaceAll(" ","Hello"));
	System.out.println("The Replace First operations: "+str1.replaceFirst("[N]","&"));
	System.out.println("The to lowercase :"+str2.toLowerCase());
	System.out.println("The toUpperCase funtion is: "+str2.toUpperCase());
	System.out.println("The trim function is: "+str1.trim());
	System.out.println("The number to string : "+String.valueOf(1234567));
	char[] array = str1.toCharArray();
	System.out.println("The character array is : "+ Arrays.toString(array));



	

	
	
	 




    }
}
