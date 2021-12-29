
public class Worker extends Staff implements StaffInterface
{
	private String department;
	
	// non-argument constructor
	public Worker(String fullName, String nationalNumber, String loginSecurityNumber)
	{
		super(fullName, nationalNumber, loginSecurityNumber);
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
		return String.format("%s%n%n%s%n%s: %s%n%s: %.2f", super.toString(), "This worker  object has", "The department", getDepartment(), "The total salary", getTotalSalary());
	}
}
