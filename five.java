/*Create an abstract class named Employee. Define an abstract method called calculateSalary(). Create two subclasses Manager and Clerk that extend the Employee class. Implement the calculateSalary() method in each subclass to calculate the salary of a manager and a clerk, respectively.*/


import java.util.*;

abstract class Employee
{
	abstract void calculateSalary();
}

class Manager extends Employee
{
	String name;
	Manager(String name)
	{
		this.name=name;
	}
	int sal=100000,bonus=25000;
	void calculateSalary()
	{
		sal=sal+bonus;
		System.out.println("The salary of "+name+" is: $"+sal);
	}
}
class Clerk extends Employee
{
	int sal=50000,bonus=5000;
	String name;
	Clerk(String name)
	{
		this.name=name;
	}
	void calculateSalary()
	{
		sal=sal+bonus;
		System.out.println("The salary of "+name+" is: $"+sal);
	}
}

class Main
{
	public static void main(String args[])
	{
		int num;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Check Salary of: \n1]Manager \n2]Clerk ");
		num=Sc.nextInt();
		
		
		if(num==1)
		{
			System.out.println("Enter name: ");
			String name=Sc.next();
			Manager m=new Manager(name);
			m.calculateSalary();
		}
		else if(num==2)
		{
			System.out.println("Enter name: ");
			String name=Sc.next();
			Clerk c=new Clerk(name);
			c.calculateSalary();
		}
	}
}