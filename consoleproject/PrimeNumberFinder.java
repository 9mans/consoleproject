package consoleproject;

import java.util.Scanner;

public class PrimeNumberFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성
		
		System.out.println("소수를 찾을 범위의 최대값을 입력하세요");
		
		int maxNumber = scanner.nextInt();
		
		System.out.println("1부터 " + maxNumber + " 까지의 소수");
		
		for (int number = 2; number < maxNumber; number++) {
			if (isPrime(number)) { // 넘버가 소수인지 확인
				System.out.println(number + " "); // 소수가 맞다면 넘버를 표시
			}
		}
		scanner.close();
	}
	
	public static boolean isPrime(int number) {
		if (number <= 1) { // 숫자가 1보다 작거나 같으면 소수가 아니기때문에 폴스 반환
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(number); i++) { // 2부터 해당 숫자의 제곱근까지 반복
			if (number % i == 0) { // 만약 어떤 숫자로도 나누어 떨어진다면 소수가 아니므로 false 반환
				return false;
			}
		}
		
		return true; // 위 조건을 통과하면 소수이므로 true 반환
	}
}
