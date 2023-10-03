/*Create an abstract class named Animal. Define an abstract method called move(). Create two subclasses Bird and Fish that extend the Animal class. Implement the move() method in each subclass to define how a bird and a fish move, respectively. Example: When bird is called it shows “Flies” while for fish it “swims”*/


import java.util.*;

abstract class Animal
{
	abstract void move();
}

class Bird extends Animal
{
	void move()
	{
		System.out.println("Flies");
	}
}

class Fish extends Animal
{
	void move()
	{
		System.out.println("Swims");
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the chocie of Animal \n1]Bird \n2]Fish");
		int choice=Sc.nextInt();

		if(choice == 1)
		{
			Bird b=new Bird();
			b.move();
		}
		else if(choice == 2)
		{
			Fish f=new Fish();
			f.move();
		}
	}
}