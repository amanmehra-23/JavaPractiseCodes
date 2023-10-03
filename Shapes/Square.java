//Create a package named Shapes that contains class: Square. Class Square should have methods to calculate the area and perimeter of the corresponding shape. Write a program in the main class to demonstrate the usage of these shape classes.



package Shapes;
public class Square
{
	int side;
	public Square(int side)
	{
		this.side=side;
	}
	public void area()
	{
		int area;
		area=side*side;
		System.out.println("Area: "+area);
	}
	public void perimeter()
	{
		int peri;
		peri=4*side;
		System.out.println("Perimeter: "+peri);
	}
}