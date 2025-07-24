// Program to copy a file using FileInputStream and FileOutputStream

package JavaAssignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A044_FileInputStreamOutputStream
{
    public static void main(String[] args) 
    {
        // Absolute paths can be used to avoid path errors during execution
        String sourcePath = "C:\\Users\\ADMIN\\Desktop\\source.txt";
        String destinationPath = "C:\\Users\\ADMIN\\Desktop\\copy.txt";

        try {
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destinationPath);

            int byteData;
            while ((byteData = fis.read()) != -1) 
            {
                fos.write(byteData);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully from " + sourcePath + " to " + destinationPath);
        } 
        catch (IOException e)
        {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}
