//jagged array
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Length: ");
		int len=Sc.nextInt();
		int arr[][]=new int[len][];
		for(int i=0;i<=len;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
}