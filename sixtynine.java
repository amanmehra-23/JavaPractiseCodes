/*WAP to create a package called perfect having PerfectNumber class and testPerfect(int no). WAP that imports this package to check input number is perfect or not. [perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128]*/


import java.util.*;
import Perfect.PerfectNumber;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner (System.in);
		PerfectNumber pn=new PerfectNumber();
		System.out.println("Enter Number: ");
		int num=Sc.nextInt();
		pn.testPerfect(num);
	}
}