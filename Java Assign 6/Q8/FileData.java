import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileData {

    public static void main(String[] args) {
        File f = new File("poem.txt");
        if(f.exists())
        {
            System.out.println("\nFile Exists.");
        }
        else
        {
            System.out.println("\nFile does not Exist.");
        }
        System.out.println("Absolute Path: "+f.getAbsolutePath());
        System.out.println("File Size: "+String.valueOf(f.length()));
        if(f.canRead())
        {
            System.out.println("\nFile is readable.");
        }
        else
        {
            System.out.println("\nFile is not readable.");
        }
        if(f.canWrite())
        {
            System.out.println("\nFile is writable.");
        }
        else
        {
            System.out.println("\nFile is not writable.");
        }
        System.out.println("File Name: "+f.getName());
        System.out.println("Last Modified: "+String.valueOf(f.lastModified()));
        System.out.println("Parent Directory: "+f.getParent());
        
        //Creating a File
        f = new File("/home/devz/Desktop/Java Assign 6/newFolder");
        if(f.mkdir())
        {
            System.out.println("\nDirectory Created.");
        }
        else
        {
            System.out.println("\nDirectory Not Created.");
        }
        try {
            FileWriter myWriter = new FileWriter("newFolder/newFile.txt");
            myWriter.write("File made");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
