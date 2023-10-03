//Create a package named Shapes that contains class: Rectangle. Class Rectangleshould have methods to calculate the area and perimeter of the corresponding shape. Write a program in the main class to demonstrate the usage of these shape classes.

package Shapes;
public class Rectangle
{
	int l,b;
	public Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void area()
	{
		int area;
		area= l*b;
		System.out.println("AREA: "+area);
	}
	public void perimeter()
	{
		int peri=l+l+b+b;
		System.out.println("Perimeter: "+peri);
	}
}