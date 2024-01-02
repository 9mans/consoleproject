package consoleproject;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numberToGuess = random.nextInt(100) + 1;
		boolean hasGuessedCorrectly = false;
		int attempts = 0;
		
		System.out.println("1 부터 100까지 숫자를 맞춰보세요");
		
		while(!hasGuessedCorrectly) {
			System.out.println("숫자를 입력하세요ㅕ");
			int userGuess = scanner.nextInt();
			
			attempts ++;
			
			if (userGuess < numberToGuess) {
				System.out.println("up");
			} else if (userGuess > numberToGuess) {
				System.out.println("down");
			} else {
				hasGuessedCorrectly = true;
				System.out.println("정답입니다");
				System.out.println("시도한 횟수 : " + attempts);
			}
		}
		scanner.close();
	}
	
}
