import java.util.ArrayList;

public class Adminnistrator 
{
	private int numberOfOfficers;
	public ArrayList<String> officers = new ArrayList<String>();
	private String department;
	
	// non-argument constructor
	public Adminnistrator()
	{
		
	}
	
	
	// constructor with arguments
	public Adminnistrator(int numberOfOfficers,  String departmant)
	{
		if (numberOfOfficers  < 5 )
		{
			throw new IllegalArgumentException("You should have at least five officers under your resposability!");
		}
		this.numberOfOfficers = numberOfOfficers;
		this.department = departmant;
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
	
	
	
	
	
	
	
	
	
	

}
