import java.util.ArrayList;
import java.util.Scanner;
public class Test 
{
	public static void main(String[] args) 
	{
		ArrayList<Person> mainMethod = new ArrayList<Person>();
		char key ;
		char continuetyVariable = 1;
		
		//student attributes
		String studentName;
		String studentNationalNumber;
		int studentAge;
		String studentAddress;
		double studentGpa;
		String studentAcadimicNumber;
		String studentAcadimicMail;
		
		//worker attributes
		String workerName;
		String workerNationalNumber;
		int workerAge;
		String workerAddress;
		String workerLoginSecurityNumber;
		int workerWorkDays;
		float workerSalary;
		String workerDepartment;			
		
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
		
		//administrator attributes
		String administratorName;
		String administratorNationalNumber;
		int administratorAge;
		String administratorAddress;
		String administratorLoginSecurityNumber;
		int administratorWorkDays;
		float administratorSalary;
		String administratorDepartment;
		int administratorNumberOfOfficers;
			
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
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi user, enter the number to add an object accroding to the next simple guide lines:");
		while(continuetyVariable == 1)
		{
			System.out.println("1 ----> to create Student object");
			System.out.println("2 ----> to create Worker object");
			System.out.println("3 ----> to create Instructor object");
			System.out.println("4 ----> to create Administrator object");
			System.out.println("5 ----> to create Technical object");
			key = input.next().charAt(0);
			if(key == '1')
			{
				System.out.println("Enter the student name");
				studentName = input.nextLine();
				System.out.println("-------------------------------");
				System.out.println("Enter the student national number");
				studentNationalNumber= input.nextLine();
				System.out.println("-------------------------------");
				System.out.println("Enter the student age");
				studentAge= input.nextInt();
				System.out.println("-------------------------------");
				System.out.println("Enter the student address");
				studentAddress = input.nextLine();
				System.out.println("-------------------------------");
				System.out.println("Enter the student gpa");
				studentGpa= input.nextDouble();
				System.out.println("-------------------------------");
				System.out.println("Enter the student acadimic number");
				studentAcadimicNumber = input.nextLine();
				System.out.println("-------------------------------");
				System.out.println("Enter the student acadimic mail");
				studentAcadimicMail = input.nextLine();
				System.out.println("-------------------------------");
				Student s1 = new Student(studentName, studentNationalNumber, studentAcadimicNumber, studentAcadimicMail);
				s1.setAddress(studentAddress);
				s1.setAge(studentAge);
				s1.setGpa(studentGpa);
				mainMethod.add(s1);
				System.out.println("Do you to add another Person? if yes press 1 else press any char");
				continuetyVariable = input.next().charAt(0);
			}
			if(key == '2')
			{
				System.out.println("Enter the worker name");
				workerName = input.nextLine();
				System.out.println("Enter the worker national number");
				workerNationalNumber= input.nextLine();
				System.out.println("Enter the worker age");
				workerAge= input.nextInt();
				System.out.println("Enter the worker address");
				workerAddress = input.nextLine();
				System.out.println("Enter the worker department");
				workerDepartment= input.nextLine();
				System.out.println("Enter the worker login security number");
				workerLoginSecurityNumber = input.nextLine();
				System.out.println("Enter the worker work days");
				workerWorkDays = input.nextInt();
				System.out.println("Enter the worker salary");
				workerSalary= input.nextFloat();
				Worker w1 = new Worker(workerName, workerNationalNumber, workerLoginSecurityNumber);
				w1.setAddress(workerAddress);
				w1.setAge(workerAge);
				w1.setBaseSalary(workerSalary);
				w1.setDepartment(workerDepartment);
				w1.setWorkDays(workerWorkDays);
				mainMethod.add(w1);
				System.out.println("Do you to add another Person? if yes press 1 else press any char");
				continuetyVariable = input.next().charAt(0);
			}
			if(key == '3')
			{
				System.out.println("Enter the instructor name");
				instructorName = input.nextLine();
				System.out.println("Enter the instructor national number");
				instructorNationalNumber= input.nextLine();
				System.out.println("Enter the instructor age");
				instructorAge= input.nextInt();
				System.out.println("Enter the instructor address");
				instructorAddress = input.nextLine();
				System.out.println("Enter the instructor login security number");
				instructorLoginSecurityNumber = input.nextLine();
				System.out.println("Enter the instructor department");
				instructorDepartment= input.nextLine();
				System.out.println("Enter the worker work days");
				instructorWorkDays = input.nextInt();
				System.out.println("Enter the instructor salary");
				instructorSalary = input.nextFloat();
				System.out.println("Enter the instructor work hours");
				instructorWorkHours = input.nextInt();
				Instructor i1 = new Instructor(instructorName, instructorNationalNumber, instructorLoginSecurityNumber, instructorDepartment);
				i1.setAddress(instructorAddress);
				i1.setAge(instructorAge);
				i1.setBaseSalary(instructorSalary);
				i1.setHours(instructorWorkHours);
				i1.setWorkDays(instructorWorkDays);
				mainMethod.add(i1);
				System.out.println("Do you to add another Person? if yes press 1 else press any char");
				continuetyVariable = input.next().charAt(0);
			}
				
		}
					
			
			
			

			
			

	}

}



