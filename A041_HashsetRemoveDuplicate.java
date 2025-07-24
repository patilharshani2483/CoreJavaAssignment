// Implement a program using HashSet to remove duplicate elements from a list.
package JavaAssignment;

import java.util.ArrayList;
import java.util.HashSet;

public class A041_HashsetRemoveDuplicate 
{
    public static void main(String[] args) 
    {
        // Original list with duplicates
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Harshani");
        namesList.add("Priya");
        namesList.add("Ravi");
        namesList.add("Harshani"); // duplicate
        namesList.add("Ravi");     // duplicate
        namesList.add("Amit");

        System.out.println("Original List with duplicates:");
        System.out.println(namesList);

        // Remove duplicates using HashSet
        HashSet<String> uniqueNames = new HashSet<>(namesList);

        System.out.println("\nList after removing duplicates using HashSet:");
        System.out.println(uniqueNames);
    }
}
