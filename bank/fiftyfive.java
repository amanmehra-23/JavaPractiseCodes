//Create a package named bank that contains two classes: Account and Bank. The Account class should have attributes such as account number, account holder name, and balance. The Bank class should have methods to perform deposits and withdrawals, and display account information. Write a program in the main class to demonstrate the usage of the Bank class.

import Bank.*;
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		Bank b=new Bank();
		System.out.println("choose 1]withdraw 2]deposit ");
		int choice=Sc.nextInt();
		switch(choice)
		{ 
			case 1:
			 System.out.println("Enter money to withdraw: ");
			 int w=Sc.nextInt();
			 b.withdraw(w);
			 break;
			case 2:
				System.out.println("enetr money to deposit: ");
				int d=Sc.nextInt();
				b.deposit(d);
				break;
		}
		
		
	}
}