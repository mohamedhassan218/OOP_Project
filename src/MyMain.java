
import java.util.Scanner;
import java.util.ArrayList;

public class MyMain 
{
	
	
	
	public static void main(String[] args) 
	{
		ArrayList<Person> persons = new ArrayList<Person>();

		char personType;
		char taskType;
		boolean whileKey = true;
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
		{
			System.out.println("Hi user, please select a number!");
			System.out.println("1 ---> Student");
			System.out.println("2 --> Instructor");
			System.out.println("3 --> Technician");
			System.out.println("4 --> Worker");
			System.out.println("5 --> Administrator");
			personType = input.next().charAt(0);
			if(personType == '1')
			{
				System.out.println("To add --> 1");
				System.out.println("To remove --> 2");
				System.out.println("To show information --> 3");
				System.out.println("To edit --> 4");
				System.out.println("To search --> 5");
				
				taskType = input.next().charAt(0);
				
				switch(taskType)
				{
				
				//adding
				case '1':
					System.out.print("The name: ");
					int option = input.nextInt();
					input.nextLine();
					studentName = input.nextLine();
					System.out.println();
					System.out.print("The national number: ");
					int option2 = input.nextInt();
					input.nextLine();
					studentNationalNumber = input.nextLine();
					System.out.println();
					System.out.print("The age: ");
					studentAge = input.nextInt();
					System.out.println();
					System.out.print("The address: ");
					int option3 = input.nextInt();
					input.nextLine();
					studentAddress = input.nextLine();
					System.out.println();
					System.out.print("The gpa: ");
					studentGpa = input.nextDouble();
					System.out.println();
					System.out.print("The acadimic number: ");
					int option4 = input.nextInt();
					input.nextLine();
					studentAcadimicNumber = input.nextLine();
					System.out.println();
					System.out.print("The acadimic mail: ");
					int option5 = input.nextInt();
					input.nextLine();
					studentAcadimicMail = input.nextLine();
					System.out.println();
					Student s1 = new Student(studentName, studentNationalNumber, studentAcadimicNumber, studentAcadimicMail);
					s1.setAddress(studentAddress);
					s1.setAge(studentAge);
					s1.setGpa(studentGpa);
					persons.add(s1);
					break;
				
				//removing	
				case '2':
					
					
					
					

							
				   }
			    }
		
		
		}
		
	}

}
