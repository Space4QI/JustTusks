import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите элементы");
        String input = scan.nextLine();
        String[] array = input.split(" ");
        int[] arrayNumeric = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayNumeric[i] = Integer.parseInt(array[i]);
        }
        int n = arrayNumeric.length;
        int[] largest = new int[n];
        int max = arrayNumeric[n - 1];
        int j = n - 1;
        largest[j] = max;
        for (int i = n - 2; i >= 0; i--) {
            if (arrayNumeric[i] > max) {
                max = arrayNumeric[i];
                j--;
                largest[j] = max;
            }
        }
        System.out.println("Верхние числа:");
        for (int k = j; k < n; k++) {
            System.out.print(largest[k] + " ");
        }
    }
}
