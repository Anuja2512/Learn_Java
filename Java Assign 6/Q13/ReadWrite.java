package Q13;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) {

        ArrayList<String> lines = new ArrayList<String>();

        try {
            File myObj = new File("test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              lines.add(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

          try {
            FileWriter myWriter = new FileWriter("test2.txt");
            for(String line:lines)
            {
                myWriter.write(line+"\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
