// Create a HashMap to store and retrieve key-value pairs.

package JavaAssignment;
import java.util.HashMap;
import java.util.Map;

public class A042_HashMap
{
    public static void main(String[] args) 
    {
        // Create a HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add key-value pairs
        studentMap.put(101, "Harshani");
        studentMap.put(102, "Ravi");
        studentMap.put(103, "Priya");
        studentMap.put(104, "Amit");

        // Retrieve and print all entries
        System.out.println("Student Map (ID -> Name):");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) 
        {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Retrieve a specific value using a key
        int idToFind = 102;
        String name = studentMap.get(idToFind);
        System.out.println("\nName for ID " + idToFind + ": " + name);
    }
}
