//Create a package named Shapes that contains class: Square. Class Square should have methods to calculate the area and perimeter of the corresponding shape. Write a program in the main class to demonstrate the usage of these shape classes.
import java.util.*;
import Shapes.Square;
class Main
{
	public static void main(String args[] )
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter sqyare side length:   ");
		int side=Sc.nextInt();
		 Square sq=new Square(side);
		 sq.area();
		 sq.perimeter();
	}
}