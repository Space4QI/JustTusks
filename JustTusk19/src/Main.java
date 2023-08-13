import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        System.out.println("Введите целое число(-a) (или 'Stop' для завершения): ");
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                int num = scan.nextInt();
                if (num > 0) {
                    if (num > 0 & num % 2 != 0) {
                        sum1 += num;
                    } else if (num > 0 & num % 2 == 0) {
                        sum2 += num;
                    }
                } else {
                    System.out.println("Number is negative or zero");
                }
            } else {
                String input = scan.next().toLowerCase();
                if (input.equals("stop")) {
                    break;
                } else {
                    System.out.println("Ошибка: вы ввели не число типа int");
                }
            }
        }

        System.out.println("Sum of all prime numbers is " + sum1);
        System.out.println("Sum of all non-prime numbers is: " + sum2);
    }
}
