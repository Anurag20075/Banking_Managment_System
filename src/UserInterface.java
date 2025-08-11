import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Proccessing bank = new Proccessing();
		Scanner sc = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("Welcome to our Bank");
			System.out.println("Enter your choice");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Money");
			System.out.println("3. Witdraw Money");
			System.out.println("4. Check Bank Balance");
			System.out.println("5. Transferfund");
			System.out.println("6. Exit");
			choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter the name Account owner Name");
					String name = sc.nextLine();
					sc.nextLine();
					System.out.println("Enter the Account number");
					String number = sc.nextLine();
					sc.nextLine();
					System.out.println("Enter the amount to deposit in bank account");
					double Balance = sc.nextDouble();
					sc.nextLine();
					bank.createaccount(name, number, Balance);
					break;
				case 2:
					System.out.println("Enter the account number ");
					String accountnumbers = sc.next();
					sc.nextLine();
					System.out.print("Enter Account Number: ");
					accountnumbers = sc.next();
					sc.nextLine();
					System.out.print("Enter Amount to Deposit: ");
					double depositAmount = sc.nextDouble();
					Getdata depositAccount = bank.findaccount(accountnumbers);
					if (depositAccount != null) {
						depositAccount.deposit(depositAmount);
					} else {
						System.out.println("Account not found.");
					}
					break;
				case 3:
					System.out.println("Enter the Account number  ");
					String accountNumber = sc.next();
					System.out.print("Enter Amount to Withdraw: ");
					double witdrawAmount = sc.nextDouble();
					Getdata witdrawAccount = bank.findaccount(accountNumber);
					if (witdrawAccount != null) {
						witdrawAccount.withdraw(witdrawAmount);
					} else {
						System.out.println("Account not found.");
					}
					break;
				case 4:
					System.out.println("Enter the account number ");
					String accountnumber = sc.next();
					Getdata bankbalance = bank.findaccount(accountnumber);
					if (bankbalance != null) {
						System.out.println("Current Balance: " + bankbalance.getbalance());
					} else {
						System.out.println("Account not found.");
					}
					break;
				case 5:
					System.out.print("Enter From Account Number: ");
					String fromAccountNumber = sc.next();
					System.out.print("Enter To Account Number: ");
					String toAccountNumber = sc.next();
					System.out.print("Enter Amount to Transfer: ");
					double transferAmount = sc.nextDouble();
					bank.transferfund(fromAccountNumber, toAccountNumber, transferAmount);
					break;

				case 6:
					System.out.println("Exiting...");
					break;
			}
		}
	}
}
