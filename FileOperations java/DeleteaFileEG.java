import java.util.*;
import java.io.*;
public class DeleteaFileEG {
    public static void main(String [] args)
    {
        try{

            File file = new File("example.txt");
            if(file.delete())
            {
                System.out.println("The file deleted successfully");
            }
        
        }
        catch(Exception e)
        {
            System.out.println("The file Not found");

        }

        
    }
    
}
