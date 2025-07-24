// Implement a program that reads a file line by line using BufferedReader.
package JavaAssignment;
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class A038_BufferReader 	
	{
	    public static void main(String[] args)
	    {
	        String filePath = "sample.txt"; 
	        try 
	        {
	            // Create FileReader wrapped in BufferedReader
	            BufferedReader reader = new BufferedReader(new FileReader(filePath));

	            String line;
	            System.out.println("Reading file line by line:");

	            // Read and print each line until end of file
	            while ((line = reader.readLine()) != null)
	            {
	                System.out.println(line);
	            }

	            reader.close(); 
	        } 
	        catch (IOException e) 
	        {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }

}
