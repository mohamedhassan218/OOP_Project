
public abstract class Staff extends Person
{
	private final String loginSecurityNumber;
	private int workDays;
	private float salary;
	
	// constructor with arguments
	public Staff(String fullName, String nationalNumber, String loginSecurityNumber)
	{
		super(fullName, nationalNumber);
		this.loginSecurityNumber = loginSecurityNumber;
	}
	
	//return the login security number
	public String getLoginSecurityNumber()
	{
		return loginSecurityNumber;
	}
	
	// set the work days
	public void setWorkDays(int workDays)
	{
		if (workDays > 7 || workDays < 0)
		{
			throw new IllegalArgumentException("Work days must be >= 0 and <= 7!");
		}
		this.workDays = workDays;
	}
	
	//return the work days
	public int getWorkDays()
	{
		return workDays;
	}
	
	// set the base salary
	public void setBaseSalary(float salary)
	{
		if (salary < 1000.0 || salary > 12000.0)
		{
			throw new IllegalArgumentException("The salary should be >= 1000 and <= 12000!");
		}
		this.salary = salary;
	}
	
	// return the base salary 
	public float getBaseSalary()
	{
		return salary;
	}
	
	
	// abstract method each subclass overrides it to calculate the appropriate total salary 
	//public abstract float getTotalSalary();
	
	
	@Override
	public String toString()
	{
		return String.format("%s%n%n%s%n%s: %s%n%s: %s%n%s: %.2f", super.toString(),"This staff object has:", "Login security number", getLoginSecurityNumber(), "Number of work days", getWorkDays(), "Base salary", getBaseSalary());
	}
	
	
	
	
	
	
	
	
	
	
	

}
