//WAP to find largest of 3 numbers using nested if else and nested ternary operator.


import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int n1=Sc.nextInt();
		int n2=Sc.nextInt();
		int n3=Sc.nextInt();
		/*if(n1>n2 && n1>n3)
		{
			System.out.println("Greatest: "+n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("Greatest: "+n2);
		}
		else
		{
			System.out.println("Greatest: "+n3);
		}*/

		int max=(n1>n2 && n1>n3)?n1:(n2>n1 && n2>n3)?n2:n3;
		System.out.println("Greatest: "+max);
	}
}