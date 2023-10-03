/*a. Given an integer, n, perform the following conditional actions:
If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird*/


import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=Sc.nextInt();
		if(num%2!=0)
		{
			System.out.println("Weird");
		}
		else if(num%2==0)
		{
			if(num<=5 && num>=2)
			{
				System.out.println("Not weird");
			}
			else if(num>=6 && num<=20)
			{
				System.out.println("Not weird");
			}
			else if(num>20) 
			{
				System.out.println("Not weird");
			}
		}
	}	

}