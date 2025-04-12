package G.Lesson11.GPT_Example;

import java.util.Scanner;

public class CrossesAndZeroes {

    public static final int EMPTY = 0;
    public static final int CROSS = 1;
    public static final int ZERO = 2;

    private int[][] board = new int[3][3]; // Игровое поле (матрица)
    private Scanner scanner = new Scanner(System.in);

    public void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public int makeMove(int player, int row, int col) {
        if (row < 0 || row > 2 || col < 0 ||  col > 2 || board[row][col] != EMPTY) {
            System.out.println("Некорректный ход! Попробуйте еще раз.");
            return -1; // Обозначаем, что ход не удался
        } else {
            board[row][col] = player;
            return 0; // Обозначаем, что ход удался
        }
    }

    //TODO: реализовать проверку победителя
    public int checkWinner() {
        return 0;
    }

    public static void main(String[] args) {
        CrossesAndZeroes game = new CrossesAndZeroes();
        Scanner scanner = new Scanner(System.in);
        int currentPlayer = CROSS; // Начинают крестики

        while (true) {
            game.printBoard();
            System.out.println("Ходит игрок " + (currentPlayer == CROSS ? "Крестики" : "Нолики") + ". Введите номер позиции (1-9):");
            int move = scanner.nextInt();

            if (move < 1 || move > 9) {
                System.out.println("Некорректный ввод! Введите число от 1 до 9.");
                continue; // Начинаем следующую итерацию цикла
            }

            int row = (move - 1) / 3;
            int col = (move - 1) % 3;

            int moveResult = game.makeMove(currentPlayer, row, col);
            if (moveResult == 0) { // Если ход удался
                // Смена игрока
                currentPlayer = (currentPlayer == CROSS) ? ZERO : CROSS;
            } else {
                // Ход не удался, игрок ходит снова
                continue;
            }

            //TODO: Проверка победителя
            int winner = game.checkWinner();
            if (winner != 0) {
                System.out.println("Победил игрок " + winner);
                break;
            }
        }
    }
}

