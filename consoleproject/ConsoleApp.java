package consoleproject;

import java.util.Scanner;

public class ConsoleApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = scanner.next();
		
		System.out.println("나이를 입력하세요");
		int age = scanner.nextInt();
		
		System.out.println("안녕하세요 " + name + " 님");
		System.out.println("당신은 " + age + " 살 이고, 10년 후에 " + (age + 10) + " 살이 됩니다" );
		
		scanner.close();
	}
}
