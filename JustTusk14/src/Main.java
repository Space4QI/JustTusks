import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число чисел n");
        if(scan.hasNextInt()) {
            int n = scan.nextInt();
            int min = 400000000;
            System.out.println("Введите сами числа");
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                if (num < min) {
                    min = num;
                }
            }
            System.out.println(min);
        }
        else {
            System.out.println("Ошибка: вы ввели не число типа int");
        }
    }
}