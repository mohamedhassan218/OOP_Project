
import java.util.Scanner;
import java.util.ArrayList;

public class MyMain 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Adminnistrator> adminnistrators = new ArrayList<Adminnistrator>();
		ArrayList<Instructor> instructors = new ArrayList<Instructor>();
		ArrayList<Worker> workers = new ArrayList<Worker>();
		ArrayList<Technical> technicals = new ArrayList<Technical>();

		char personType;
		char taskType;
		boolean whileKey = true;
		int whileKeyInt;
		
		//student attributes
		String studentName;
		String studentNationalNumber;
		int studentAge;
		String studentAddress;
		double studentGpa;
		String studentAcadimicNumber;
		String studentAcadimicMail;
		
		Scanner input = new Scanner(System.in);
		
		
		while(whileKey) 
		{// start of while loop
			
			System.out.println("Hi user, please select a number!");
			System.out.println("1 ---> Student");
			System.out.println("2 --> Instructor");
			System.out.println("3 --> Technician");
			System.out.println("4 --> Worker");
			System.out.println("5 --> Administrator");
			
			personType = input.next().charAt(0);
			
			if(personType == '1')                         //Student
			{// start of student
				
				System.out.println("To add --> 1");
				System.out.println("To remove --> 2");
				System.out.println("To show information --> 3");
				System.out.println("To edit --> 4");
				System.out.println("To search --> 5");
				
				taskType = input.next().charAt(0);
				
				switch(taskType)
				{// start of student tasks
				
				//adding
				case '1':
					try 
					{
						System.out.print("The name: ");
						input.nextLine();
						studentName = input.nextLine();
						System.out.print("The national number: ");
						studentNationalNumber = input.nextLine();
						System.out.print("The age: ");
						studentAge = input.nextInt();
						System.out.print("The address: ");
						input.nextLine();
						studentAddress = input.nextLine();
						System.out.print("The gpa: ");
						studentGpa = input.nextDouble();
						System.out.print("The acadimic number: ");
						input.nextLine();
						studentAcadimicNumber = input.nextLine();
						System.out.print("The acadimic mail: ");
						studentAcadimicMail = input.nextLine();
						Student s1 = new Student(studentName, studentNationalNumber, studentAcadimicNumber, studentAcadimicMail);
						s1.setAddress(studentAddress);
						s1.setAge(studentAge);
						s1.setGpa(studentGpa);
						students.add(s1);					
					}
					catch(Exception e)
					{
						System.out.println("Invalid Data");
					}
					
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
				
					
				//removing	
				case '2':
					try
					{
						System.out.println("Enter the national number of the student who you want to remove: ");
						String sNationalNumber = input.next();
						for(int i =0; i < students.size(); i++)
						{
							Student x = students.get(i);
							if(x.getNationalNumber() == sNationalNumber)
							{
								students.remove(x);
								break;
							}
						}
						System.out.println("Student information has been removed. ");
					}
					catch(Exception e)
					{
						System.out.println("This data isn't available!");
					}
					break;
					
					
				//Show all students
				case '3': 
					try
					{
						for(int i =0; i < students.size(); i++)
						{
							Student x = students.get(i);
							System.out.println(x);
						}
						break;
					}
					catch(Exception e)
					{
						System.out.println("This data isn't available!");
					}
					break;
					
					
				//editing	
				case '4':
					System.out.println("Enter the national number: ");
					String ssNationalNumber = input.next();
					for(int i = 0; i < students.size(); i++)
					{
						Student x = students.get(i);
						if(x.getNationalNumber() == ssNationalNumber)
						{
							try
							{ 
								System.out.println("Please enter the new name:");
								input.nextLine();
								studentName = input.nextLine();
								System.out.println("Enter the new national number:");
								studentNationalNumber = input.nextLine();
								System.out.println("Enter the new age:");
								studentAge = input.nextInt();
								System.out.println("Enter the new address:");
								input.nextLine();
								studentAddress = input.nextLine();
								System.out.println("Enter the new gpa:");
								studentGpa = input.nextDouble();
								System.out.println("Enter the new acadimic number:");
								input.nextLine();
								studentAcadimicNumber = input.nextLine();
								System.out.println("Enter the new acadimic mail:");
								studentAcadimicMail = input.nextLine();
							    x = new Student(studentName, studentNationalNumber, studentAcadimicNumber, studentAcadimicMail);
								x.setAddress(studentAddress);
								x.setAge(studentAge);
								x.setGpa(studentGpa);
								students.add(x);
								
							}
							catch(Exception e)
							{
								System.out.println("This data isn't available!");
							}
							
						}
					}
					
					break;
					
					
				// searching
				case '5':
					try
					{
						System.out.println("Enter the national number");
						String sNationalNumber = input.next();
						boolean checking = false;
						for(int i = 0; i < students.size(); i++)
						{
							Student x = students.get(i);
							if(x.getNationalNumber() == sNationalNumber)
							{
								System.out.println(x);
								checking = true;
							}
							else
							{
								checking = false;
							}
							if (checking == false)
							{
								System.out.println("This student isn't found");
							}
						}
					}
					catch(Exception e)
					{
						System.out.println("This data isn't available!");
					}
					break;
					
					default:
						System.out.println("Sorry, you entered an invalid number");
					
						
					}// end of student tasks
			    
				}//end of student
		
			}// end of while loop	

	}// end of main

}// end of class
