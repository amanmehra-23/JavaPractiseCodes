//WAP to demonstrate the following hierarchy to override speed method of super class car in respective subclasses. where car class having variables company, type of car
//Note: Use super() method to invoke super class constructor.
import java.util.*;
class Car
{
	String company;
	String type;
	Car(String company,String type)
	{
		this.company=company;
		this.type=type;
	}
	void speed()
	{
		System.out.println("Speed: ");
	}
}

class Maruti extends Car
{
	Maruti(String company,String type)
	{
		super(company,type);
	}
	void speed()
	{
		String speed="60km/h";
		String name="Maruti";
		System.out.println("Name: "+name);
		System.out.println("Company: "+company);
		System.out.println("Type: "+type);
		System.out.println("Speed: "+speed);
	}
}

class Alto extends Car
{
	Alto(String company,String type)
	{
		
		super(company,type);
	}
	void speed()
	{
		String speed="70km/h";
		String name="Alto";
		System.out.println("Name: "+name);
		System.out.println("Company: "+company);
		System.out.println("Type: "+type);
		System.out.println("Speed: "+speed);
	}
}

class Brezza extends Car
{
	Brezza(String company,String type)
	{
		
		super(company,type);
	}
	void speed()
	{
		String speed="80km/h";
		String name="Brezza";
		System.out.println("Name: "+name);
		System.out.println("Company: "+company);
		System.out.println("Type: "+type);
		System.out.println("Speed: "+speed);
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Company: ");
		String company=Sc.nextLine();
		System.out.println("Enter Type:  a]medium b]small c]Big");
		String type=Sc.nextLine();
		if(type.equals("small"))
		{
			Alto a=new Alto(company,type);
			a.speed();
		}
		else if(type.equals("medium"))
		{
			Maruti m=new Maruti(company,type);
			m.speed();
		}
		else
		{
			Brezza b=new Brezza(company,type);
			b.speed();
		}
	}
}