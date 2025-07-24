//Implement a simple class with getters and setters for encapsulation
package JavaAssignment;

class Info 
{
	private int id;
	private String name;
	private String address;

	// Setter methods
	public void setId(int id) 
	{
		this.id = id;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	// Getter methods
	public int getId()
	{
		return id;
	}

	public String getName() 
	{
		return name;
	}

	public String getAddress() 
	{
		return address;
	}
}

public class A010_GettersSetters
{
	public static void main(String[] args) 
	{
		Info obj = new Info();
		
		// Setting values using setters
		obj.setId(1);
		obj.setName("Harshani Patil");
		obj.setAddress("Surat");

		// Getting values using getters
		System.out.println("ID: " + obj.getId());
		System.out.println("Name: " + obj.getName());
		System.out.println("Address: " + obj.getAddress());
	}
}
