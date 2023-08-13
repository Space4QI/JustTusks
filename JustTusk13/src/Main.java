import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число чисел n");
        if(scan.hasNextInt()) {
            int n = scan.nextInt();
            System.out.println("Введите сами числа");
            int min = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                if (num < min) {
                    min = num;
                } else if (num > max) {
                    max = num;
                }
            }
            System.out.println(max);
        }
        else {
            System.out.println("Ошибка: вы ввели не число типа int");
        }
    }
}