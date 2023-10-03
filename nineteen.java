/*Create an abstract class named Shape. Define an abstract method called calculatePerimeter(). Create two subclasses Square and Triangle that extend the Shape class. Implement the calculatePerimeter() method in each subclass to calculate the perimeter of a square and a triangle, respectively.*/

import java.util.*;
abstract class Shape
{
	abstract void calculatePerimeter();
}

class Square extends Shape
{
	int s;
	Square(int s)
	{
		this.s=s;
	}
	void calculatePerimeter()
	{
		System.out.println("The perimeter of the square is: "+(4*s));

	}
}

class Triangle extends Shape
{
	int s;
	Triangle(int s)
	{
		this.s=s;
	}
	void calculatePerimeter()
	{
		System.out.println("The perimeter of the  equilateral Triangle is: "+(3*s));

	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the side length of square");
		int side=Sc.nextInt();
		Square sq=new Square(side);
		sq.calculatePerimeter();
		System.out.println("Enter the side length of triangle");
		int tri=Sc.nextInt();
		Triangle tr=new Triangle(tri);
		tr.calculatePerimeter();
	}
}