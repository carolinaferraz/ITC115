import java.text.NumberFormat;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
	String name;
	double balance;
	double transactionFee = 0.00;
	
	
	//constructor
	public BankAccount(String name, double balance, double transactionFee) {
		this.name = name;
		this.balance = balance;
		this.transactionFee = transactionFee;	
	}
    
	public void deposit(double amount) {
			balance = balance + amount;
	} 
	
	//conditional created to prevent negative balance

	public void withdraw(double amount) {
		if((balance - amount - transactionFee) < 0) {
			System.out.println("Unsufficient funds.");
		} else {
			balance = balance - (amount + transactionFee);
		}
	} 
	
	public String getBalanceFormatted() {
        String formattedBalance = NumberFormat.getCurrencyInstance().format(this.balance);
        return formattedBalance;
    }
	
	public String toString() {
		return (name + ", " + getBalanceFormatted());
	}
}
