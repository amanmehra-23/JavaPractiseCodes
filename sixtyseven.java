/*. Create a Student class as follows. Student
Properties: id, name,sem1Marks, sem2Marks
Methods:readData(), CalResult()
Create an object of Student class and invoke methods such as readData() and calResult(). Then delete the object using System.gc() function call and print the message “Object has been deleted”.
*/

import java.util.*;
class Student
{
	int id;
	int sem1_marks,sem2_marks;
	String name;
	void readData()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Student name: ");
		name=Sc.nextLine();
		System.out.println("Student ID: ");
		id=Sc.nextInt();
		System.out.println("Sem1-Marks: ");
		sem1_marks=Sc.nextInt();
		System.out.println("Sem2 Marks: ");
		sem2_marks=Sc.nextInt();
	}
	void displayData()
	{
		System.out.println("Student name: "+name);
		System.out.println("Student ID: "+id);
		System.out.println("Total marks: "+(sem1_marks+sem2_marks));
	}
}


class Main
{
	public static void main(String args[])
	{
	Student stu1=new Student();
	stu1.readData();
	stu1.displayData();
	stu1=null;
	System.gc();
	System.out.println("Object has been deleted!");
}
}
