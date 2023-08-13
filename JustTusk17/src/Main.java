import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во пар");
        if (scan.hasNextInt()) {
            int n = scan.nextInt();
            if (n > 1) {
                int prevSum = 0;
                int maxDiff = 0;
                boolean allEqual = true;

                for (int i = 0; i < n; i++) {
                    if (scan.hasNextInt()) {
                        int a = scan.nextInt();
                        if (scan.hasNextInt()) {
                            int b = scan.nextInt();
                            int currentSum = a + b;
                            if (i > 0 && currentSum != prevSum) {
                                allEqual = false;
                                int diff = Math.abs(currentSum - prevSum);
                                if (diff > maxDiff) {
                                    maxDiff = diff;
                                }
                            }
                            prevSum = currentSum;
                        }
                        else {
                            System.out.println("Ошибка: введите число(-а) типа int");
                            return;
                        }
                    }
                    else {
                        System.out.println("Ошибка: введите число(-а) типа int");
                        return;
                    }
                }
                if (allEqual) {
                    System.out.println("Yes, value = " + prevSum);
                }
                else {
                    System.out.println("No, maxdiff = " + maxDiff);
                }
            }
            else {
                System.out.println("Ошибка: введите кол-во пар больше 1");
            }
        }
        else {
            System.out.println("Ошибка: введите число(-а) типа int");
        }
    }
}
