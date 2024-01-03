package consoleproject;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("계좌 개설시 입금 할 금액을 입력하세요");
		double initialAmount = scanner.nextDouble();
		
		BankAccount account = new BankAccount(initialAmount);
		
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.입금 2.출금 3.잔액 확인 4.종료");
			System.out.println("-------------------------------------------------");
			System.out.println("원하시는 메뉴를 선택 해주세요");
			int choice = scanner.nextInt();
			
			switch (choice) {
				case 1:
					System.out.println("입금액");
					double depositAmount = scanner.nextDouble();
					account.deposit(depositAmount);
					System.out.println("현재 잔액은 " + (initialAmount + depositAmount) + " 원 입니다");
					initialAmount += depositAmount;
					break;
				case 2:
					System.out.println("출금액");
					double withdrawAmount = scanner.nextDouble();
					account.withdraw(withdrawAmount);
					System.out.println("현재 잔액은" + (initialAmount-withdrawAmount) + " 원 입니다");
					initialAmount -= withdrawAmount;
					break;
				case 3:
					account.checkBalance();
					break;
				case 4:
					System.out.println("프로그램을 종료합니다");
					isRunning = false;
				default :
					System.out.println("잘못된 선택입니다");
			
			}
			
		}
		scanner.close();
	}
}
