
public abstract class Person 
{
	private final String fullName;
	private int age;
	private final String nationalNumber;
	private String address;
	
	public Person(String fullName, int age, String nationalNumber, String address) // constructor to initialize the instance variables
	{
		this.fullName = fullName;
		
		
		if (age < 18 || age > 60)           // validate the age
		{
			throw new IllegalArgumentException("Age must be >= 18 and <= 60!");
		}
		
		this.age = age;
		
		
		this.nationalNumber = nationalNumber;
		
		this.address = address;
	} // end of constructor
	
	
	// return the name
	public String getFullName()
	{
		return fullName;
	}
	
	// return the age 
	public int getAge()
	{
		return age;
	}
	
	// return the national number
	public String getNationalNumber()
	{
		return nationalNumber;
	}
	
	// return the address
	public String getAddress()
	{
		return address;
	}
	
	
	// overriding toString method to return appropriate string representation of Person object
	@Override
	public String toString()
	{
		return String.format("The name: %s%n%s: %d%n%s: %s%n%s: %s", getFullName(),"Age",getAge(),"National number", getNationalNumber(), "Address", getAddress() );
	}
	
	
}// end of abstract class person
