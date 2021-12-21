
public class Worker extends Staff
{
	private String department;
	
	// non-argument constructor
	public Worker(String fullName, String nationalNumber, String loginSecurityNumber)
	{
		super(fullName, nationalNumber, loginSecurityNumber);
	}
	
	
	// constructor with arguments
	public Worker(String fullName, String nationalNumber, String loginSecurityNumber, String department)
	{
		super(fullName, nationalNumber, loginSecurityNumber);
		this.department = department;
	}
	
	
	// to set the department where the worker work
	public void setDepartment(String department)
	{
		this.department = department ;
	}
	
	// to return the department
	public String getDepartment()
	{
		return department;
	}
	
	@Override
	public float getTotalSalary()
	{
		return getBaseSalary() + (getWorkDays() * 10);
	}
	
	@Override
	public String toString()
	{
		return String.format("%s%n%s%n%s: %s%n%s: %.2f", super.toString(), "This Staff is a worker", "The department", getDepartment(), "The total salary", getTotalSalary());
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
