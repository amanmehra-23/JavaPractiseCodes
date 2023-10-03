 /*A. Implement Dynamic method dispatch in a Banking System.
Let’s consider a simplified representation of a banking system with the following classes:
1. Account (Superclass):
• Properties: accountNumber, balance
• Methods: deposit(), withdraw(), displayAccountInfo()
2. SavingsAccount (Subclass):
• Properties: interestRate
• Methods: calculateInterest()
3. CurrentAccount (Subclass):
• Properties: overdraftLimit
• Methods: checkOverdraft()
Make Account as superclass and derive SavingsAccount and CurrentAccount as subclasses from it with given additional properties and methods. Create the objects of each class and demonstrate dynamic method dispatch to call the methods.
*/

import java.util.*;
class Account
{
	int accountNumber= 12345;
	int balance= 100000;
	int with,depo;
	void deposit(int depo)
	{
		balance=balance+depo;
	}
	void withdraw(int with)
	{
		balance=balance-with;
	}
	void displayAccountInfo()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: $"+balance);
	}
}

class SavingsAccount extends Account
{
	int interestRate=5;
	void calcualteInterest()
	{
		super.balance=balance+(balance*5/100);
	}
	void displayAccountInfo()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: $"+balance);
	}

}

class CurrentAccount extends Account
{
	int overdraft;
	CurrentAccount(int overedraft)
	{
		this.overdraft=overdraft;
	}
	void checkOverdraft()
	{
		if(overdraft>super.balance)
		{
			overdraft=super.balance-overdraft;
			system.out.println("Overdraft"+overdraft);
		}
	}
	void displayAccountInfo()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: $"+balance);
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter ammount to deposit in the bank: ");
		int depo=Sc.nextInt();
		Account a=new Account();
		a.deposit(depo);
		a.displayAccountInfo();
		System.out.println("Enter ammount to withdraw in the bank: ");
		int with=Sc.nextInt();
		a.withdraw(with);
		a.displayAccountInfo();
		Account sa=new SavingsAccount();
		sa.calculateInterest();
		sa.displayAccountInfo();
		System.out.println("enter overall expense: ");
		int e=Sc.nextInt();
		Account ca=new CurrentAccount(e);
		ca.checkOverdraft();
		ca.displayAccountInfo();

	}
}