//Create a package named bank that contains two classes: Account and Bank. The Account class should have attributes such as account number, account holder name, and balance. The Bank class should have methods to perform deposits and withdrawals, and display account information. Write a program in the main class to demonstrate the usage of the Bank class.

package bank;
class Account
{

		long account_number=600092216;
		String holder_name="Aman Mehra";
		int bal=100000;
	
}

public class Bank extends Account
{
	
	
	public Bank()
	{
		System.out.println("Account number: "+super.account_number);
		System.out.println("Account holder: "+super.holder_name);
		System.out.println("Balance: $"+super.bal);
	}
	public void deposit(int b)
	{
		super.bal=super.bal+b;
		System.out.println("Balance $"+super.bal);
	}
	public void withdraw(int w)
	{
		super.bal=super.bal-w;
		System.out.println("Balance $"+super.bal);
	}
}