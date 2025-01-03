import java.util.*;
import java.io.*;
public class Readafile {
    public static void main(String[] args) {
        try{
            File file = new File("example.txt");
            Scanner sc =new Scanner(file);
            while(sc.hasNextLine())
            {
                String s =sc.nextLine();
                System.out.println(s);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found error occured");
    }
}
}
    

