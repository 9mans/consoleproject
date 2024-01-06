package consoleproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ChatMessage {
	private int messageId;
	private String sender;
	private String message;
	
	public ChatMessage(int messageId, String sender, String message) {
		this.messageId = messageId;
		this.sender = sender;
		this.message = message;
	}
	
	public int getMessageId() {
		return messageId;
	}
	
	public String getSender() {
		return sender;
	}
	
	public String getMessage() {
		return message;
	}
}


class ChatDatabase {
	private List<ChatMessage> messages;
	private int nextId;
	
	public ChatDatabase() {
		messages = new ArrayList<>();
		nextId = 1;
		
	}
	
	public void addMessage(String sender, String message) {
		ChatMessage newMessage = new ChatMessage(nextId, sender, message);
		messages.add(newMessage);
		nextId++;
	}
	
	public List<ChatMessage> getAllMessage() {
		return messages;
	}
	
}


public class ChatApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ChatDatabase chatDB = new ChatDatabase();
		
		boolean isRunning = true;
		
		while (isRunning) {
			System.out.println("-------------간단한 채팅 앱 ------------------");
			System.out.println("-----1. 메세지 보내기 2. 메세지 조회 3. 종료 ------");
			System.out.println("-------------간단한 채팅 앱 ------------------");
			System.out.println(" 메뉴를 선택 해주세요");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			
				case 1:
					System.out.println("보내는 사람");
					String sender = scanner.nextLine();
					System.out.println("메세지 내용");
					String message = scanner.nextLine();
					chatDB.addMessage(sender, message);
					
					System.out.println("전송 완료");
					break;
				case 2:
					List<ChatMessage> allMessages = chatDB.getAllMessage();
					if (allMessages.isEmpty()) {
						System.out.println("등록된 메세지가 없습니다");
					} else {
						System.out.println("---전체 메세지----");
						for (ChatMessage msg : allMessages) {
							System.out.println("ID: " + msg.getMessageId() + msg.getSender() + msg.getMessage());
						}
					}
					break;
				case 3:
					isRunning = false;
					System.out.println("프로그램 종료");
					break;
					
				
				default:
					 System.out.println("올바르지 않은 선택입니다");
					 break;
			}
			
		}
	}
}
