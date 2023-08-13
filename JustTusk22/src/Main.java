import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 4 числа");
        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            int num2 = scan.nextInt();
            int num3 = scan.nextInt();
            int num4 = scan.nextInt();
            System.out.println(minimal(num, num2, num3, num4));
        } else {
            System.out.println("Ошибка: вы не число типа int");
        }
    }

    public static int minimal(int num, int num2, int num3, int num4) {
        int min = Math.min(num, num2);
        int min2 = Math.min(num3, num4);
        int overMin = Math.min(min, min2);
        return overMin;
    }
}
