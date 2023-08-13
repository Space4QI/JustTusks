import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        if (scan.hasNextInt()) {
            int rows = scan.nextInt();
            System.out.println("Введите количество столбцов: ");
            if (scan.hasNextInt()) {
                int columns = scan.nextInt();
                int[][] array = new int[rows][columns];
                System.out.println("Введите элементы двумерного массива:");
                if(scan.hasNextInt()) {
                    for (int i = 0; i < rows; i++) {
                        if (scan.hasNextInt()) {
                            for (int j = 0; j < columns; j++) {
                                array[i][j] = scan.nextInt();
                            }
                        }
                        else {
                            System.out.println("Ошибка: вы ввели не число типа int");
                        }
                    }
                }
                else{
                    System.out.println("Ошибка: вы ввели не число типа int");
                }
                System.out.println("Введенный массив:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
                int max = array[0][0];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        if (array[i][j] > max) {
                            max = array[i][j];
                        }
                    }
                }
                System.out.println("Максимальный элемент массива: " + max);
            }
            else {
                System.out.println("Ошибка: вы ввели не число типа int");
            }
        }
        else {
        System.out.println("Ошибка: вы ввели не число типа int");
        }
    }
}

