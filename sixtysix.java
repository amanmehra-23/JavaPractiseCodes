/*Create an Employee class as follows. Employee
Properties: code, name,salary
Methods:readData(), displayData()
Create an object of Employee class and invoke methods such as readData() and displayData(). Then delete the object using System.gc() function call and print the message “Object has been deleted”.
*/

import java.util.*;
class Employee
{
	int code;
	String name;
	int salary;
	void readData()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Employee name:");
		name=Sc.nextLine();
		System.out.println("Employee code:");
		code=Sc.nextInt();

	}
	void displayData()
	{
		salary=100000;
		System.out.println("Employee name: "+name);
		System.out.println("Employee code: "+code);
		System.out.println("Employee salary: $"+salary);

	}
}

class Main
{
	public static void main(String args[])
	{
		Employee emp=new Employee();
		emp.readData();
		emp.displayData();
		emp=null;
		System.gc();
		
		System.out.println("Object has been deleted!");
	}
}