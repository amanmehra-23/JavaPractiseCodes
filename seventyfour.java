/*Create a class as follows.
MobilePhone
• Properties: model, price, operatingSystem, cameraResolution
• Methods: readDetails (), displayDetails()
Create an object of MobilePhone class and invoke methods such as readDetails() and displayDetails(). Then delete the object using System.gc() function call and print the message “Object has been deleted”.
*/
import java.util.*;
class MobilePhone
{
	String model;
	int price;
	String operatingSystem;
	String cameraResolution;
	void readDetails()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Model: ");
		model=Sc.nextLine();
		System.out.println("Operating System: ");
		operatingSystem=Sc.nextLine();
		System.out.println("Camera Resolution: ");
		cameraResolution=Sc.nextLine();
	}
	void displayDetails()
	{
		price=50000;
		System.out.println("Mobile details: ");
		System.out.println("Model: ");
		System.out.println("Operating System: ");
		System.out.println("Camera Resolution: ");
		System.out.println("Price: $"+price);
	}

}

class Main
{
	public static void main(String args[])
	{
		MobilePhone mp=new MobilePhone();
		try{
		mp.readDetails();
		mp.displayDetails();
		mp=null;
		System.gc();
		mp.readDetails();
		}
		catch(Exception e)
		{
			
			System.out.println("Object is deleted!");
		}

	}
}