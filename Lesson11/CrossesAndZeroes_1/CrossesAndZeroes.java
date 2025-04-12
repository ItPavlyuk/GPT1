package G.Lesson11.CrossesAndZeroes_1;

import java.util.Scanner;

public class CrossesAndZeroes {
    public boolean zero;
    public boolean cross;
    public boolean n1, n2, n3, n4, n5, n6, n7, n8, n9 = false;
    public int[] nums_m;
    public int[][] matrix;

    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    public CrossesAndZeroes() {
        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        nums_m = new int[9];
        nums_m[0] = matrix[0][0];
        nums_m[1] = matrix[0][1];
        nums_m[2] = matrix[0][2];
        nums_m[3] = matrix[1][0];
        nums_m[4] = matrix[1][1];
        nums_m[5] = matrix[1][2];
        nums_m[6] = matrix[2][0];
        nums_m[7] = matrix[2][1];
        nums_m[8] = matrix[2][2];

        switch (num) {
            case 1:
                boolean n1 = true;
                nums_m[0] = Integer.parseInt(null);
                System.out.println("Отлично! следующий ход");
                break;
            case 2:
                boolean n2 = true;
                nums_m[1]=Integer.parseInt(null);
                System.out.println("Отлично! следующий ход");
            case 3:
                boolean n3 = true;
                nums_m[2] = Integer.parseInt(null);
                System.out.println("Отлично! следующий ход");
                break;
            case 4:
                boolean n4 = true;
                nums_m[3]=Integer.parseInt(null);
                System.out.println("Отлично! следующий ход");
            case 5:
                boolean n5 = true;
                nums_m[4]=Integer.parseInt(null);
                System.out.println("Отлично! следующий ход");
            case 6:
                boolean n6 = true;
                nums_m[0] = Integer.parseInt(null);
                System.out.println("Отлично! следующий ход");
                break;
            case 7:
                boolean n7 = true;
                nums_m[1]=Integer.parseInt(null);
                System.out.println("Отлично! следующий ход");
            case 8:
                boolean n8 = true;
                nums_m[2] = Integer.parseInt(null);
                System.out.println("Отлично! следующий ход");
                break;
            case 9:
                boolean n9 = true;
                nums_m[3]=Integer.parseInt(null);
                System.out.println("Отлично! следующий ход");
        }
    }
}
