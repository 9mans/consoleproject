package object1;

	class BankAccount {
		private String accountNumber;
		private String accountHolderName;
		private double balance;
		
		public BankAccount(String accountNumber, String accountHolderName) {
			this.accountNumber = accountNumber;
			this.accountHolderName = accountHolderName;
			this.balance = balance;
		}
		
		public void deposit(double amount) {
			if (amount > 0) {
				balance += amount;
				System.out.println(amount + " 원이 입금되었습니다" + " 현재 잔액은 " + balance + " 원 입니다");
			} else {
				System.out.println("금액이 정상적으로 입력되지 않았습니다");
			}
		}
		
		public void withdraw(double amount) {
			if (amount > 0 && balance >= amount) {
				balance -= amount;
				System.out.println(amount + " 원이 출금 되었습니다" + " 현재 잔액은 " + balance + " 원 입니다");
			}
		}
		
		public void checkBalance() {
			System.out.println("계좌 번호: " + accountNumber);
			System.out.println("예금주: " + accountHolderName);
			System.out.println("현재 잔액: " + balance + " 원");
		}
	}

	public class BankDemo {
		
		public static void main(String[] args) {
			
			BankAccount bankAccount = new BankAccount("352-1030-4706-43", "홍길동");
		
			
			bankAccount.deposit(10000);
			bankAccount.withdraw(5000);
			bankAccount.checkBalance();
			
		}
		
	}
