//. Write a menu driven program using switch case to perform mathematical operations.


import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter two numbers: ");
		int n1=Sc.nextInt();
		int n2=Sc.nextInt();
		System.out.println("Choose 1]add 2]subract 3]multiply ");
		int choice=Sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Addition "+(n1+n2));
				break;
			case 2:
				System.out.println("Subraction "+(n1-n2));
				break;
			case 3:
				System.out.println("Multiplication: "+(n1*n2));
				break;
		}
	}
}