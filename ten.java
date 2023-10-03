 //Write a program that reads an array of integers and calculates their sum. Handle the exception when the array index is out of bounds.

import java.util.*;
class Main extends Exception
{
    public static void main(String args[])
    {
        try
        {
            Scanner Sc=new Scanner(System.in);
            System.out.println("Enter the length of an array: ");
            int len=Sc.nextInt();
            int arr[]=new int[len];
            int sum=0;
            System.out.println("Enter "+len+" numbers: ");
            for(int i=0;i<len;i++)
            {
                arr[i]=Sc.nextInt();
                sum=sum+arr[i];
                if(i>len)
                {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
            System.out.println("The sum of the elemenst of the array is: "+sum);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
    } 
}