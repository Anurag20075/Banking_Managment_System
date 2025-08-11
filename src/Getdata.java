
public class Getdata {
	private String AccountName;
	private String accountnumber;
	private double balance;
	
	public Getdata(String AccountName , String accountnumber,double intialbalance) {
		this.AccountName=AccountName;
		this.accountnumber=accountnumber;
		this.balance=intialbalance;
	}
		public void deposit(double amount) {
		if (amount > 0 && balance >= amount) {
			amount += balance;
			System.out.println("Money is Succesfully deposit" + amount);
		}
		else {
			System.out.println("Deposit amount must be positive and less than or equal to the current balance.");
		}
	}
	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			System.out.println("Money is withdraw" + amount);
		}
		else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}
	public String getaccountname() {
		return AccountName;
	}
	public String getaccountnumber() {
		return accountnumber;
	}
	public double getbalance() {
		return balance;
	}
}
