package JavaAssignment;

import java.io.*;

// Serializable class
class Learner implements Serializable {
    private static final long serialVersionUID = 1L;

    int id;
    String name;
    transient String password; 

    public Learner(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

public class A039_SeriliazationDeseriliazation {
    public static void main(String[] args) {
        String filename = "learner.ser";

        // 1. Serialization
        Learner l1 = new Learner(101, "Harshani", "secret123");

        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(l1);
            out.close();
            fileOut.close();

            System.out.println("Object serialized to file: " + filename);
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
            e.printStackTrace();
        }

        // 2. Deserialization
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Learner l2 = (Learner) in.readObject();

            in.close();
            fileIn.close();

            System.out.println("Deserialized Object:");
            System.out.println("ID: " + l2.id);
            System.out.println("Name: " + l2.name);
            System.out.println("Password: " + l2.password); // Will be null
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
