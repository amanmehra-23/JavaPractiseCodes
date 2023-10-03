/* You have been given an array of positive integers A1, A2,...,An with length N and you have to print an array of same length (N) where the values in the new array are the sum of every number in the array, except the number at that index.
i/p 1 2 3 4
For the 0th index, the result will be 2+3+4= 9, similarly for the second, third and fourth index the corresponding results will be 8, 7 and 6 respectively.
i/p 4 5 6*/

import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("length array: ");
		int len=Sc.nextInt();
		System.out.println("enter elemts of array: ");
		int sum[]=new int[len];
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=Sc.nextInt();
		}
		for(int j=0;j<len;j++)
		{


		for(int i=0;i<len;i++)
		{
			if(i!=j)
			{
				sum[j]=arr[i]+sum[j];
			}
		}
		}
		for(int j=0;j<len;j++)
		{
			System.out.println(sum[j]);
		}
	}
}