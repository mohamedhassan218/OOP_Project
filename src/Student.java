
public class Student extends Person 
{
	private double gpa;
	private final String   academicNumber;
	private final String academicMail;
	

    
    // constructor with arguments
    public Student (String fullName, String nationalNumber, String academicNumber, String academicMail)
	{
    	super(fullName, nationalNumber);            //the constructor of the subclass invokes the constructor of the superclass
		this.academicNumber = academicNumber;
		this.academicMail = academicMail;
	}


    //set the gpa of the student
    public void setGpa(double gpa)
    {
       if(gpa > 4 || gpa < 0)
       {
    	   throw new IllegalArgumentException("Gpa must be >= 0 and <= 4!");
       }
       this.gpa = gpa;
    }
    
    //return the gpa
	public double getGpa()
	{
		return gpa;
    }
	
	
    // return the  academic number
	public String getAcademicNumber()
	{
		return academicNumber;		
	}
	

    //return the  academic mail
	public String getacAcademicMail()
	{
		return academicMail;
	}

	
	//Overriding toString method to print appropriate representation of the object of type Student
	@Override
	public String toString()
	{
		return String.format("%s%n%n%s%n%s: %s%n%s: %s%n%s: %s",super.toString(), "The data of this object from class Student:", "Gpa", getGpa(), "Academic number", getAcademicNumber(), "Academic mail", getacAcademicMail());
	}

}
