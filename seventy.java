/*WAP to demonstrate the following hierarchy where student class having variables Sapid, Name, and Roll no. and class science, commerce and arts will be having variables to read marks of three subject of respective scheme using readMarks() method and display result of each stream student using display() method in each subclass.
student to scince to commerce to arts
*/

import java.util.*;
class Student
{
	int sapid;
	String name;
	int rollno;
	Student(int sapid,String name,int rollno)
	{
		this.sapid=sapid;
		this.name=name;
		this.rollno=rollno;
	}

}

class Science extends Student
{
	int p,c,m;
	Science(int sapid,String name,int rollno)
	{
		super(sapid,name,rollno);
	}
	void readmarks()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Physics marks: ");
		p=Sc.nextInt();
		System.out.println("Math marks: ");
		m=Sc.nextInt();
		System.out.println("Chemistry marks: ");
		c=Sc.nextInt();
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("SAP ID : "+sapid);
		System.out.println("Roll Number "+rollno);
		System.out.println("Physics marks: "+p);
		System.out.println("Math marks: "+m);
		System.out.println("Chemistry marks: "+c);
	}

}
class Commerce extends Student
{
	int a,b,e;
	Commerce(int sapid,String name,int rollno)
	{
		super(sapid,name,rollno);
	}
	void readmarks()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Accounting marks: ");
		a=Sc.nextInt();
		System.out.println("Bussiness marks: ");
		b=Sc.nextInt();
		System.out.println("Economics marks: ");
		e=Sc.nextInt();
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("SAP ID : "+sapid);
		System.out.println("Roll Number "+rollno);
		System.out.println("Accounting marks: "+a);
		System.out.println("Bussiness marks: "+b);
		System.out.println("Economics marks: "+e);
	}

}
class Arts extends Student
{
	int p,b,e;
	Arts(int sapid,String name,int rollno)
	{
		super(sapid,name,rollno);
	}
	void readmarks()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Pyscology marks: ");
		p=Sc.nextInt();
		System.out.println("Bussiness marks: ");
		b=Sc.nextInt();
		System.out.println("Economics marks: ");
		e=Sc.nextInt();
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("SAP ID : "+sapid);
		System.out.println("Roll Number "+rollno);
		System.out.println("Pyscology marks: "+p);
		System.out.println("Bussiness marks: "+b);
		System.out.println("Economics marks: "+e);
	}

}

class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=Sc.nextLine();
		System.out.println("enter sapid: ");
		int sapid=Sc.nextInt();
		System.out.println("Enter rollno:   ");
		int rollno=Sc.nextInt();
		System.out.println("Select stream 1]science 2]comnmerce 3]artts ");
		int choice=Sc.nextInt();
		if(choice==1)
		{
			Science s=new Science(sapid ,name,rollno);
			s.readmarks();
			s.display();
		}
		else if(choice ==2)
		{
			Commerce c=new Commerce(sapid,name,rollno);
			c.readmarks();
			c.display();
		}
		
		else
		{
			Arts a=new Arts(sapid,name,rollno);
			a.readmarks();
			a.display();
		}
		 
	}
}
