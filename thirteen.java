/*Create an abstract class named Shape. Define an abstract method called draw(). Create two subclasses Circle and Triangle that extend the Shape class. Implement the draw() method in each subclass to draw a circle and a triangle, respectively.
When circle is called void draw() { System.out.println("Drawing a Circle"); When triangle is called
void draw() { System.out.println("Drawing a Triangle");*/

import java.util.*;
abstract class Shape 
{
	abstract void draw();
}

class Triangle extends Shape 
{
	void draw()
	{
		System.out.println("Drawing a Traingle");
	}
}

class Circle extends Shape
{
	void draw(){
	System.out.println("Drawing a Circle");
}
}
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the shape to Draw: \n1]Triangle \n2]Circle");
		int choice=Sc.nextInt();
		if(choice==1)
		{
			Triangle t=new Triangle();
			t.draw();
		}
		else if(choice==2)
		{
			Circle c=new Circle();
			c.draw();
		}
	}
}