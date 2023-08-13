import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        if (scan.hasNextInt()) {
            int n = scan.nextInt();
            if (n > 0) {
                int[][] matrix = new int[n][n];
                System.out.println("Введите элементы матрицы:");
                if(scan.hasNextInt()) {
                    for (int i = 0; i < n; i++) {
                        if(scan.hasNextInt()) {
                            for (int j = 0; j < n; j++) {
                                matrix[i][j] = scan.nextInt();
                            }
                        }
                        else {
                            System.out.println("Ошибка: вы ввели не число(-a) типа int");
                        }
                    }
                }
                else {
                    System.out.println("Ошибка: вы ввели не число(-a) типа int");
                }
                int determinant = calculateDeterminant(matrix, n);
                System.out.println("Определитель матрицы: " + determinant);
            }
            else {
                System.out.println("Ошибка: введите размерность матрицы больше 0");
            }
        }
        else {
            System.out.println("Ошибка: вы ввели не число типа int");
        }
    }
    public static int calculateDeterminant(int[][] matrix, int n) {
        int det = 0;
        if (n == 1) {
            det = matrix[0][0];
        } else if (n == 2) {
            det = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            for (int i = 0; i < n; i++) {
                int[][] submatrix = new int[n - 1][n - 1];
                for (int j = 1; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (k < i) {
                            submatrix[j - 1][k] = matrix[j][k];
                        } else if (k > i) {
                            submatrix[j - 1][k - 1] = matrix[j][k];
                        }
                    }
                }
                det += matrix[0][i] * (int)Math.pow(-1, i) * calculateDeterminant(submatrix, n - 1);
            }
        }
        return det;
    }
}
