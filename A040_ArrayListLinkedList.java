// Write a program that demonstrates the use of an ArrayList and LinkedList.
package JavaAssignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class A040_ArrayListLinkedList 
{
    public static void main(String[] args) 
    {
        // 1. ArrayList example
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        System.out.println("ArrayList elements:");
        for (String lang : arrayList) 
        {
            System.out.println(lang);
        }

        // 2. LinkedList example
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("\nLinkedList elements:");
        for (String fruit : linkedList) 
        {
            System.out.println(fruit);
        }
    }
}
