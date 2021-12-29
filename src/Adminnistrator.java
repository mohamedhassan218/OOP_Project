
public class Adminnistrator extends Staff implements StaffInterface
{
	private int numberOfOfficers;
	private String department;
	
	
	
	// constructor with arguments
	public Adminnistrator(String fullName, String nationalNumber, String loginSecurityNumber )
	{
		super(fullName, nationalNumber, loginSecurityNumber);
	}
	
	
	//set the number of officers
	public void setNumberOfOfficers(int numberOfOfficers)
	{
		if (numberOfOfficers > 5 )
		{
			this.numberOfOfficers = numberOfOfficers;
		}
		else 
		{
			throw new IllegalArgumentException("You should have at least five officers under your resposability!");
		}
	}
	
	
	// return the number of officers
	public int getNumberOfOfficers()
	{
		return numberOfOfficers;
	}
	
	
	// set the department of the administrator
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	
	// return the department of the administrator
	public String getDepartment()
	{
		return department;
	}
	
	
	@Override
	public float getTotalSalary()
	{
		return 	getBaseSalary() + (getWorkDays() * 15);
	}
	
	@Override
	public String toString()
	{
		return String.format("%s%n%n%s%n%s: %d%n%s: %s", super.toString(), "The data of this object of Administrator class is:", "The number of officers", getNumberOfOfficers(), "The department", getDepartment());
	}
}
