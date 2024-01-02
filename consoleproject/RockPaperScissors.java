package consoleproject;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("가위 바위 보 게임을 시작합니다");
		System.out.println("가위는 1 바위는 2 보는 3을 입력하세요");
		
		boolean playing = true;
		
		while(playing) {
			System.out.println("가위 바위 보 중 하나를 선택하세여 종료는 0");
			int userChoice = scanner.nextInt();
			
			if (userChoice == 0) {
				playing = false;
				System.out.println("게임 종료");
				break;
			} 
			
			int computerChoice = random.nextInt(3) + 1;
			
			if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)){
				System.out.println("승리입니다");
				System.out.println("나" + userChoice + ", 컴퓨터: " + computerChoice);
			
			} else if (userChoice == computerChoice) {
				System.out.println("비겼습니다");
				System.out.println("나" + userChoice + ", 컴퓨터: " + computerChoice);
			} else {
				System.out.println("패배입니다");
				System.out.println("나" + userChoice + ", 컴퓨터: " + computerChoice);
			}	
		}
		scanner.close();
	}
	
}