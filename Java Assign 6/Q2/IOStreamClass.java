import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamClass {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to write to the file: ");
        String line = sc.nextLine();

        try {
            FileWriter fw = new FileWriter("poem.txt");
            fw.write(line);
            fw.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
