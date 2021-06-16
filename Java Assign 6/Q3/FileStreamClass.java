import java.io.IOException;
import java.io.FileInputStream;

public class FileStreamClass {

    public static void main(String[] args) {

        try{
            FileInputStream fis = null;
        int i = 0;
        char c;
        byte[] bs = new byte[4];

        try {
            fis = new FileInputStream("/home/devz/Desktop/Java Assign 6/Q3/poem.txt");
            i = fis.read(bs, 2, 1);
            System.out.println("Number of bytes read: " + i);
            System.out.print("Bytes read: ");
            for (byte b : bs) {
                c = (char) b;
                if (b == 0)
                    c = '-';
                System.out.print(c);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fis != null)
                fis.close();
        }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        System.out.println();
    }

}
