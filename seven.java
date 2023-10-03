/*Create an abstract class named BankAccount. Define an abstract method called withdraw(). Create two subclasses SavingsAccount and CheckingAccount that extend the BankAccount class. Implement the withdraw() method in each subclass to withdraw money from a savings account and a checking account, respectively.*/

import java.util.*;

abstract class BankAccount
{
	abstract void withdraw(int taken);
}
class SavingsAccount extends BankAccount
{
	int bal=100000;
	int taken;
	SavingsAccount()
	{
		System.out.println("Balance: $"+bal);
	}
	void withdraw(int taken)
	{
		bal=bal-taken;
		System.out.println("Balance: $"+bal);
	}
}
class CheckingAccount extends BankAccount
{
	int bal=70000;
	int taken;
	CheckingAccount()
	{
		System.out.println("Balance: $"+bal);
	}
	void withdraw(int taken)
	{
		bal=bal-taken;
		System.out.println("Balance: $"+bal);
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter bank account to withdraw money from: \n1]Savings Account \n2]Checking Account ");
		int select=Sc.nextInt();
		if(select==1)
		{
			SavingsAccount sa=new SavingsAccount();
			System.out.println("Enter amount to withdraw: ");
			int taken=Sc.nextInt();
			sa.withdraw(taken);
		}
		else if(select==2)
		{
			CheckingAccount  ca=new CheckingAccount();
			System.out.println("Enter amount to withdraw: ");
			int taken=Sc.nextInt();
			ca.withdraw(taken);
		}
	}	
}
