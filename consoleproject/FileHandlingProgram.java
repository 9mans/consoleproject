package consoleproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandlingProgram {
	public static void main(String[] args) {
		
	

	try {
		// 사용자로부터 입력 받기 위한 bufferedreader 객체 생성
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 파일에 쓸 내용을 입력 받음
		System.out.println("파일에 쓸 내용을 입력하세요");
		String content = reader.readLine();
		
		// 파일에 쓰기
		FileWriter writer = new FileWriter("output.txt"); // 아웃풋.txt 파일을 생성하거나 덮어씁니다
		writer.write(content); // 사용자로부터 받은 내용을 파일에 씁니다
		writer.close();
		
		System.out.println(" 파일에 내용을 성공적으로 썼습니다");
		// 파일에서 읽어오기 
		System.out.println("파일에서 읽어온 내용");
		BufferedReader fileReader = new BufferedReader(new FileReader("output.txt")); // 아웃풋 파일을 엽니다
		String line;
		while ((line = fileReader.readLine()) != null ) { // 파일에서 한 줄 씩 읽어 옵니다
			System.out.println(line); // 읽어온 내용을 콘솔 창에 출력합니다
		}
		fileReader.close(); // 파일 읽기를 마치고 닫습니다
	} catch (IOException e) { // IOException이 발생할 경우 처리합니다
		System.out.println("파일 처리 중 오류가 발생했습니다: " + e.getMessage());//오류메세지를 출력합니다
	}
}

}