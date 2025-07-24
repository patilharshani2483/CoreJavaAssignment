// Create a program that reads from one file and writes the content to another file.

package JavaAssignment;

import java.io.*;

public class A045_ReadFromOneFileAndAnotherFile 
{
    public static void main(String[] args) 
    {
        String inputFile = "C:\\Users\\ADMIN\\Desktop\\source.txt";       
        String outputFile = "C:\\Users\\ADMIN\\Desktop\\destination.txt"; 

        try 
        {
            // Create reader and writer
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) 
            {
                writer.write(line);
                writer.newLine(); 
            }

            // Close both streams
            reader.close();
            writer.close();

            System.out.println("Content copied from " + inputFile + " to " + outputFile);
        } 
        catch (IOException e) 
        {
            System.out.println("File operation error: " + e.getMessage());
        }
    }
}
