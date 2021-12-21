
public abstract class Person 
{
	private final String fullName;
	private int age;
	private final String nationalNumber;
	private String address;
	
	
	
	public Person(String fullName, String nationalNumber) // constructor to initialize the instance variables
	{
		this.fullName = fullName;
		this.nationalNumber = nationalNumber;
		
	} // end of constructor
	
	
	// return the name
	public String getFullName()
	{
		return fullName;
	}
	
	// set the age
	public void setAge(int age)
	{
		if (age > 60 || age < 18)
		{
			throw new IllegalArgumentException("The age must be >= 18 and <= 60!");
		}
		this.age = age;
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
	
	// set the address
	public void setAddress(String address)
	{
		this.address = address;
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
		return String.format("%s%n%s: %s%n%s: %d%n%s: %s%n%s: %s","The data of this Person object:", "Name", getFullName(),"Age",getAge(),"National number", getNationalNumber(), "Address", getAddress() );
	}
	
	
}// end of abstract class person
