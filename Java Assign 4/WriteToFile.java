import java.util.*;
import java.io.*;
public class WriteToFile {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            FileWriter fw = new FileWriter("resourceText.txt");
            System.out.println("\n-- Write to a File --\n\n");
            System.out.print("Enter Text: ");
            String inp = sc.nextLine();
            fw.write(inp);
            fw.close();
            System.out.println("Resource File written to resourceText.txt");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
