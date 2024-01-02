package consoleproject;

import java.util.Scanner;

public class TextAdventureGame {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("어드벤처 게임에 오신 것을 환영합니다");
		System.out.println("당신은 도시에 있습니다 오른쪽 1 으로 가거나 왼쪽 2으로 갈 수 있습니다");
		
		int choice1 = scanner.nextInt();
		
		if (choice1 == 1) {
			System.out.println("오른쪽으로 이동 -> 숲이 보입니다 숲을 탐험1 할까요? 돌아갈까요2");
			int choice2 = scanner.nextInt();
			
			if (choice2 == 1) {
				System.out.println("숲에 도착했습니다 숲에서 길을 잃었습니다 길을 찾는데 성공하고싶다면 3을 입력하세요");
				int choice3 = scanner.nextInt();
				
				if(choice3 == 3) {
					System.out.println("길을 찾는데 성공했씁니다 도시로 돌아갑니다");
					
				} else {
					System.out.println("길을 찾지 못했습니다 게임오버");
					
				}
			}
		} else if (choice1 == 2) {
			System.out.println("당신은 해변에 도착했습니다 해변을 탐험1할까요? 돌아갈까요2");
			int choice4 = scanner.nextInt();
			
			if (choice4 == 1) {
				System.out.println("당신은 해변을 탐험하다 길을 잃었습니다 탈출1하시겠습니까?");
				int choice5 = scanner.nextInt();
				
				if(choice5 == 1) {
					System.out.println("당신은 탈출에 성공하여 도시로 돌아왔습니다");
				} else {
					System.out.println("탈출에 실패하여 사망했습니다 게임오버");
				}
				
			}
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		scanner.close();
	}
}
