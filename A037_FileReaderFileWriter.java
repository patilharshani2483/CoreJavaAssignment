// Write a program to read and write content to a file using FileReader and FileWriter.
package JavaAssignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A037_FileReaderFileWriter 
{
    public static void main(String[] args) 
    {
        String filePath = "sample.txt";
        String content = "Hello, I am Harshani Patil.";

        // Writing to the file
        try 
        {
            FileWriter writer = new FileWriter(filePath);
            writer.write(content);
            writer.close();
            System.out.println("File written successfully.");
        }
        catch (IOException e)
        {
            System.out.println("An error occurred while writing: " + e.getMessage());
        }

        // Reading from the file
        try
        {
            FileReader reader = new FileReader(filePath);
            int character;
            System.out.print("File content: ");
            while ((character = reader.read()) != -1) 
            {
                System.out.print((char) character);
            }
            reader.close();
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while reading: " + e.getMessage());
        }
    }
}
