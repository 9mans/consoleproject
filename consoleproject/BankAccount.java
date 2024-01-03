package consoleproject;

public class BankAccount {

	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println(amount + " 원 입금 되었습니다");
	}
	
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println(amount + " 원 출금되었습니다");
		} else {
			System.out.println(" 잔액이 부족합니다");
		}
	}
	
	public void checkBalance() {
		System.out.println("현재 잔액은 " + balance + " 원 입니다");
	}
	
}
