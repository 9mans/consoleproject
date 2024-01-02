package consoleproject;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자의 입력을 받기 위한 Scanner 객체 생성

        String[] words = {"apple", "banana", "orange", "grape", "melon"}; // 단어 목록을 저장하는 문자열 배열
        String wordToGuess = words[(int) (Math.random() * words.length)]; // 랜덤으로 선택된 단어
        char[] guessedWord = new char[wordToGuess.length()]; // 추측한 단어를 저장할 문자 배열
        boolean wordGuessed = false; // 단어를 맞혔는지 여부를 저장하는 변수
        int attempts = 0; // 사용자 시도 횟수를 저장하는 변수
        int maxAttempts = 6; // 최대 시도 횟수

        // 추측한 단어 배열 초기화: '_'로  사용자에게 보여주기 위함
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        System.out.println("행맨 게임을 시작합니다!");

        while (!wordGuessed && attempts < maxAttempts) { // 단어를 맞히거나 시도 횟수가 최대 시도 횟수를 넘지 않는 동안 반복
            System.out.println("현재 단어: " + String.valueOf(guessedWord)); // 사용자에게 현재 추측한 단어 상태를 보여줌
            System.out.print("알파벳을 추측하세요: ");
            char guess = scanner.next().charAt(0); // 사용자로부터 알파벳을 입력받음
            boolean found = false; // 추측한 알파벳이 단어 안에 있는지 여부를 저장하는 변수

            // 입력된 알파벳이 단어에 포함되어 있는지 확인하고, 추측한 단어에 반영
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == guess) { // 단어 안에 추측한 알파벳이 있다면
                    guessedWord[i] = guess; // 추측한 단어에 해당 알파벳을 반영
                    found = true; // 찾았음을 표시
                }
            }

            if (!found) { // 추측한 알파벳이 단어 안에 없다면
                attempts++; // 시도 횟수 증가
                System.out.println("틀렸습니다. 남은 시도 횟수: " + (maxAttempts - attempts));
            }

            if (wordToGuess.equals(String.valueOf(guessedWord))) { // 추측한 단어가 정답과 일치하는지 확인
                wordGuessed = true; // 정답을 맞혔음을 표시
                System.out.println("축하합니다! 정답은 '" + wordToGuess + "'입니다.");
            }
        }

        if (!wordGuessed) { // 단어를 맞히지 못한 경우
            System.out.println("게임 오버! 정답은 '" + wordToGuess + "'입니다.");
        }

        scanner.close(); // Scanner 닫기
    }
}
