/*Create an abstract class named Person. Define an abstract method called displayInfo(). Create two subclasses Student and Teacher that extend the Person class. Implement the displayInfo() method in each subclass to display the information of a student and a
teacher, respectively.*/

import java.util.*;

abstract class Person
{
	abstract void displayInfo();
}

class Student extends Person
{
	void displayInfo()
	{
		System.out.println("NAme: Aman Mehra");
		System.out.println("Branch: CSE(DS)");
		System.out.println("Class: D1");
		System.out.println("Rollno D011");
		System.out.println("SAP: 60009220216");
	}
}

class Teacher extends Person
{
	void displayInfo()
	{
		System.out.println("Name: Jay Singh ");
		System.out.println("Branch: CSE(DS)");
		System.out.println("Class: D1");
		System.out.println("Subject: Math");
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Select 1]Student 2]Teacher ");
		int choice=Sc.nextInt();
		if (choice==1)
		{
			System.out.println("The details are: ");
			Student st=new Student();
			st.displayInfo();
		}
		else if(choice==2)
		{

			System.out.println("The details are: ");
			Teacher t=new Teacher();
			t.displayInfo();	
		}
	}
}