import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

    public static void main(String[] args) {

        ArrayList<String> requiredStrings = new ArrayList<String>();

        try {
            File myObj = new File("data.txt");
            Scanner myReader = new Scanner(myObj);
            int c = 0;
            while (myReader.hasNextLine()) {
                c++;
                String data = myReader.nextLine();
                if(c%2 == 0)
                {
                    requiredStrings.add(data);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter fw = new FileWriter("evenData.txt");
            for(String instance: requiredStrings)
            {
                fw.write(instance+"\n");
            }
            fw.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
