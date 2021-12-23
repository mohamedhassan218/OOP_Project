
public class Instructor extends Staff
{
	private final String department;
	private int hours;
		
	//constructor
	public Instructor(String fullName, String nationalNumber, String loginSecurityNumber, String department)
	{
		super(fullName, nationalNumber, loginSecurityNumber);
		this.department = department;
	}
		
		
	// return the department
	public String getDepartment()
	{
		return department;
	}
		
		
	// set the hours & validate it 
	public void setHours(int hours)
	{
		if (hours < 0 || hours > 18)                //validate the number of hours
		{
			throw new IllegalArgumentException("The hours must be >= 0 and <= 18");
		}			
		this.hours = hours;
	}
		
		
	//return hours
	public int getHours()
	{
		return hours;
	}
	
	//overriding the abstract method in the subclass (required)
	@Override
	public float getTotalSalary()
	{
		return getBaseSalary() + (getHours() * 30);
	}
	
	
	@Override
	public String toString()
	{
		return String.format("%s%n%n%s%n%s: %s%n%s: %d%n%s: %.2f", super.toString(), "This instructor object has:", "Department", getDepartment(), "Hours", getHours(), "Total salary", getTotalSalary());
    }
	
	
	
	

}
