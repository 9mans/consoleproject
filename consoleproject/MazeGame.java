package consoleproject;

import java.util.Scanner;

public class MazeGame {

    public static void main(String[] args) {
        char[][] maze = {
                {'S', '#', '#', '#', '#'},
                {' ', ' ', '#', '#', '#'},
                {'#', ' ', ' ', ' ', 'E'},
                {'#', '#', '#', '#', '#'}
        };

        int playerRow = 0;
        int playerCol = 0;
        boolean gameOver = false;

        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            // 미로 출력
            for (char[] row : maze) {
                for (char cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }

            System.out.print("이동 방향을 선택하세요 (위: W, 아래: S, 왼쪽: A, 오른쪽: D): ");
            char move = scanner.next().charAt(0);

            switch (move) {
                case 'W':
                    if (playerRow > 0 && maze[playerRow - 1][playerCol] != '#') {
                        maze[playerRow][playerCol] = ' ';
                        playerRow--;
                    }
                    break;
                case 'S':
                    if (playerRow < maze.length - 1 && maze[playerRow + 1][playerCol] != '#') {
                        maze[playerRow][playerCol] = ' ';
                        playerRow++;
                    }
                    break;
                case 'A':
                    if (playerCol > 0 && maze[playerRow][playerCol - 1] != '#') {
                        maze[playerRow][playerCol] = ' ';
                        playerCol--;
                    }
                    break;
                case 'D':
                    if (playerCol < maze[0].length - 1 && maze[playerRow][playerCol + 1] != '#') {
                        maze[playerRow][playerCol] = ' ';
                        playerCol++;
                    }
                    break;
                default:
                    System.out.println("올바른 방향을 선택하세요!");
                    break;
            }

            if (maze[playerRow][playerCol] == 'E') {
                System.out.println("미로를 탈출했습니다! 게임 종료.");
                gameOver = true;
            }
        }

        scanner.close();
    }
}
