//Create a package named Shapes that contains class: Circle. Class Circle should have methods to calculate the area and perimeter of the corresponding shape. Write a program in the main class to demonstrate the usage of these shape classes.

package Shapes;
public class Circle
{
	int rad;
	public Circle(int rad)
	{
		this.rad=rad;
	}
	public void calculate_area()
	{
		double area=3.14*rad*rad;
		System.out.println("Area"+area);
	}
	public void calculate_perimeter()
	{
		double peri=3.13*2*rad;
		System.out.println("perimeter: "+peri);
	}
}