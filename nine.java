/*Create an abstract class named Vehicle. Define an abstract method called start(). Create two subclasses Car and Motorcycle that extend the Vehicle class. Implement the start() method in each subclass to start a car and a motorcycle, respectively.
When motorcycle is called it starts with kick 
When car is called it starts with self start*/

import java.util.*;
abstract class Vehicle
{
	abstract void start();
} 

class Motercycle extends Vehicle 
{
	void start()
	{
		System.out.println("Motorcyle starts with a Kick!");
	}
}
class Car
{
	void start()
	{
		System.out.println("Car starts with a Self Start");
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter vehicle to start \n1]MoterCycle \n2]Car ");
		int choice=Sc.nextInt();
		if(choice==1)
		{
			Motercycle m=new Motercycle();
			m.start();
		}
		else if(choice==2)
		{
			Car c=new Car();
			c.start();
		}
	}
}