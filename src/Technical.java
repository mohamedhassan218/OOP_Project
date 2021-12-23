
public class Technical extends Staff 
{
	private int floorNumber;
	private int labsNumber;

	
	// constructor
	public Technical(String fullName, String nationalNumber, String loginSecurityNumber) 
	{
		super(fullName, nationalNumber, loginSecurityNumber);
	}
	
		
	//set the floor number
	public void setFloorNumber(int floorNumber)
	{
		if (floorNumber > 4 || floorNumber < 1)
		{
			throw new IllegalArgumentException("The floor should be >= 1 and <= 4!");
		}
		this.floorNumber = floorNumber;
   	}
		
		
	//get the floor number where the technical work
	public int getFloorNumber ()
	{
		return floorNumber ;	
	}
	
		
	//set the number of labs
	public void setLabsNumber(int labsNumber)
	{
		if (labsNumber > 6 || labsNumber < 0)
		{
			throw new IllegalArgumentException("The number of labs must be >= 0 and <= 6");
		}
		this.labsNumber = labsNumber;
	}
	
	
	//get the number of labs
	public int getLabsNumber()
	{
		return labsNumber;
	}

	
	// implementation to the abstract method from the super class (required)
	@Override
	public float getTotalSalary()
	{
		return getBaseSalary() + (getWorkDays() * 20);
	}

	
	@Override
	public String toString()
	{
		return String.format("%s%n%n%s%n%s: %d%n%s: %d%n%s: %.2f", super.toString(), "This technical object has: ", "The floor number", getFloorNumber(), "Number of labs", getLabsNumber(), "Total salary", getTotalSalary());
	}

}
