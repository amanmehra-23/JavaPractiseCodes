/*WAP to create a package called perfect having PerfectNumber class and testPerfect(int no). WAP that imports this package to check input number is perfect or not. [perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128]*/


package Perfect;

public class PerfectNumber
{
	public int number;
	public void testPerfect(int number)
	{
		int sum=0; 
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}

		}
		if(sum==number)
		{
			System.out.println("Perfect Number! "+sum);
		}
		else
		{
			System.out.println("Not perfect number");
		}
	}	
} 