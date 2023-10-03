//f. WAP to print the sum of following series 1+1/2^2+1/3^2+1/4^2......+1/n^2


import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter last digit: of n ");
		int n=Sc.nextInt();
		double sum=1;
		for(int i=2;i<=n;i++)
		{
			sum=sum+(1/Math.pow(i,2));

		}
		System.out.println("Sum: "+sum);
	}
}

