//WAP to find grade of student from input marks using if else ladder and switch case.

import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter marks: ");
		int marks=Sc.nextInt();
		int grade=marks/10;
		switch(grade)
		{
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
			case 7:
			case 6:
				System.out.println("B");
				break;
			case 5:
				System.out.println("F");
				break;

		}
	}
}