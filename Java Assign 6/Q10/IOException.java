package Q10;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOException {

    public static void main(String[] args) {
        try
        {
            FileInputStream in = new FileInputStream("input.txt");
            System.out.println("This is not printed");
        } 
        catch (FileNotFoundException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }
    }   
}
