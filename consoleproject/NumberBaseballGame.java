package consoleproject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NumberBaseballGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//컴퓨터가 생설 할 3자리의 랜덤 숫자 생성
		ArrayList<Integer> computerNumbers = new ArrayList<>();
		while (computerNumbers.size() <3) {
			int randomNumber = random.nextInt(10);
			if (!computerNumbers.contains(randomNumber) && randomNumber != 0) {
				computerNumbers.add(randomNumber);
			}
		}
		System.out.println("숫자 야구 게임을 시작합니다");
		
		boolean gameWon = false;
		while (!gameWon) {
			System.out.println("3자리 숫자를 입력하세요 종료는 exit");
			String userInput = scanner.nextLine();
			
			if (userInput.equalsIgnoreCase("exit")) {
				System.out.println("게임을 종료합니다 정답은 " + computerNumbers + " 입니다");
				break;
			}
			
			if (userInput.length() != 3) {
				System.out.println("세 자리의 숫자를 입력하세요");
				continue;
			}
			
			ArrayList<Integer> userNumbers = new ArrayList<>();
			for (char digit : userInput.toCharArray()) {
				userNumbers.add(Character.getNumericValue(digit));
			}
			
			int strikes = 0;
			int balls = 0;
			
			for (int i = 0; i < 3; i++) {
				if (userNumbers.get(i).equals(computerNumbers.get(i))) {
					strikes++;
				} else if (computerNumbers.contains(userNumbers.get(i))) {
					balls++;
				}
			}
			
			if (strikes == 3) {
				System.out.println("정답입니다");
				gameWon = true;
			} else if (strikes == 0 && balls == 0) {
				System.out.println("낫싱");
			} else {
				System.out.println(strikes + "스트라이크," + balls + " 볼");
			}
		}
		scanner.close();
	}
}
