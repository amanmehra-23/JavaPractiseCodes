 /*Write a program that reads an integer from the user and prints its reciprocal. Handle the exception when the user enters zero.*/

 import java.util.*;

 class Main extends Exception
 {
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        double reci,num;
        try
        {
         System.out.println("Enter an integer: ");
            num=Sc.nextDouble();
            if(num==0)
            {
                throw new Exception();
            }
            else
            {
                reci=1/num;
                System.out.println("The reciprocal of the number is: "+reci);
            }
        }
        catch(Exception e)
        {
            System.out.println("Zero is invalid input");
            System.out.println("Enter an integer: ");
            num=Sc.nextDouble();
            reci=1/num;
            System.out.println("The reciprocal of the number is: "+reci);

        }
    }
 }
