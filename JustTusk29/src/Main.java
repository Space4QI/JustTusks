import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во вагонов");
        if (scan.hasNextInt()) {
            int n = scan.nextInt();
            int[][] trains = new int[n][4];
            System.out.println("Введите номер поезда, номер вагона, количество мест в \n" +
                    "вагоне, количество пассажиров");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 4; j++) {
                    if (scan.hasNextInt()) {
                        trains[i][j] = scan.nextInt();
                    } else {
                        System.out.println("Ошибка: вы ввели не число(-a) типа int");
                        return;
                    }
                }
            }
            System.out.println("Введите номер вагона");
            if (scan.hasNextInt()) {
                int m = scan.nextInt();
                for (int i = 0; i < m; i++) {
                    if (scan.hasNextInt()) {
                        int targetTrain = scan.nextInt();
                        int totalPassengers = 0;

                        for (int j = 0; j < n; j++) {
                            if (trains[j][0] == targetTrain) {
                                totalPassengers += trains[j][3];
                            }
                        }

                        if (totalPassengers > 0) {
                            System.out.println(totalPassengers);
                        } else {
                            System.out.println("error");
                            return;
                        }
                    } else {
                        System.out.println("Ошибка: вы ввели не число типа int");
                        return;
                    }
                }
            } else {
                System.out.println("Ошибка: вы ввели не число типа int");
            }
        } else {
            System.out.println("Ошибка: вы ввели не число типа int");
        }
    }
}
