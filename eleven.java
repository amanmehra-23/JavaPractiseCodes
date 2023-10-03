/*Create an abstract class named Instrument. Define an abstract method called play(). Create two subclasses Piano and Guitar that extend the Instrument class. Implement the play() method in each subclass to play a piano and a guitar, respectively.*/

import java.util.*;
abstract class Instrument 
{
	abstract void play();
}

class Piano extends Instrument
{
	void play()
	{
		System.out.println("The piano is playing");
	}
}

class Guitar extends Instrument 
{
	void play(){
	System.out.println("The guitar is playing");
}
}
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter which intrument you want to play \n1]Piano \n2]Guitar");
		int choice=Sc.nextInt();
		switch(choice)
		{
			case 1:
				Piano p=new Piano();
				p.play();
				break;

			case 2:
				Guitar g=new Guitar();
				g.play();
				break;
		}
	}
}