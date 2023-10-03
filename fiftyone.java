//WAP to create a package called vol having Cylinder class and volume (). WAP that imports this package to calculate volume of a Cylinder.
import vol.Cylinder;
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner (System.in);
		System.out.println("Enetr the radius adn height of the Cylinder");
		int rad=Sc.nextInt();
		int height=Sc.nextInt();
		Cylinder c=new Cylinder(rad,height);
		c.volume(); 
	}
}