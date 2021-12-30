
public class Testing {

	public static void main(String[] args) {
		
		// take student object
		Student s1 = new Student("Mohamed Hassan Fathy", "32524588755441", "152024586", "MO@gmail.com");
		s1.setGpa(1.55);
		s1.setAddress("Read Streat");
		s1.setAge(19);
		System.out.println(s1);
		System.out.println("*************************************************************************");
		
		//take administrator object
		Adminnistrator a1 = new Adminnistrator("Mostafa Fathy", "30201584588552", "111-11-1111");
		a1.setAddress("Helaly");
		a1.setAge(20);
		a1.setBaseSalary(1600);
		a1.setDepartment("Computer Sience");
		a1.setNumberOfOfficers(10);
		a1.setWorkDays(5);
		System.out.println(a1);
		System.out.println("*************************************************************************");

		//take worker object
		Worker w1 = new Worker("Big Ramy", "20505487841225", "222-22-2222");
		w1.setAddress("Nemis");
		w1.setAge(21);
		w1.setBaseSalary(1600);
		w1.setDepartment("Computer Sience");
		w1.setWorkDays(6);
		System.out.println(w1);
		System.out.println("*************************************************************************");
		
		//take technical object
		Technical t1 = new Technical("Ferjane Sasi", "20541258745559", "333-33-3333");
		t1.setAddress("Golta");
		t1.setAge(22);
		t1.setBaseSalary(1600);
		t1.setWorkDays(6);
		t1.setFloorNumber(3);
		t1.setLabsNumber(6);
		System.out.println(t1);
		System.out.println("*************************************************************************");
		
		//take Instructor object
		Instructor i1 = new Instructor("Mo Salah", "32458745622558", "444-44-4444", "Computer Science");
		i1.setAddress("City");
		i1.setAge(23);
		i1.setBaseSalary(1600);
		i1.setWorkDays(6);
		i1.setHours(15);
		System.out.println(i1);
		System.out.println("*************************************************************************");
	}

}

//////////////////////////////////////////////////////////////
/*      The output: 

The data of this Person object:
Name: Mohamed Hassan Fathy
Age: 19
National number: 32524588755441
Address: Read Streat

The data of this object from class Student:
Gpa: 1.55
Academic number: 152024586
Academic mail: MO@gmail.com
*************************************************************************
The data of this Person object:
Name: Mostafa Fathy
Age: 20
National number: 30201584588552
Address: Helaly

This staff object has:
Login security number: 111-11-1111
Number of work days: 5
Base salary: 1600.00

The data of this object of Administrator class is:
The number of officers: 10
The department: Computer Sience
*************************************************************************
The data of this Person object:
Name: Big Ramy
Age: 21
National number: 20505487841225
Address: Nemis

This staff object has:
Login security number: 222-22-2222
Number of work days: 6
Base salary: 1600.00

This worker  object has
The department: Computer Sience
The total salary: 1660.00
*************************************************************************
The data of this Person object:
Name: Ferjane Sasi
Age: 22
National number: 20541258745559
Address: Golta

This staff object has:
Login security number: 333-33-3333
Number of work days: 6
Base salary: 1600.00

This technical object has: 
The floor number: 3
Number of labs: 6
Total salary: 1720.00
*************************************************************************
The data of this Person object:
Name: Mo Salah
Age: 23
National number: 32458745622558
Address: City

This staff object has:
Login security number: 444-44-4444
Number of work days: 6
Base salary: 1600.00

This instructor object has:
Department: Computer Science
Hours: 15
Total salary: 2050.00
*************************************************************************

*/