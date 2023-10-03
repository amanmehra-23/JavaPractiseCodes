/* Create a class as follows. Apartment
Properties: location,price,floor,noOfRooms,price
Methods:readData(), displayData()
Create object of Apartment class and invoke methods such as readData() and displayData(). Then delete the object using System.gc() function call and print the message “Object has been deleted”.
*/
import java.util.*;
class Apartment
{
	String location;
	int floor;
	int noOfRooms;
	double price;

	void readData()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Apartment location: ");
		location=Sc.nextLine();
		System.out.println("Apartment floor: ");
		floor=Sc.nextInt();
		System.out.println("Apartment number Of  Rooms");
		noOfRooms=Sc.nextInt();

	}
	void displayData()
	{
		price=100000;
		System.out.println("Apartment location: "+location);
		System.out.println("Apartment floor: "+floor);
		System.out.println("Apartment number Of  Rooms: "+noOfRooms);
		System.out.println("Apartment price $: "+price);
	}
}

class Main
{
	public static void main (String args[])
	{
			Apartment a=new Apartment();
			a.readData();
			a.displayData();
			a=null;
			System.gc();
			System.out .println("Object has been deleted!");
	}
}
