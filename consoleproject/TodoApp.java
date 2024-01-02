package consoleproject;

import java.util.Scanner;

public class TodoApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		TodoList todoList = new TodoList();
		
		System.out.println(" 간단한 to do 리스트 프로그램 입니다");
		
		while (true) {
			System.out.println("--------메뉴---------------");
			System.out.println("1. 할 일 추가");
			System.out.println("2. 할 일 삭제");
			System.out.println("3. 할 일 목록보기");
			System.out.println("4. 종료");
			
			int choice = scanner.nextInt();
			
			switch(choice) {
				case 1:
					System.out.print("추가할 할 일을 입력하세요");
					scanner.next();
					String taskToAdd = scanner.nextLine();
					todoList.addTask(taskToAdd);
					break;
				case 2:
					System.out.println("삭제할 할 일의 인덱스를 입력하세요");
					int indexRemove = scanner.nextInt();
					todoList.removeTask(indexRemove);
					break;
				case 3:
					todoList.displayTasks();
					break;
				case 4:
					System.out.println("프로그램 종료");
					scanner.close();
					System.exit(0);
					break;
				default:
					System.out.println("잘못된 선택입니다 다시 선택하세요");
					break;
			}
		}
	}
}
