/*Create an abstract class named Shape. Define an abstract method called calculateArea(). Create two subclasses Circle and Rectangle that extend the Shape class. Implement the calculateArea() method in each subclass to calculate the area of a
circle and a rectangle, respectively.*/
import java.util.*;
abstract class  Shape
{
	abstract void  calculateArea();
}
class Rectangle extends  Shape
{
	int len,bre;
	private float area;
	Rectangle(int len,int bre)
	{
		this.len=len;
		this.bre=bre;
	}
	void calculateArea()
	{
		area=len*bre;
		System.out.println("Area of the Rectangle: "+area);
	}
}
class Circle extends Shape
{
	private float area;
	int rad;
	Circle(int rad)
	{
		this.rad=rad;

	}
	void calculateArea()
	{
		area=3.14f*rad*rad;
		System.out.println("Area of the Circle: "+area);
	}
}
class Main 
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the radius of a circle: ");
		int rad=Sc.nextInt();
		Circle c=new Circle(rad);
		c.calculateArea();
		System.out.println("Enter the length and breadth of the rectangle: ");
		int len=Sc.nextInt();
		int bre=Sc.nextInt();
		Rectangle re=new Rectangle(len,bre);
		re.calculateArea();
	}
}