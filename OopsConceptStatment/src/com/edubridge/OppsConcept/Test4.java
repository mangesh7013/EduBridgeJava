/*Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.*/

package com.edubridge.OppsConcept;

class Member {
	String Name;
	int Age;
	int PhoneNumber;
	String Address;
	int Salary;
	
	void printsalary() {
		System.out.println("The salary of :"+ Name+ " Is Salaryis "+ Salary);
	}
	
	
}
 class Employee extends Member{
	 String Specialization;
 }
 class Manager extends Member{
	 String Department;
 }

public class Test4 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Manager m1 = new Manager();
		
		e1.Name = "Mangesh";
		e1.Age=22;
		e1.PhoneNumber= 845495;
		e1.Address="Thane";
		e1.Salary=22500;
		
		e1.printsalary();
		
		System.out.println(e1.Name+e1.Age+e1.Address+e1.PhoneNumber+e1.Salary);
		

	}

}
