
public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("Pearl", 120.00, 3.50);
		b1.withdraw(125); // transaction denied
		
		b1.withdraw(50);
		System.out.println(b1);
		
		b1.deposit(400);
		System.out.println(b1);		
	}

}
