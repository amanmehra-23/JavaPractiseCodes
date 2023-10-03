import Shapes.Rectangle;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enetr the length and breadth of Rectangle: ");
		int l=Sc.nextInt();
		int b=Sc.nextInt();
		Rectangle r=new Rectangle(l,b);
		r.area();
		r.perimeter();
	}
}