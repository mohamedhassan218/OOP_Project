
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
		
		//instructor attributes
		String instructorName;
		String instructorNationalNumber;
		int instructorAge;
		String instructorAddress;
		String instructorLoginSecurityNumber;
		int instructorWorkDays;
		float instructorSalary;
		String instructorDepartment;
		int instructorWorkHours;
		
		//technical attributes
		String technicalName;
		String technicalNationalNumber;
		int technicalAge;
		String technicalAddress;
		String technicalLoginSecurityNumber;
		int technicalWorkDays;
		float technicalSalary;
		int technicalFloorNumber;
		int technicalLabsNumber;
		
		//worker attributes
		String workerName;
		String workerNationalNumber;
		int workerAge;
		String workerAddress;
		String workerLoginSecurityNumber;
		int workerWorkDays;
		float workerSalary;
		String workerDepartment;
		
		
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
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
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
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
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
								// user can't edit name, national number, academic number or academic mail
								System.out.println("Enter the new age:");
								studentAge = input.nextInt();
								System.out.println("Enter the new address:");
								input.nextLine();
								studentAddress = input.nextLine();
								System.out.println("Enter the new gpa:");
								studentGpa = input.nextDouble();
								x.setAddress(studentAddress);
								x.setAge(studentAge);
								x.setGpa(studentGpa);
								students.add(x);
								break;
							}
							catch(Exception e)
							{
								System.out.println("This data isn't available!");
							}		
						}
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
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
					}catch(Exception e)
					{
						System.out.println("This data isn't available!");
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
					
					default:
						System.out.println("Sorry, you entered an invalid number");
					
						
					}// end of student tasks
			    
				}//end of student
			
			if(personType == '2')                         //Instructor
			{// start of instructor
				
				System.out.println("To add --> 1");
				System.out.println("To remove --> 2");
				System.out.println("To show information --> 3");
				System.out.println("To edit --> 4");
				System.out.println("To search --> 5");
				
				taskType = input.next().charAt(0);
				
				switch(taskType)
				{// start of instructor tasks
				
				//adding
				case '1':
					try 
					{
						System.out.print("The name: ");
						input.nextLine();
						instructorName = input.nextLine();
						System.out.print("The national number: ");
						instructorNationalNumber = input.nextLine();
						System.out.print("The login security number: ");
						instructorLoginSecurityNumber = input.next();
						System.out.print("The department: ");
						input.nextLine();
						instructorDepartment = input.nextLine();
						System.out.print("The age: ");
						instructorAge = input.nextInt();
						System.out.print("The address: ");
						input.nextLine();
						instructorAddress = input.nextLine();
						System.out.print("The hours: ");
						instructorWorkHours = input.nextInt();
						System.out.print("The salary: ");
						instructorSalary = input.nextFloat();
						System.out.print("The work days: ");
						input.nextLine();
						instructorWorkDays = input.nextInt();
						Instructor i1 = new Instructor(instructorName, instructorNationalNumber, instructorLoginSecurityNumber, instructorDepartment);
						i1.setAddress(instructorAddress);
						i1.setAge(instructorAge);
						i1.setHours(instructorWorkHours);
						i1.setWorkDays(instructorWorkDays);
						i1.setBaseSalary(instructorSalary);
						instructors.add(i1);					
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
						System.out.println("Enter the national number of the instructor who you want to remove: ");
						String iNationalNumber = input.next();
						for(int i =0; i < instructors.size(); i++)
						{
							Instructor x = instructors.get(i);
							if(x.getNationalNumber() == iNationalNumber)
							{
								instructors.remove(x);
								break;
							}
						}
						System.out.println("Instructor information has been removed. ");
					}
					catch(Exception e)
					{
						System.out.println("This data isn't available!");
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
					
					
				//Show all students
				case '3': 
					try
					{
						for(int i =0; i < instructors.size(); i++)
						{
							Instructor x = instructors.get(i);
							System.out.println(x);
						}
						break;
					}
					catch(Exception e)
					{
						System.out.println("This data isn't available!");
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
					
					
				//editing	
				case '4':
					System.out.println("Enter the national number: ");
					String iNationalNumber = input.next();
					for(int i = 0; i < instructors.size(); i++)
					{
						Instructor x = instructors.get(i);
						if(x.getNationalNumber() == iNationalNumber)
						{
							try
							{ 
								// user can't edit name, national number, department or login security number
								System.out.println("Enter the new age:");
								instructorAge = input.nextInt();
								System.out.println("Enter the new address:");
								input.nextLine();
								instructorAddress = input.nextLine();
								System.out.println("Enter the new salary:");
								instructorSalary = input.nextFloat();
								System.out.println("Enter the new work days:");
								instructorWorkDays= input.nextInt();
								System.out.println("Enter the new work hours:");
								instructorWorkHours= input.nextInt();
								x.setAddress(instructorAddress);
								x.setAge(instructorAge);
								x.setBaseSalary(instructorSalary);
								x.setHours(instructorWorkHours);
								x.setWorkDays(instructorWorkDays);
								instructors.add(x);
								break;
							}
							catch(Exception e)
							{
								System.out.println("This data isn't available!");
							}		
						}
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
					
					
				// searching
				case '5':
					try
					{
						System.out.println("Enter the national number");
						String iiNationalNumber = input.next();
						boolean checking = false;
						for(int i = 0; i < instructors.size(); i++)
						{
							Instructor x = instructors.get(i);
							if(x.getNationalNumber() == iiNationalNumber)
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
								System.out.println("This instructor isn't found");
							}
						}
					}catch(Exception e)
					{
						System.out.println("This data isn't available!");
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
					
					default:
						System.out.println("Sorry, you entered an invalid number");
						}// end of instructor tasks
			    
				}//end of instructor
			
			if(personType == '3')                         //Technician
			{// start of technician
				
				System.out.println("To add --> 1");
				System.out.println("To remove --> 2");
				System.out.println("To show information --> 3");
				System.out.println("To edit --> 4");
				System.out.println("To search --> 5");
				
				taskType = input.next().charAt(0);
				
				switch(taskType)
				{// start of technician tasks
				
				//adding
				case '1':
					try 
					{
						System.out.print("The name: ");
						input.nextLine();
						technicalName = input.nextLine();
						System.out.print("The national number: ");
						technicalNationalNumber = input.nextLine();
						System.out.print("The login security number: ");
						technicalLoginSecurityNumber = input.next();
						System.out.print("The labs number: ");
						//input.nextLine();
						technicalLabsNumber = input.nextInt();
						System.out.print("The age: ");
						technicalAge = input.nextInt();
						System.out.print("The address: ");
						input.nextLine();
						technicalAddress = input.nextLine();
						System.out.print("The floor number: ");
						technicalFloorNumber = input.nextInt();
						System.out.print("The salary: ");
						technicalSalary = input.nextFloat();
						System.out.print("The work days: ");
						input.nextLine();
						technicalWorkDays = input.nextInt();
						Technical t1 = new Technical(technicalName, technicalNationalNumber, technicalLoginSecurityNumber);
						t1.setAddress(technicalAddress);
						t1.setAge(technicalAge);
						t1.setFloorNumber(technicalFloorNumber);
						t1.setWorkDays(technicalWorkDays);
						t1.setBaseSalary(technicalSalary);
						t1.setLabsNumber(technicalLabsNumber);
						technicals.add(t1);					
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
						System.out.println("Enter the national number of the technical who you want to remove: ");
						String tNationalNumber = input.next();
						for(int i =0; i < technicals.size(); i++)
						{
							Technical x = technicals.get(i);
							if(x.getNationalNumber() == tNationalNumber)
							{
								technicals.remove(x);
								break;
							}
						}
						System.out.println("Technical information has been removed. ");
					}
					catch(Exception e)
					{
						System.out.println("This data isn't available!");
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
					
					
				//Show all students
				case '3': 
					try
					{
						for(int i =0; i < technicals.size(); i++)
						{
							Technical x = technicals.get(i);
							System.out.println(x);
						}
						break;
					}
					catch(Exception e)
					{
						System.out.println("This data isn't available!");
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
					
					
				//editing	
				case '4':
					System.out.println("Enter the national number: ");
					String tNationalNumber = input.next();
					for(int i = 0; i < technicals.size(); i++)
					{
						Technical x = technicals.get(i);
						if(x.getNationalNumber() == tNationalNumber)
						{
							try
							{ 
								// user can't edit name, national number or login security number
								System.out.println("Enter the new age:");
								technicalAge = input.nextInt();
								System.out.println("Enter the new address:");
								input.nextLine();
								technicalAddress = input.nextLine();
								System.out.println("Enter the new salary:");
								technicalSalary = input.nextFloat();
								System.out.println("Enter the new work days:");
								technicalWorkDays= input.nextInt();
								System.out.println("Enter the new floor number:");
								technicalFloorNumber = input.nextInt();
								System.out.println("Enter the new labs number:");
								technicalLabsNumber = input.nextInt();
								x.setAddress(technicalAddress);
								x.setAge(technicalAge);
								x.setBaseSalary(technicalSalary);
								x.setWorkDays(technicalWorkDays);
								x.setLabsNumber(technicalLabsNumber);
								x.setFloorNumber(technicalFloorNumber);								
								technicals.add(x);
								break;
							}
							catch(Exception e)
							{
								System.out.println("This data isn't available!");
							}		
						}
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
					
					
				// searching
				case '5':
					try
					{
						System.out.println("Enter the national number");
						String ttNationalNumber = input.next();
						boolean checking = false;
						for(int i = 0; i < technicals.size(); i++)
						{
							Technical x = technicals.get(i);
							if(x.getNationalNumber() == ttNationalNumber)
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
								System.out.println("This technical isn't found");
							}
						}
					}catch(Exception e)
					{
						System.out.println("This data isn't available!");
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
					
					default:
						System.out.println("Sorry, you entered an invalid number");
						}// end of technician tasks
			    
				}//end of technician
			
			if(personType == '4')                         //Worker
			{// start of worker
				
				System.out.println("To add --> 1");
				System.out.println("To remove --> 2");
				System.out.println("To show information --> 3");
				System.out.println("To edit --> 4");
				System.out.println("To search --> 5");
				
				taskType = input.next().charAt(0);
				
				switch(taskType)
				{// start of worker tasks
				
				//adding
				case '1':
					try 
					{
						System.out.print("The name: ");
						input.nextLine();
						workerName = input.nextLine();
						System.out.print("The national number: ");
						workerNationalNumber = input.nextLine();
						System.out.print("The login security number: ");
						workerLoginSecurityNumber = input.next();
						System.out.print("The department: ");
						//input.nextLine();
						workerDepartment = input.next();
						System.out.print("The age: ");
						workerAge = input.nextInt();
						System.out.print("The address: ");
						input.nextLine();
						workerAddress = input.nextLine();
						System.out.print("The salary: ");
						workerSalary = input.nextFloat();
						System.out.print("The work days: ");
						input.nextLine();
						workerWorkDays = input.nextInt();
						Worker w1 = new Worker(workerName, workerNationalNumber, workerLoginSecurityNumber);
						w1.setAddress(workerAddress);
						w1.setAge(workerAge);
						w1.setWorkDays(workerWorkDays);
						w1.setDepartment(workerDepartment);
						w1.setBaseSalary(workerSalary);
						workers.add(w1);					
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
						System.out.println("Enter the national number of the technical who you want to remove: ");
						String tNationalNumber = input.next();
						for(int i =0; i < technicals.size(); i++)
						{
							Technical x = technicals.get(i);
							if(x.getNationalNumber() == tNationalNumber)
							{
								technicals.remove(x);
								break;
							}
						}
						System.out.println("Technical information has been removed. ");
					}
					catch(Exception e)
					{
						System.out.println("This data isn't available!");
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
					
					
				//Show all students
				case '3': 
					try
					{
						for(int i =0; i < technicals.size(); i++)
						{
							Technical x = technicals.get(i);
							System.out.println(x);
						}
						break;
					}
					catch(Exception e)
					{
						System.out.println("This data isn't available!");
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
					
					
				//editing	
				case '4':
					System.out.println("Enter the national number: ");
					String tNationalNumber = input.next();
					for(int i = 0; i < technicals.size(); i++)
					{
						Technical x = technicals.get(i);
						if(x.getNationalNumber() == tNationalNumber)
						{
							try
							{ 
								// user can't edit name, national number or login security number
								System.out.println("Enter the new age:");
								technicalAge = input.nextInt();
								System.out.println("Enter the new address:");
								input.nextLine();
								technicalAddress = input.nextLine();
								System.out.println("Enter the new salary:");
								technicalSalary = input.nextFloat();
								System.out.println("Enter the new work days:");
								technicalWorkDays= input.nextInt();
								System.out.println("Enter the new floor number:");
								technicalFloorNumber = input.nextInt();
								System.out.println("Enter the new labs number:");
								technicalLabsNumber = input.nextInt();
								x.setAddress(technicalAddress);
								x.setAge(technicalAge);
								x.setBaseSalary(technicalSalary);
								x.setWorkDays(technicalWorkDays);
								x.setLabsNumber(technicalLabsNumber);
								x.setFloorNumber(technicalFloorNumber);								
								technicals.add(x);
								break;
							}
							catch(Exception e)
							{
								System.out.println("This data isn't available!");
							}		
						}
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
					
					
				// searching
				case '5':
					try
					{
						System.out.println("Enter the national number");
						String ttNationalNumber = input.next();
						boolean checking = false;
						for(int i = 0; i < technicals.size(); i++)
						{
							Technical x = technicals.get(i);
							if(x.getNationalNumber() == ttNationalNumber)
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
								System.out.println("This technical isn't found");
							}
						}
					}catch(Exception e)
					{
						System.out.println("This data isn't available!");
					}
					System.out.println("If you want to exit enter '0' else enter any char!");
					whileKeyInt = input.nextInt();
					if(whileKeyInt == 0)
					{
						whileKey = false;
					}
					break;
					
					default:
						System.out.println("Sorry, you entered an invalid number");
						}// end of worker tasks
			    
				}//end of worker
			
			
			
		
			}// end of while loop	

	}// end of main

}// end of class
