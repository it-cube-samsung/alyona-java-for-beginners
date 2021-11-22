package simpletictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter cells:");
        Scanner scan = new Scanner(System.in);
        char[][] board = new char[3][3];
        char X = 'X';
        char O = 'O';
        char empty = '_';

        String one = scan.next();

        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int index = j + i * 3;
                board[i][j] = one.charAt(index);
            }
        }
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
//        for (int i = 0; i < 3; i++) {
//            int startIndex = i * 3;
//            System.out.println("| " + one.charAt(startIndex) + " " + one.charAt(startIndex + 1) + " " + one.charAt(startIndex + 2) + " |");
//        }
//
        System.out.println("---------");
        boolean isWinX = false;
        boolean isWinO = false;
        boolean isEnd = true;

        if (
                (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] == X) ||
                        (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == X) ||
                        (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] == X) ||
                        (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] == X) ||
                        (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] == X) ||
                        (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] == X) ||
                        (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] == X)

        ) {
            isWinX = true;
        }

        if (
                (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] == O ) ||
                        (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] == O) ||
                        (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] == O) ||
                        (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] == O) ||
                        (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] ==O ) ||
                        (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] == O) ||
                        (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] == O)


        ) {
            isWinO = true;
        }
//        board[0][0] == empty || board[0][1] == empty
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == empty) {
                    isEnd = false;
                }
            }
        }

        if (isWinX && isWinO) {
            System.out.println("Impossible");
        } else if (isWinX) {
            System.out.println(X + " win");
        } else if (isWinO) {
            System.out.println(O + " win");
        } else if (isEnd) {
            System.out.println("End");
        } else {
            System.out.println("Game not finished");
        }
        System.out.println("Enter the coordinates: ");
    }
}

