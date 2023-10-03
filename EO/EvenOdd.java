//Write a program to create a package and show the excecution of the same. The program should display the given number is even or odd.

package EO;
public class EvenOdd
{
	int num;
	public EvenOdd(int num)
	{
		this.num=num;
		if(num%2==0)

		{
			System.out.println("Even!");
		}
		else
		{
			System.out.println("Odd!");
		}
	}
}