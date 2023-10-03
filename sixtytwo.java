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

import java.util.Scanner;

class Account {
    int accountNumber = 12345;
    int balance = 100000;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    void calculateInterest() {
    }

    void checkOverdraft() {
    }
}

class SavingsAccount extends Account {
    int interestRate = 5;
    int bal = 0;

    void calculateInterest() {
        bal = balance + (balance * 5 / 100);
    }

    void displayAccountInfo() {
        System.out.println("Post Interest: ");
        System.out.println("Balance: $" + bal);
    }
}

class CurrentAccount extends Account {
    int overdraft;

    CurrentAccount(int overdraft) {
        this.overdraft = overdraft;
    }

    void checkOverdraft() {
        if (overdraft > super.balance) {
            overdraft = super.balance - overdraft;
        }
    }

    void displayAccountInfo() {
        System.out.println("Overdraft: $" + overdraft);
    }
}

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit in the bank: ");
        int depositAmount = scanner.nextInt();

        Account account = new Account();
        account.deposit(depositAmount);
        account.displayAccountInfo();

        System.out.print("Enter amount to withdraw from the bank: ");
        int withdrawalAmount = scanner.nextInt();
        account.withdraw(withdrawalAmount);
        account.displayAccountInfo();

        Account savingsAccount = new SavingsAccount();
        savingsAccount.calculateInterest();
        savingsAccount.displayAccountInfo();

        System.out.print("Enter overall expense: ");
        int expense = scanner.nextInt();
        Account currentAccount = new CurrentAccount(expense);
        currentAccount.checkOverdraft();
        currentAccount.displayAccountInfo();

        scanner.close();
    }
}
