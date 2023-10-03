//Create a package named Shapes that contains class: Circle. Class Circle should have methods to calculate the area and perimeter of the corresponding shape. Write a program in the main class to demonstrate the usage of these shape classes.


import Shapes.Circle;
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter radisu of circle: ");
		int rad=Sc.nextInt();
		Circle c=new Circle(rad);
		c.calculate_area();
		c.calculate_perimeter();
	}
}
