package consoleproject;

import java.util.ArrayList;

public class TodoList {
	

	private ArrayList<String> tasks;
	
	public TodoList() {
		tasks = new ArrayList<>();
	}
	
	public void addTask(String task) {
		tasks.add(task);
		System.out.println("할 일이 추가되었습니다 " + task);
	}
	
	public void removeTask(int index) {
		if (index >= 0 && index < tasks.size()) {
			String removedTask = tasks.remove(index);
			System.out.println("할 일이 삭제 되었습니다" + removedTask);}
		else {
		System.out.println("잘못된 인덱스 입니다");
		}
	}
	
	public void displayTasks() {
		if (tasks.isEmpty()) {
			System.out.println("할 일이 없습니다");
		} else {
			System.out.println("할 일 목록: ");
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println(i + ". " + tasks.get(i));
			}
		}
		
	}
}

