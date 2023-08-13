import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        if (scan.hasNextInt()) {
            int n = scan.nextInt();
            if (n > 0) {
                int[][] matrix = new int[n][n];
                System.out.println("Введите размерность матрицы");
                if(scan.hasNextInt()) {
                    for (int i = 0; i < n; i++) {
                        if (scan.hasNextInt()) {
                            for (int j = 0; j < n; j++) {
                                matrix[i][j] = scan.nextInt();
                            }
                        }
                        else {
                            System.out.println("Ошибка: введите число типа int");
                            return;
                        }
                    }
                }
                else {
                    System.out.println("Ошибка: введите число типа int");
                    return;
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i + j >= n) {
                            matrix[i][j] = matrix[n - 1 - j][n - 1 - i];
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Ошибка: введите размерность больше 0");
            }
        } else {
            System.out.println("Ошибка: введите число типа int");
        }
    }
}
