package Q10;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
 
public class EOFExceptions
{
    public void checkEOF()
    {
        File file = new File("studentData.txt");
        DataInputStream dataInputStream =  null;
        try
        {
            dataInputStream = new DataInputStream(new FileInputStream(file));
            while(true)
            {
                dataInputStream.readInt();  
            }           
        }
        catch (EOFException eofException)
        {           
            eofException.printStackTrace();
        }
        catch (IOException ioException)
        {
            ioException.printStackTrace();
        }
        finally
        {
            try{
                if (dataInputStream != null)
                {
                    dataInputStream.close();
                }
            }
            catch (IOException ioException)
            {
                ioException.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        EOFExceptions example = new EOFExceptions();
        example.checkEOF();
    }
}