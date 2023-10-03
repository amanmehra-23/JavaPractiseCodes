/*WAP to read the data and determine the following Total marks obtained by each student
The student who obtained the highest total marks*/
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the total number of students: ");
		int num=Sc.nextInt();
		int d[][]=new int[50][50];
		System.out.println("Enter details: ");
		System.out.println("Roll No 	"+"Subject1	"+"Subject2	"+"Subject3	");
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=4;j++)
			{
				d[i][j]=Sc.nextInt();
			}
		}
		int sum[]=new int[50];
		int max;
		for(int i=1;i<=num;i++)
		{
			for(int j=2;j<=4;j++)
			{
				sum[i]=d[i][j]+sum[i];
			}
			System.out.println(sum[i]);
		}
		int high,top=0;
		high=sum[0];
		for(int i=0;i<num;i++)
		{
			for(int j=1;j<=4;j++)
			{
			if(high<sum[i])
				high=sum[i];
				top=d[i][1];
			}
		}
		System.out.println("Highest marks are: "+high+" scored by student rollnumn: "+(top-1));
		
	}
}