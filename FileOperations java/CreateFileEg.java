import java.io.File;
import java.io.FileWriter;
public class CreateFileEg{
    public static void main(String[] args) {
        try{
            File file = new File("example.txt");
            if(file.createNewFile())
            {
                System.out.println("File Created: "+file.getName());
                FileWriter writer = new FileWriter(file);
                writer.write("The java is OOPS Language");
                writer.close();
                System.out.println("The Message is added to the file");
            }
            else
            {
                System.out.println("Already file exist");
            }
        }
        catch(Exception e)
        {
            System.out.println("The file Occured an Error");
        }

    }


}